package ast;

import java.util.ArrayList;
public class And implements Ast{
    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public ArrayList<Ast> AndList;

    public And(){
        this.AndList = new ArrayList<>();
    }
    
    public void addAnd(Ast and){
        this.AndList.add(and);
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }

    

}