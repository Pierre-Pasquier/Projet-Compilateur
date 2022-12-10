package ast;

public class Ifthen implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast condition;
    public Ast alors;
    
    public Ifthen(Ast condition,Ast alors){
        this.condition=condition;
        this.alors=alors;
    }
}
