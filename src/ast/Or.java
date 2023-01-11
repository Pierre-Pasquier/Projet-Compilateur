package ast;

import java.util.ArrayList;
import java.util.List;
public class Or implements Ast{

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public ArrayList<Ast> OrList;
    public int line;

    public Or(int line){
        this.line = line;
        this.OrList = new ArrayList<>();
    }
    
    public void addOr(Ast or){
        this.OrList.add(or);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < OrList.size(); i++) {
            list.addAll(OrList.get(i).ControleSemantique());
        }
        list.add("");
        return list;
        
    }

}