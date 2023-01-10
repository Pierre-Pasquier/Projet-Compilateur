package ast;

import java.util.List;


public class SupEq implements Ast {
    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast sup;
    
    public Ast left;
    public Ast right;

    public SupEq(Ast left, Ast right){
        this.left = left;
        this.right = right;
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
