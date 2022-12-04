package ast;

public class Ifthenelse implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast condition;
    public Ast alors;
    public Ast ouOccasionnel;


    public Ifthenelse(Ast condition,Ast alors,Ast ouOccasionnel){
        this.condition=condition;
        this.alors=alors;
        this.ouOccasionnel=ouOccasionnel;
    }


    public Ifthenelse(Ast condition,Ast alors){
        this.condition=condition;
        this.alors=alors;
    }

}