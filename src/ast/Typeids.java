package ast;

import java.util.ArrayList;
import java.util.List;


public class Typeids implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeids1;  //nom du type
    public Ast typeids2;
    public Ast typeids3;
    public int line;
    public List<List> tds = new ArrayList();
    
    public Typeids(Ast typeids1, Ast typeids2, Ast typeids3,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typeids1 = typeids1;
        this.typeids2 = typeids2;
        this.typeids3 = typeids3;
        this.tds = tds;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        if (typeids1 != null){
            List<String> name = typeids1.ControleSemantique();
            String type = TDS.getType(TDS.getType(name.get(1),tds),tds); // on récupère le type des éléments dans la matrice
            if (typeids2 != null){
                List<String> parametre = typeids2.ControleSemantique(); // on récupère ce qu'il y a entre les crochets
                System.out.println("parametre : " + parametre);
                System.out.println("type : " + type);
                if(TDS.getType(parametre.get(parametre.size()-1), tds)!=null && TDS.getType(parametre.get(parametre.size()-1), tds).compareTo(type)!=0 && TDS.getType(parametre.get(parametre.size()-1), tds).compareTo("")!=0 ){
                    System.out.println(TDS.getType(parametre.get(parametre.size()-1), tds));
                    TDS.write("Erreur ligne " + line + " : on ne peut pas affecter un "+ TDS.getType(parametre.get(parametre.size()-1), tds) + " comme indice de matrice");

                }
            }
            if (typeids3 != null){
                List<String> val = typeids3.ControleSemantique(); // on récupère ce qu'il y a après le of
                System.out.println("truc dans val :" + val);
                if(val.get(0)!=null && val.get(0).compareTo(type)!=0 && val.get(0).compareTo("")!=0 ){
                    System.out.println("couille dans le of");
                    TDS.write("Erreur ligne " + line + " : on ne peut pas affecter un "+ TDS.getType(val.get(val.size()-1), tds) + " à une matrice de type " + type);
                }
            }
        }
        
        // on vérifie que val == type et que paramètre est un entier
        System.out.println("list typeids");
        System.out.println(list);
        list.add("");
        return list;
        
    }
    
}