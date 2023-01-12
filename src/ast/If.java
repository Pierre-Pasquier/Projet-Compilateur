package ast;

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

        if(condition.ControleSemantique().get(0).equals("INT")){
            TDS.write("Erreur ligne " + line + " : La condition doit se traduire par un booléan (0 ou 1)");
        }

        System.out.println(condition.ControleSemantique());

        return condition.ControleSemantique();
        
    }


}
