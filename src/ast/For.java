package ast;

import java.util.ArrayList;
import java.util.List;

public class For implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast deb;
    public Ast fin;
    public Ast faire;
    public Ast idf;
    public int line;



    public For(Ast idf,Ast deb,Ast fin,Ast faire,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.deb=deb;
        this.fin=fin;
        this.faire=faire;
        this.idf=idf;
    }



    @Override
    public List<String> ControleSemantique() {
        TDS.num_imbrication++;
        TDS.num_region++;
        List<String> list = new ArrayList<String>();
        list.addAll(faire.ControleSemantique());
        System.out.println(deb.ControleSemantique());
        if(deb.ControleSemantique().get(0)!=null && deb.ControleSemantique().get(0).compareTo("int")!=0){
            TDS.write("Erreur ligne " + line + " : le premier indice de la boucle for n'est pas un entier");

        }
        if(fin.ControleSemantique().get(0)!=null && fin.ControleSemantique().get(0).compareTo("int")!=0){
            TDS.write("Erreur ligne " + line + " : le dernier indice de la boucle for n'est pas un entier");

        }
        TDS.num_imbrication--;
        return list;
        
    }


    
}