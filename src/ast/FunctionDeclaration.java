package ast;

public class FunctionDeclaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public Ast expr;
    public Ast typefields;

    public FunctionDeclaration(Ast Idf, Ast typefields, Ast typeid, Ast expr){
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
        this.typefields = typefields;
    }

    public FunctionDeclaration(Ast Idf, Ast typefields, Ast expr){
        this.Idf = Idf;
        this.typefields = typefields;
        this.expr = expr;
    }
}
