package ast;

import java.util.ArrayList;
import java.util.List;

public class Compare implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int line;

    public Compare(Ast left, Ast right,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.left = left;
        this.right = right;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        List<String> r = right.ControleSemantique();
        List<String> l = left.ControleSemantique();
        if (l.get(0) != r.get(0)){
            TDS.write("Erreur ligne " + line + " : les deux opérandes de la comparaison doivent être de même type");
            list.add("");
        } else {
            list.add("int");
        }
        return list;
    }

}