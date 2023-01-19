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
        List<String> r = right.ControleSemantique();
        List<String> l = left.ControleSemantique();
        if (l.get(0).equals("")){
            list.add(r.get(0));
        } else if (r.get(0).equals("")){
            list.add(l.get(0));
        } else if (!l.get(0).equals("int") || !r.get(0).equals("int")){
            System.out.println("Erreur ligne " + line + " : les deux opérandes de la différence doivent être de type int");
            TDS.write("Erreur ligne " + line + " : les deux opérandes de la différence doivent être de type int");
            list.add("");
        } else {
            list.add(l.get(0));
        }

        return list;
    }

}