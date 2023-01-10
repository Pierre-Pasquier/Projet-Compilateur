package ast;

public class Do implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast faire;
    public Do(Ast faire){
        this.faire=faire;
    }
    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
