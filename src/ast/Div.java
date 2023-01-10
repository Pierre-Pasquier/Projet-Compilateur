package ast;

import java.util.ArrayList;
import java.util.List;

public class Div implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int line;

    public Div(Ast left, Ast right,int line){
        this.line = line;
        this.left=left;
        this.right=right;
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub


        List<String> dive=new ArrayList<>();
        dive.addAll(left.ControleSemantique());
        dive.addAll(right.ControleSemantique());

        return null;
        
    }

}