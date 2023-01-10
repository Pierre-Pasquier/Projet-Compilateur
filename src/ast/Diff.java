package ast;

import java.util.List;

public class Diff implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;

    public Diff(Ast left, Ast right){
        this.left=left;
        this.right=right;
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}