package ast;

public class BorneSup implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast fin;
    public BorneSup(Ast fin){
        this.fin=fin;
    }
}
