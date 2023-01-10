package ast;

import java.util.ArrayList;
import java.util.List;


public class Stringg implements Ast{
    
    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public String name;
    public int line;

    public Stringg(String name,int line){
        this.line = line;
        this.name = name;
    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub

        List<String> string=new ArrayList<>();
        string.add("STRING");
        string.add(String.valueOf(line));


        return string;
        
    }


   

}
