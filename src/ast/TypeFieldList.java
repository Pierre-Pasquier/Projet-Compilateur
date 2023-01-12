package ast;

import java.util.List;


import java.util.ArrayList;

public class TypeFieldList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> typefieldList;
    public int line;

    public TypeFieldList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typefieldList = new ArrayList<>();
    }
    
    public void addTypeField(Ast typefield){
        this.typefieldList.add(typefield);
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        for (Ast typefield : typefieldList) {
            list.addAll(typefield.ControleSemantique());
        }
        list.add("");
        return list;
        
    }

}
