package ast;

import java.util.ArrayList;
import java.util.List;


public class Typeids implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeids1;
    public Ast typeids2;
    public Ast typeids3;
    public int line;
    
    public Typeids(Ast typeids1, Ast typeids2, Ast typeids3,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typeids1 = typeids1;
        this.typeids2 = typeids2;
        this.typeids3 = typeids3;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        if (typeids1 != null){
            list.addAll(typeids1.ControleSemantique());
        }
        if (typeids2 != null){
            list.addAll(typeids2.ControleSemantique());
        }
        if (typeids3 != null){
            list.addAll(typeids3.ControleSemantique());
        }
        list.add("");
        return list;
        
    }

}
