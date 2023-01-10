package ast;

public class Then implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast alors;
    public Then(Ast alors){
        this.alors=alors;
    }
    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
