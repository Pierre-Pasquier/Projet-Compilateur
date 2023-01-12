package ast;

import java.util.ArrayList;
import java.util.List;


public class TypeField implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public int line;

    public TypeField(Ast Idf, Ast typeid,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.Idf = Idf;
        this.typeid = typeid;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        list.addAll(typeid.ControleSemantique());
        list.addAll(Idf.ControleSemantique());
        return list;
        
    }


}
