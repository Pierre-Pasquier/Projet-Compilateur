package ast;

import java.util.ArrayList;
import java.util.List;

public class Idf implements Ast{
    
    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public String name;
    public int line;
    public int num_region;
    public int num_imbrication;
    public List<List> tds;

    public Idf(String name,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.name = name;
        this.num_region = num_region;
        this.num_imbrication = num_imbrication;
        this.tds = tds;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
<<<<<<< HEAD
       // System.out.println("Idf = " + name + " " + TDS.num_region + " " + TDS.num_imbrication);
        String type = TDS.getType(name, TDS.tds, TDS.num_region);
        //System.out.println(type);
=======
        System.out.println("Idf = " + name + " " + num_region + " " + num_imbrication);
        System.out.println("len tds : " + tds.size());
        String type = TDS.getType(name, tds);
        System.out.println("type : " + type);
>>>>>>> refs/remotes/origin/master
        if (type == null){
            TDS.write("Erreur ligne " + line + " : variable " + name + " non déclarée");
            list.add("");
        } else  {
            list.add(type);
            System.out.println(type);

        }
<<<<<<< HEAD
        //System.out.println(name);
        list.add(name);
        return list;
=======
>>>>>>> refs/remotes/origin/master
        
        list.add(name);
        
        return list;
    }

   

}
