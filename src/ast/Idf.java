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
        String type = TDS.getType(name, tds);
        if (type == null){
            TDS.write("Erreur ligne " + line + " : variable " + name + " non déclarée");
            list.add("");
        } else  {
            list.add(type);
           // System.out.println(type);

        }
        list.add(name);
        
        return list;
    }
}
