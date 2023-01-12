package ast;

import java.util.ArrayList;
import java.util.List;

public class IdfExprList implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfExprList;
    public int line;
    public List<List> tds;

    public IdfExprList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.IdfExprList = new ArrayList<>();
        this.tds = tds;
    }
    
    public void addIdfExprList(Ast expr){
        this.IdfExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < IdfExprList.size(); i++) {
            List<String> sem = IdfExprList.get(i).ControleSemantique();
            if (sem.size() > 1){
                String name = sem.get(1);
                String type = TDS.getType(TDS.getType(name,tds),tds);
                list.add(type);
                list.add(name);
            }
            
        }
        System.out.println("Dans IdfExprList : " + list);
        return list;
    }

}
