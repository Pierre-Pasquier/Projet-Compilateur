package ast;

public class Else implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast ouOccasionnel;
    public Else(Ast ouOccasionnel){
        this.ouOccasionnel=ouOccasionnel;
    }
}
