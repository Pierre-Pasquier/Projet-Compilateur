package ast;

import java.util.ArrayList;
import java.util.List;


public class SupEq implements Ast {
    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public Ast sup;
    public int line;
    
    public Ast left;
    public Ast right;

    public SupEq(Ast left, Ast right,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.left = left;
        this.right = right;
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
        } else if (!l.get(0).equals(r.get(0))){
            System.out.println("Erreur ligne " + line + " : on ne peut pas comparer un "+ l.get(0) + " avec un " + r.get(0) + " avec l'opérateur \">=\"");
            TDS.write("Erreur ligne " + line + " : on ne peut pas comparer un "+ l.get(0) + " avec un " + r.get(0) + " avec l'opérateur \">=\"");
            list.add("");
        } else {
            list.add(l.get(0));
        }
        return list;
    }

    }



