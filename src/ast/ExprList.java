package ast;

import java.util.ArrayList;
import java.util.List;

public class ExprList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> ExprList;
    public int line;

    public ExprList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.ExprList = new ArrayList<>();
    }
    
    public void addExprList(Ast expr){
        this.ExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < ExprList.size(); i++) {
            // verif type args
            list.addAll(ExprList.get(i).ControleSemantique());
        }
        return list;
        
    }

}
