package ast;

import java.util.ArrayList;
import java.util.List;

public class FieldList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> FieldList;
    public Ast Idf;
    public int line;

    public FieldList(int line){
        this.line = line;
        this.FieldList = new ArrayList<>();
    }
    
    public void addFieldList(Ast expr, Ast Idf){
        this.FieldList.add(expr);
        this.FieldList.add(Idf);
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
