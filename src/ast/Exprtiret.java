package ast;

public class Exprtiret  implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expr_;


    public Exprtiret(Ast expr){
        this.expr_ = expr;
    }
}