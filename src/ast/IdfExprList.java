package ast;

import java.util.ArrayList;
import java.util.List;

public class IdfExprList implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfExprList;
    public int line;

    public IdfExprList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.IdfExprList = new ArrayList<>();
    }
    
    public void addIdfExprList(Ast expr){
        this.IdfExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        list.add(IdfExprList.get(0).ControleSemantique().get(0));
        for (int i = 0; i < IdfExprList.size(); i++) {
            list.addAll(IdfExprList.get(i).ControleSemantique());
        }
        list.add("");
        return list;
        
    }

}
