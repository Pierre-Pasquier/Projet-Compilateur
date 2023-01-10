package ast;

import java.util.ArrayList;
import java.util.List;

public class Mult implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int line;

    public Mult(Ast left, Ast right,int line){
        this.line = line;
        this.left=left;
        this.right=right;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        list.addAll(left.ControleSemantique());
        list.addAll(right.ControleSemantique());
        return list;
        
    }

}