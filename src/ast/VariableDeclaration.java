package ast;

public class VariableDeclaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public Ast expr;

    public VariableDeclaration(Ast Idf, Ast typeid, Ast expr){
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
    }

    public VariableDeclaration(Ast Idf, Ast expr){
        this.Idf = Idf;
        this.expr = expr;
    }
}
