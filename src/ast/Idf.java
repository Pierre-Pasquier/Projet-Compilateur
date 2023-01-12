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

    public Idf(String name,int line){
        this.line = line;
        this.name = name;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
       // System.out.println("Idf = " + name + " " + TDS.num_region + " " + TDS.num_imbrication);
        String type = TDS.getType(name, TDS.tds, TDS.num_region);
        //System.out.println(type);
        if (type == null){
            TDS.write("Erreur ligne " + line + " : variable " + name + " non déclarée");
            list.add("");
        } else  {
            list.add(type);
            System.out.println(type);

        }
        //System.out.println(name);
        list.add(name);
        return list;
        
    }

   

}
