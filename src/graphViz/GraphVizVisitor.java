package graphViz;

import java.io.FileOutputStream;
import java.io.IOException;

import ast.Ast;
import ast.AstVisitor;
import ast.Idf;
import ast.DeclarationList;
import ast.ExprList;
import ast.ExprSeq;
import ast.FieldList;
import ast.FunctionDeclaration;
import ast.IdfExprList;
import ast.IdfList;
import ast.TypeDeclaration;
import ast.TypeField;
import ast.TypeFieldList;
import ast.VariableDeclaration;


public class GraphVizVisitor implements AstVisitor<String> {

    private int state;
    private String nodeBuffer;
    private String linkBuffer;

    public GraphVizVisitor(){
        this.state = 0;
        this.nodeBuffer = "digraph \"ast\"{\n\n\tnodesep=1;\n\tranksep=1;\n\n";
        this.linkBuffer = "\n";
    }

    public void dumpGraph(String filepath) throws IOException{
            
        FileOutputStream output = new FileOutputStream(filepath);

        String buffer = this.nodeBuffer + this.linkBuffer;
        byte[] strToBytes = buffer.getBytes();

        output.write(strToBytes);

        output.close();

    }


    private String nextState(){
        int returnedState = this.state;
        this.state++;
        return "N"+ returnedState;
    }

    private void addTransition(String from,String dest){
        this.linkBuffer += String.format("\t%s -> %s; \n", from,dest);

    }

    private void addNode(String node,String label){
        this.nodeBuffer += String.format("\t%s [label=\"%s\", shape=\"box\"];\n", node,label);

    }
   


    @Override
    public String visit(Idf idf) {

        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, idf.name);

        return nodeIdentifier;

    }

    @Override
    public String visit(ExprSeq exprseq) {
        
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "ExprSeq");

        for (Ast ast:exprseq.ExprSeq){

            String astState = ast.accept(this);
            this.addTransition(nodeIdentifier, astState);

        }

        return nodeIdentifier;

    }



    @Override
    public String visit(ExprList exprList) {
        
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "ExprList");

        for (Ast ast:exprList.ExprList){

            String astState = ast.accept(this);
            this.addTransition(nodeIdentifier, astState);

        }

        return nodeIdentifier;

    }

    @Override
    public String visit(FieldList fieldList) {
        
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "FieldList");

        for (Ast ast:fieldList.FieldList){

            String astState = ast.accept(this);
            this.addTransition(nodeIdentifier, astState);

        }

        return nodeIdentifier;

    }


    public String visit(IdfList idflist) {
           
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "IdfList");

        for (Ast ast:idflist.IdfList){

            String astState = ast.accept(this);
            this.addTransition(nodeIdentifier, astState);

        }

        return nodeIdentifier;

    }



    public String visit(IdfExprList idfexprlist) {
           
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "IdfExprList");

        for (Ast ast:idfexprlist.IdfExprList){

            String astState = ast.accept(this);
            this.addTransition(nodeIdentifier, astState);

        }

        return nodeIdentifier;

    }




    public String visit(DeclarationList declalist) {
           
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "IdfList");

        for (Ast ast:declalist.DeclarationList){

            String astState = ast.accept(this);
            this.addTransition(nodeIdentifier, astState);

        }

        return nodeIdentifier;

    }


    public String visit(TypeDeclaration typedecla) {
           
        String nodeIdentifier = this.nextState();

        String typeidState = typedecla.typeid .accept(this);
        String typeState = typedecla.type.accept(this);

        this.addNode(nodeIdentifier, "TypeDeclaration");

    
        this.addTransition(nodeIdentifier, typeidState);
        this.addTransition(nodeIdentifier, typeState);

        return nodeIdentifier;

    }



    public String visit(TypeFieldList typefield) {
           
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "TypeFieldList");

        for (Ast ast:typefield.typefieldList){

            String astState = ast.accept(this);
            this.addTransition(nodeIdentifier, astState);

        }

        return nodeIdentifier;

    }


    public String visit(TypeField typefield) {
           
        String nodeIdentifier = this.nextState();

        String idfState = typefield.Idf .accept(this);
        String typeidState = typefield.typeid.accept(this);

        this.addNode(nodeIdentifier, "TypeField");

    
        this.addTransition(nodeIdentifier, idfState);
        this.addTransition(nodeIdentifier, typeidState);

        return nodeIdentifier;

    }


    public String visit(VariableDeclaration vardecla) {
           
        String nodeIdentifier = this.nextState();

        String idfState = vardecla.Idf.accept(this);
        String typeidState = vardecla.typeid.accept(this);
        String exprState = vardecla.expr.accept(this);

        
        this.addNode(nodeIdentifier, "VariableDeclaration");

    
        this.addTransition(nodeIdentifier, idfState);
        this.addTransition(nodeIdentifier, typeidState);
        this.addTransition(nodeIdentifier, exprState);

        return nodeIdentifier;

    }



    public String visit(FunctionDeclaration fundecla) {
           
        String nodeIdentifier = this.nextState();

        String idfState = fundecla.Idf.accept(this);
        String typefieldsState = fundecla.typefields.accept(this);
        String typeidState = fundecla.typeid.accept(this);
        String exprState = fundecla.expr.accept(this);

        
        this.addNode(nodeIdentifier, "VariableDeclaration");

    
        this.addTransition(nodeIdentifier, idfState);
        this.addTransition(nodeIdentifier, typefieldsState);
        this.addTransition(nodeIdentifier, typeidState);
        this.addTransition(nodeIdentifier, exprState);

        return nodeIdentifier;

    }

}
