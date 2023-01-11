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


    public Ifthenelse(Ast condition,Ast alors,Ast ouOccasionnel,int line){
        this.line = line;
        this.condition=condition;
        this.alors=alors;
        this.ouOccasionnel=ouOccasionnel;
    }


    public Ifthenelse(Ast condition,Ast alors){
        this.condition=condition;
        this.alors=alors;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        list.addAll(condition.ControleSemantique());
        list.addAll(alors.ControleSemantique());
        if (ouOccasionnel != null){
            list.addAll(ouOccasionnel.ControleSemantique());
        }
        list.add("");
        //System.out.println(condition.ControleSemantique());
        return list;
        
    }


}
