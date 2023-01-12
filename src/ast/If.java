package ast;

import java.util.ArrayList;
import java.util.List;

public class If implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast condition;
    public int num_imbrication;
    public List<List> tds;
    int num_region;
    public int line;
    public If(Ast condition,int line,int num_region,int num_imbrication,List<List> tds){
        this.line = line;
        this.condition=condition;
        this.num_imbrication=num_imbrication;
        this.tds=tds;
        this.num_region=num_region;
    }
    
    @Override
    public List<String> ControleSemantique() {
<<<<<<< HEAD
        List<String> cond = condition.ControleSemantique();
        if(cond.get(0).equals("INT")){
=======

        List<String> list = new ArrayList<>();
        list.addAll(condition.ControleSemantique());

        if(list.get(0).compareTo("int")!=0){
>>>>>>> b543f331b6bd3478213cd6e63b43181fe4005920
            TDS.write("Erreur ligne " + line + " : La condition doit se traduire par un booléan (0 ou 1)");
            list.add("");
            //System.out.println(list);
            //System.out.println("attrapé");
        }
        //System.out.println(list);

<<<<<<< HEAD

        return cond;
=======
        return list;
>>>>>>> b543f331b6bd3478213cd6e63b43181fe4005920
        
    }


}
