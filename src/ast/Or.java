package ast;

import java.util.ArrayList;
public class Or implements Ast{

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public ArrayList<Ast> OrList;

    public Or(){
        this.OrList = new ArrayList<>();
    }
    
    public void addOr(Ast or){
        this.OrList.add(or);
    }
}