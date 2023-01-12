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
<<<<<<< HEAD
        List<String> r = right.ControleSemantique();
        List<String> l = left.ControleSemantique();
        if (!l.get(0).equals(r.get(0)) && !l.get(0).equals("") && !r.get(0).equals("")){
            System.out.println("r : " + r + "      l : " + l + "------------------------------------------");
            TDS.write("Erreur ligne " + line + " : les deux opérandes de l'égalité doivent être de même type");
            list.add("");
        } else {
            list.add("int");
=======
        list.addAll(left.ControleSemantique());
        list.addAll(right.ControleSemantique());

        if (left.ControleSemantique().get(0).equals("")){
            list.add(right.ControleSemantique().get(0));
        } else if (right.ControleSemantique().get(0).equals("")){
            list.add(left.ControleSemantique().get(0));
        } else if (left.ControleSemantique().get(0) != right.ControleSemantique().get(0)){
            TDS.write("Erreur ligne " + line + " : les deux opérandes doivent être de même type");
            //System.out.println("PAS EGAL ");
            list.add("");
        }else{
            list.add(left.ControleSemantique().get(0));
>>>>>>> 08549a324b5bdddb8b74c2d789cf224a4e9b3562
        }
        return list;
    }

}