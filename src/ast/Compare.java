package ast;

import java.util.List;

public class Compare implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int line;

    public Compare(Ast left, Ast right,int line){
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