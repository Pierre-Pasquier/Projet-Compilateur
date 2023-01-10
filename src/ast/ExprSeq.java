package ast;

import java.util.ArrayList;
import java.util.List;

public class ExprSeq implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> ExprSeq;
    public int line;

    public ExprSeq(int line){
        this.line = line;
        this.ExprSeq = new ArrayList<>();
    }
    
    public void addExprSeq(Ast expr){
        this.ExprSeq.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        for (int i = 0; i < ExprSeq.size(); i++) {
            ExprSeq.get(i).ControleSemantique();
        }
        return null;
        
    }

}
