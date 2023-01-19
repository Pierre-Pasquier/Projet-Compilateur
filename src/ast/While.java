package ast;

import java.util.ArrayList;
import java.util.List;


public class While implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast condition;
    public Ast faire;
    public int line;


    public While(Ast condition,Ast faire,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.line = line;
        this.condition = condition;
        this.faire = faire;


    }


    @Override
    public List<String> ControleSemantique() {
        TDS.num_imbrication++;
        TDS.num_region++;
        List<String> list = new ArrayList<>();
        List<String> cond = condition.ControleSemantique();
        list.addAll(cond);
        list.addAll(faire.ControleSemantique());

        if(cond.get(0).compareTo("int")!=0){
            System.out.println("Erreur ligne " + line + " : La condition du while doit se traduire par un booléen (0 ou 1)");
            TDS.write("Erreur ligne " + line + " : La condition du while doit se traduire par un booléan (0 ou 1)");
        }

        list.add("");
        TDS.num_imbrication--;
        return list;
        
    }

}

