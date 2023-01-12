package ast;

import java.util.ArrayList;
import java.util.List;

public class ExprSeq implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> ExprSeq;
    public int line;

    public ExprSeq(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.ExprSeq = new ArrayList<>();
    }
    
    public void addExprSeq(Ast expr){
        this.ExprSeq.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < ExprSeq.size(); i++) {
            list.addAll(ExprSeq.get(i).ControleSemantique());
        }
        return list;
        
    }

}
