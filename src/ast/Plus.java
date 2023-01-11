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
        List<String> list = new ArrayList<>();
        list.add(left.ControleSemantique().get(0) + "+" + right.ControleSemantique().get(0));
        return list;
        
    }

}