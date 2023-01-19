package ast;

import java.util.ArrayList;
import java.util.List;

public class Egal implements Ast {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int line;

    public Egal(Ast left, Ast right,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.left=left;
        this.right=right;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        List<String> r = right.ControleSemantique();
        List<String> l = left.ControleSemantique();
        if (!l.get(0).equals(r.get(0)) && !l.get(0).equals("") && !r.get(0).equals("")){
            System.out.println("Erreur ligne " + line + " : les deux opérandes de l'égalité doivent être de même type");
            TDS.write("Erreur ligne " + line + " : les deux opérandes de l'égalité doivent être de même type");
            list.add("");
        } else {
            list.add("int");
        }
        list.add(line + "");
        return list;
    }

}