package ast;

import java.util.ArrayList;
import java.util.List;

public class Diff implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int line;

    public Diff(Ast left, Ast right,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.left=left;
        this.right=right;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        list.addAll(left.ControleSemantique());
        list.addAll(right.ControleSemantique());
        list.add("");
        return list;
        
    }

}