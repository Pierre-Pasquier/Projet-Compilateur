package ast;

import java.util.ArrayList;

public class FieldList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> FieldList;
    public Ast Idf;

    public FieldList(){
        this.FieldList = new ArrayList<>();
    }
    
    public void addFieldList(Ast expr, Ast Idf){
        this.FieldList.add(expr);
        this.FieldList.add(Idf);
    }
}
