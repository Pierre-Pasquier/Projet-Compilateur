package ast;

public class Printis implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printis;


    public Printis(Ast printis){
        this.printis = printis;
    }
}

