package ast;

import java.util.List;

public class FunctionDeclaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public Ast expr;
    public Ast typefields;
    public int line;

    public FunctionDeclaration(Ast Idf, Ast typefields, Ast expr, Ast typeid,int line){
        this.line = line;
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
        this.typefields = typefields;
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }


    


}
