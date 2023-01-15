package ast;

import java.util.ArrayList;
import java.util.List;


public class Printis implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printis;
    public int line;


    public Printis(Ast printis,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.printis = printis;
    }



    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        list.add("void");
        list.add(line + "");
        return list;
        
    }


}

