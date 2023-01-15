package ast;

import java.util.ArrayList;
import java.util.List;


public class VariableDeclaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public Ast expr;
    public List<List> tds;
    public int line;

    public VariableDeclaration(Ast Idf, Ast expr, Ast typeid,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
        this.tds=tds;
    }

    public VariableDeclaration(Ast Idf, Ast expr){
        this.Idf = Idf;
        this.expr = expr;
    }


    //regarder si typeid est du même type que expr
  
    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        List<String> listTypeid = new ArrayList<String>();
        List<String> listexpr = new ArrayList<String>();
        listexpr.addAll(expr.ControleSemantique());
        if (typeid != null){
            listTypeid.addAll(typeid.ControleSemantique());
            list.addAll(listTypeid);
        }
        list.addAll(Idf.ControleSemantique());
        list.addAll(listexpr);
        //declaration var simple
        /*if(list.get(0)!=null && list.get(0)!=list.get(2) && TDS.getAttribut(TDS.getType(list.get(1), tds),tds)!=null && TDS.getAttribut(TDS.getType(list.get(1), tds),tds).compareTo("TYPEARRAY")!=0){
            TDS.write("Erreur ligne " + line + " : l'élément affecté à la variable "+list.get(1)+" n'est pas du même type que cette variable");

        }
        //declaration liste composants
        if(TDS.getAttribut(TDS.getType(list.get(1), tds),tds)!=null && TDS.getAttribut(TDS.getType(list.get(1), tds),tds).compareTo("TYPEARRAY")==0){
            if(list.get(list.size()-3)!=list.get(2)){
                TDS.write("Erreur ligne " + line + " : l'élément affecté à la liste "+list.get(1)+" n'est pas du même type que cette liste");
            }
        }*/
        //test de la taille pour déclarer une liste

        if(typeid!=null && expr!= null && listTypeid.get(1).compareTo(listexpr.get(0))!=0){ 
           // System.out.println("typeid");
           // System.out.println(typeid.ControleSemantique());
            TDS.write("Erreur ligne " + line + " : on ne peut pas affecter un "+listexpr.get(0)+ " à un " + listTypeid.get(1) );
        }
        return list;
        
    }


}
