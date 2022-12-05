package ast;

public class Program implements Ast {

    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expression;

    public Program(Ast expr) {
        this.expression = expr;
    }

}
