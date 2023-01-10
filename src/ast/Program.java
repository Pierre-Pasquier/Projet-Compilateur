package ast;

import java.util.List;


public class Program implements Ast {

    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expression;
    public int line;

    public Program(Ast expr,int line) {
        this.line = line;
        this.expression = expr;
    }

    public List<String> ControleSemantique() {
        System.out.println("Controle sémantique Program --------------- ");
        this.expression.ControleSemantique();
        return null;
    }

}
