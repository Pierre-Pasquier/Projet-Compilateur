package ast;

public class Ops implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast op;


    public Ops(Ast op){
        this.op = op;
    }
}
