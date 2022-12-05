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
import ast.Program;


import ast.Ifthenelse;
import ast.Declarationlists;
import ast.For;
import ast.Exprtiret;
import ast.Lvalues;
import ast.Nilop;
import ast.Ops;
import ast.Parenthesis;
import ast.Plus;
import ast.Printe;
import ast.Printis;
import ast.Typeids;
import ast.While;



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
   
//-----------------------------------------------------------------------------------------------------------------------------------------

    @Override
        public String visit(Plus plus) {

            String nodeIdentifier = this.nextState();

            String leftState = plus.left.accept(this);
            String rightState = plus.right.accept(this);

            this.addNode(nodeIdentifier, "+");
            
            this.addTransition(nodeIdentifier, leftState);
            this.addTransition(nodeIdentifier, rightState);

            return nodeIdentifier;

        }

    @Override
        public String visit(Minus minus) {

            String nodeIdentifier = this.nextState();

            String leftState = minus.left.accept(this);
            String rightState = minus.right.accept(this);

            this.addNode(nodeIdentifier, "-");
            
            this.addTransition(nodeIdentifier, leftState);
            this.addTransition(nodeIdentifier, rightState);

            return nodeIdentifier;

        }

    @Override
        public String visit(And and) {

            String nodeIdentifier = this.nextState();

            String leftState = and.left.accept(this);
            String rightState = and.right.accept(this);

            this.addNode(nodeIdentifier, "and");
            
            this.addTransition(nodeIdentifier, leftState);
            this.addTransition(nodeIdentifier, rightState);

            return nodeIdentifier;

        }

    @Override
    public String visit(Mult mult) {

        String nodeIdentifier = this.nextState();

        String leftState = mult.left.accept(this);
        String rightState = mult.right.accept(this);

        this.addNode(nodeIdentifier, "*");
        
        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;

    }

    @Override
    public String visit(Div div) {

        String nodeIdentifier = this.nextState();

        String leftState = div.left.accept(this);
        String rightState = div.right.accept(this);

        this.addNode(nodeIdentifier, "/");
        
        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;

    }

    @Override
    public String visit(Comp comp) {

        String nodeIdentifier = this.nextState();

        String leftState = comp.left.accept(this);
        String rightState = comp.right.accept(this);

        this.addNode(nodeIdentifier, "*");
        
        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;

    }
        

