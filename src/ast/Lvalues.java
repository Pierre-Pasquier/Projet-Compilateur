package ast;

import java.util.ArrayList;
import java.util.List;

public class Lvalues implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast lvalue;
    public Ast listexpression;
    public int line;
    public List<List> tds;


    public Lvalues(Ast lvalue,Ast listexpression,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.lvalue=lvalue;
        this.listexpression=listexpression;
        this.tds = tds;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        String fonction = lvalue.ControleSemantique().get(1);
        if (listexpression instanceof ExprList){
            List<String> listexpr = listexpression.ControleSemantique(); //liste des arguments
            if (TDS.getType(fonction, tds) == null){
                TDS.write("Erreur ligne " + line + " : la fonction " + fonction + " n'est pas définie");
                list.add("");
            } else {
                list.add(TDS.getType(fonction, tds));
                System.out.println(fonction + "---------------- " + TDS.getType(fonction, tds));
                int nb_fils = listexpr.size()/2;
                int bon_nb_fils = TDS.getNbFils(fonction,TDS.tds);
                if (bon_nb_fils != nb_fils){
                    TDS.write("Erreur ligne " + line + " : nombre d'arguments incorrects pour la fonction " + fonction + ", expected " + bon_nb_fils + ", got : " + nb_fils);
                }
            }
        } else if (listexpression == null){
            list.addAll(lvalue.ControleSemantique());
        } else {
            list.add("void");
        }
        
        System.out.println("Dans Lvalues : " + list);
        return list;
        
    }




}