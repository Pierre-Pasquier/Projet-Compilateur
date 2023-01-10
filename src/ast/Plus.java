package ast;

import java.util.ArrayList;
import java.util.List;

public class Plus implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int line;

    public Plus(Ast left, Ast right,int line){
        this.line = line;
        this.left = left;
        this.right = right;
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub

        List<String> plus=new ArrayList<>();
        plus.addAll(left.ControleSemantique());
        plus.addAll(right.ControleSemantique());

        return plus;
        
    }

}