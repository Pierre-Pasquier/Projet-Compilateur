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
        List<String> fonction = lvalue.ControleSemantique();
        if (listexpression instanceof ExprList){
            List<String> listexpr = listexpression.ControleSemantique(); //liste des arguments
            System.out.println("Liste des arguments de la fonction " + fonction.get(1) + " : " + listexpr);
            if (TDS.getType(fonction.get(1), tds) == null){
                TDS.write("Erreur ligne " + line + " : la fonction " + fonction.get(1) + " n'est pas définie");
                list.add("");
                list.add(line + "");
            } else {
                list.add(TDS.getType(fonction.get(1), tds));
                list.add(line + "");
                System.out.println(fonction.get(1) + "---------------- " + TDS.getType(fonction.get(1), tds));
                int nb_fils = listexpr.size()/2;
                int bon_nb_fils = TDS.getNbFils(fonction.get(1),TDS.tds);
                if (bon_nb_fils != nb_fils){
                    TDS.write("Erreur ligne " + line + " : nombre d'arguments incorrects pour la fonction " + fonction.get(1) + ", expected " + bon_nb_fils + ", got : " + nb_fils);
                }
            }
            for (int i = 0; i < listexpr.size()/2; i++) {
                String type_param = TDS.getTypeParam(fonction.get(1),i, tds);
                System.out.println("fonction : " + fonction.get(1) + " type_param " + i + " : " + type_param + " type_arg : " + listexpr.get(2*i));
                if (!listexpr.get(2*i).equals("") && type_param != null && !type_param.equals(listexpr.get(2*i))){
                    TDS.write("Erreur ligne " + line + " : type incorrect pour l'argument " + (i+1) + " de la fonction " + fonction.get(1) + ", expected " + type_param + ", got : " + listexpr.get(2*i));
                }
            }
        } else if (listexpression == null){
            list.addAll(fonction);
        } else {

            
            list.add("void");
            list.add(line + "");
        }
        System.out.println("Dans Lvalues : " + list);

        return list;
        
    }




}