package ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Array2DHashSet;


public class Stringg implements Ast{
    
    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public String name;
    public int line;

    public Stringg(String name,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.name = name;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        list.add("string");
        System.out.println("string");
        return list;
        
    }


   

}
