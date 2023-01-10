package ast;

import java.util.List;


public class VariableDeclaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public Ast expr;
    public int line;

    public VariableDeclaration(Ast Idf, Ast expr, Ast typeid,int line){
        this.line = line;
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
    }

    public VariableDeclaration(Ast Idf, Ast expr){
        this.Idf = Idf;
        this.expr = expr;
    }

  
    @Override
    public List<String> ControleSemantique() {
        typeid.ControleSemantique();
        Idf.ControleSemantique();
        expr.ControleSemantique();
        return null;
        
    }


}
