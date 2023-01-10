package ast;

import java.util.List;


import java.util.ArrayList;

public class TypeFieldList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> typefieldList;
    public int line;

    public TypeFieldList(int line){
        this.line = line;
        this.typefieldList = new ArrayList<>();
    }
    
    public void addTypeField(Ast typefield){
        this.typefieldList.add(typefield);
    }


    @Override
    public List<String> ControleSemantique() {
        
        return null;
        
    }

}
