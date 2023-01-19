package ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.codegen.SourceGenTriggers;

public class Ifthenelse implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast condition;
    public Ast alors;
    public Ast ouOccasionnel;
    public int line;


    public Ifthenelse(Ast condition,Ast alors,Ast ouOccasionnel,int line,int num_region,int num_imbrication,List<List> tds){
        this.line = line;
        this.condition=condition;
        this.alors=alors;
        this.ouOccasionnel=ouOccasionnel;
    }


    public Ifthenelse(Ast condition,Ast alors, int num_region, int num_imbrication, List<List> tds){
        this.condition=condition;
        this.alors=alors;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        List<String> cond = condition.ControleSemantique();
        List<String> then = alors.ControleSemantique();
        list.addAll(then);
        if (ouOccasionnel != null){
            List<String> elsee = ouOccasionnel.ControleSemantique();
            list.addAll(elsee);
            if (!then.get(0).equals(elsee.get(0))){
                System.out.println("Erreur ligne " + line + " : les deux branches d'un ifthenelse doivent être de même type");
                TDS.write("Erreur ligne " + line + " : les deux branches d'un ifthenelse doivent être de même type");
                list.add("");
                list.add(line + "");
            }

        }     
        return list;
        
    }


}
