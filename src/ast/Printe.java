package ast;

import java.util.ArrayList;
import java.util.List;

public class Printe implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printe;
    public int line;


    public Printe(Ast printe,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.printe = printe;
    }



    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        printe.ControleSemantique();
        list.add("void");
        list.add(line + "");
        return list;
        
    }


}
