package ast;

import java.util.List;


public class SupEq implements Ast {
    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast sup;
    public int line;
    
    public Ast left;
    public Ast right;

    public SupEq(Ast left, Ast right,int line){
        this.line = line;
        this.left = left;
        this.right = right;
    }


    @Override
    public List<String> ControleSemantique() {
        left.ControleSemantique();
        right.ControleSemantique();
        return null;
        
    }


}
