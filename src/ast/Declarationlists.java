package ast;

import java.util.ArrayList;
import java.util.List;

public class Declarationlists implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast affect;
    public Ast dans;
    public int line;


    public Declarationlists(Ast dans,Ast affect,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.dans=dans;
        this.affect=affect;
    }


    @Override
    public List<String> ControleSemantique() {
        TDS.num_imbrication++;
        TDS.num_region++;
        List<String> list = new ArrayList<String>();
        affect.ControleSemantique();
        dans.ControleSemantique();
        list.add("void");
        list.add(line + "");
        TDS.num_imbrication--;
        return list;
        
    }
  
}