package ast;

import java.util.ArrayList;
import java.util.List;

public class ExprList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> ExprList;
    public int line;

    public ExprList(int line){
        this.line = line;
        this.ExprList = new ArrayList<>();
    }
    
    public void addExprList(Ast expr){
        this.ExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