//-----------------------------------------------------------------------------------------------------------------------------------------
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




    @Override
    public String visit(Exprtiret exprtiret) {

        String nodeIdentifier = this.nextState();

        String expr_state= exprtiret.expr_.accept(this);

        this.addNode(nodeIdentifier, "Exprtiret");

        this.addTransition(nodeIdentifier, expr_state);

        return nodeIdentifier;

    }


    @Override
    public String visit(Nilop nil_op) {
        
        String nodeIdentifier = this.nextState();

        String  nilopstate = nil_op.nilop.accept(this);

        this.addNode(nodeIdentifier, "Nilop");

        this.addTransition(nodeIdentifier, nilopstate);

        return nodeIdentifier;

    }

    
    @Override
    public String visit(Typeids typeids) {
        
        String nodeIdentifier = this.nextState();

        String typeids1State = typeids.typeids1.accept(this);
        String fieldlist1State = typeids.fieldlist1.accept(this);
        String typeids2State = typeids.typeids2.accept(this);
        String expr1State = typeids.expr1.accept(this);
        String expr2State = typeids.expr2.accept(this);

        this.addNode(nodeIdentifier, "Typeids");

        this.addTransition(nodeIdentifier, typeids1State);
        this.addTransition(nodeIdentifier, fieldlist1State);
        this.addTransition(nodeIdentifier, typeids2State);
        this.addTransition(nodeIdentifier, expr1State);
        this.addTransition(nodeIdentifier, expr2State);

        return nodeIdentifier;

    }


    @Override
    public String visit(Ops ops) {
        
        String nodeIdentifier = this.nextState();

        String opState = ops.op.accept(this);

        this.addNode(nodeIdentifier, "Ops");

        this.addTransition(nodeIdentifier, opState);

        return nodeIdentifier;

    }

    
    @Override
    public String visit(Parenthesis parenthesis) {
        
        String nodeIdentifier = this.nextState();

        String parenthesisState = parenthesis.parenthesis.accept(this);

        this.addNode(nodeIdentifier, "Parenthesis");

        this.addTransition(nodeIdentifier, parenthesisState);

        return nodeIdentifier;

    }

    @Override
    public String visit(While while1) {
        
        String nodeIdentifier = this.nextState();

        String conditionState = while1.condition.accept(this);
        String faireState = while1.faire.accept(this);

        this.addNode(nodeIdentifier, "While");

        this.addTransition(nodeIdentifier, conditionState);
        this.addTransition(nodeIdentifier, faireState);

        return nodeIdentifier;

    }
   
    @Override
    public String visit(For for1) {
        
        String nodeIdentifier = this.nextState();

        String debState = for1.deb.accept(this);
        String finState = for1.fin.accept(this);
        String faireState = for1.faire.accept(this);
        String idfState = for1.idf.accept(this);

        this.addNode(nodeIdentifier, "For");

        this.addTransition(nodeIdentifier, debState);
        this.addTransition(nodeIdentifier, finState);
        this.addTransition(nodeIdentifier, faireState);
        this.addTransition(nodeIdentifier, idfState);


        return nodeIdentifier;

    }


    @Override
    public String visit(Declarationlists declarationlists) {
        
        String nodeIdentifier = this.nextState();

        String affectState = declarationlists.affect.accept(this);
        String dansState = declarationlists.dans.accept(this);
        
        this.addNode(nodeIdentifier, "Declarationlists");

        this.addTransition(nodeIdentifier, affectState);
        this.addTransition(nodeIdentifier, dansState);

        return nodeIdentifier;

    }


    @Override
    public String visit(Printis printis) {
        
        String nodeIdentifier = this.nextState();

        String printisState = printis.printis.accept(this);

        this.addNode(nodeIdentifier, "Printis");

        this.addTransition(nodeIdentifier, printisState);

        return nodeIdentifier;

    }


    @Override
    public String visit(Printe printe) {
        
        String nodeIdentifier = this.nextState();

        String printeState = printe.printe.accept(this);

        this.addNode(nodeIdentifier, "Printe");

        this.addTransition(nodeIdentifier, printeState);

        return nodeIdentifier;

    }


    @Override
    public String visit(Ifthenelse ifthenelse) {
        
        String nodeIdentifier = this.nextState();

        String conditionState = ifthenelse.condition.accept(this);
        String alorsState = ifthenelse.alors.accept(this);
        String ouOccasionnelState = ifthenelse.ouOccasionnel.accept(this);

        this.addNode(nodeIdentifier, "Ifthenelse");

        this.addTransition(nodeIdentifier, conditionState);
        this.addTransition(nodeIdentifier, alorsState);
        this.addTransition(nodeIdentifier, ouOccasionnelState);


        return nodeIdentifier;

    }


    @Override
    public String visit(Lvalues lvalues) {
        
        String nodeIdentifier = this.nextState();

        String lvalueState = lvalues.lvalue.accept(this);
        String listexpressionState = lvalues.listexpression.accept(this);

        this.addNode(nodeIdentifier, "Lvalues");

        this.addTransition(nodeIdentifier, lvalueState);
        this.addTransition(nodeIdentifier, listexpressionState);


        return nodeIdentifier;

    }

    @Override
    public String visit(Program program) {

        String nodeIdentifier = this.nextState();

        String expressionState =program.expression.accept(this);

        this.addNode(nodeIdentifier, "Program");
        this.addTransition(nodeIdentifier, expressionState);

        return nodeIdentifier;

    }

}
