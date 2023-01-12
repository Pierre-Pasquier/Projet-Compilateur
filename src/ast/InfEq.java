package ast;

import java.util.ArrayList;
import java.util.List;

public class InfEq implements Ast {
    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast sup;
    
    public Ast left;
    public Ast right;
    public int line;

    public InfEq(Ast left, Ast right,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.left = left;
        this.right = right;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();

        if (left.ControleSemantique().get(0).equals("")){
            list.add(right.ControleSemantique().get(0));
        } else if (right.ControleSemantique().get(0).equals("")){
            list.add(left.ControleSemantique().get(0));
        } else if (right.ControleSemantique().get(0).compareTo(left.ControleSemantique().get(0))!=0){
            TDS.write("Erreur ligne " + line + " : les deux opérandes doivent être de même type");
        } else {
            list.add(left.ControleSemantique().get(0));
        }
        System.out.println(right.ControleSemantique());

        System.out.println(left.ControleSemantique());

        return list;
    }


}
