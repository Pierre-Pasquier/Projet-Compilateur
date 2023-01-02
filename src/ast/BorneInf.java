package ast;

public class BorneInf implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast deb;
    public BorneInf(Ast deb){
        this.deb=deb;
    }
}
