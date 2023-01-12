package ast;

import java.util.List;


public class Program implements Ast {

    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expression;
    public int line;
    public List<List> tds;

    public Program(Ast expr,int line, int num_region, int num_imbrication, List<List> tds) {
        this.line = line;
        this.expression = expr;
        this.tds = tds;
    }

    public List<String> ControleSemantique() {
        System.out.println(("Test : " + TDS.getType("c",tds)));
        TDS.setwrite();
        expression.ControleSemantique();
        TDS.closewrite();
        return null;
    }

}
