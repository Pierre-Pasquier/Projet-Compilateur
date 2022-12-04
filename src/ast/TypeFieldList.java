package ast;

import java.util.ArrayList;

public class TypeFieldList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> typefieldList;

    public TypeFieldList(){
        this.typefieldList = new ArrayList<>();
    }
    
    public void addTypeField(Ast typefield){
        this.typefieldList.add(typefield);
    }
}