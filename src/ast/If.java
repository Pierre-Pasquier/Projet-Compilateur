package ast;

public class If implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast condition;
    public If(Ast condition){
        this.condition=condition;
    }
    @Override
    public void ControleSemantique() {
        condition.ControleSemantique();
        
    }

}
