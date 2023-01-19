package ast;

import java.util.ArrayList;
import java.util.List;

public class ExprList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> ExprList;
    public int line;
    public List<List> tds= new ArrayList<>();

    public ExprList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.tds = tds;
        this.ExprList = new ArrayList<>();
    }
    
    public void addExprList(Ast expr){
        this.ExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < ExprList.size(); i++) {
            List<String> args = ExprList.get(i).ControleSemantique();
            list.addAll(args);
        }
        return list;
        
    }

}
