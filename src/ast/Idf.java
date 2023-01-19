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
            System.out.println("Erreur ligne " + line + " : variable " + name + " non déclarée");
            TDS.write("Erreur ligne " + line + " : variable " + name + " non déclarée");
            list.add("");
        } else  {
            list.add(type);
           // System.out.println(type);
        }
       /* if (!list.contains(name)){
            list.add(name);
            System.out.println(name);
        }
        
        if (TDS.global_name==0){
            TDS.global_name=1;
            list.get(list.size()-1);
        }*/
        /* 
        List<String> line = TDS.getDECLARATION(name,TDS.tds);
        
        //System.out.println(line);
        if (line.size()==0 && !TDS.list_var.contains(name)){
            TDS.write("La variable " + name + " n'est pas déclarée avant d'être utilisée");
            TDS.list_var.add(name);
        }
        else if (line.size()!=0 && !TDS.list_var.contains(name)){
            TDS.write("La variable "+ name +" est déclarée à la ligne " +this.line +" avant d'être utilisée");
            TDS.list_var.add(name);
        };
        */
        list.add(name);
        
        
        return list;
    }
}
