package ast;

import java.util.ArrayList;
import java.util.List;


public class TypeDeclaration implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast typeid;
    public Ast type;
    public int line;

    public TypeDeclaration(Ast typeid, Ast type,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typeid = typeid;
        this.type = type;
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        list.addAll(typeid.ControleSemantique());
        list.addAll(type.ControleSemantique());
        list.add("");
        return list;
        
    }


}
