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
        String type = TDS.getType(name, tds);
=======
        //System.out.println("Idf = " + name + " " + num_region + " " + num_imbrication);
        //System.out.println("len tds : " + tds.size());
        String type = TDS.getType(name, tds);
        //System.out.println("type : " + type);

        
>>>>>>> b543f331b6bd3478213cd6e63b43181fe4005920
        if (type == null){
            TDS.write("Erreur ligne " + line + " : variable " + name + " non déclarée");
            list.add("");
        } else  {
            list.add(type);
<<<<<<< HEAD
        }
        
=======
           // System.out.println(type);

        }
>>>>>>> b543f331b6bd3478213cd6e63b43181fe4005920
        list.add(name);
        
        return list;
    }
}
