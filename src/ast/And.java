package ast;

import java.util.ArrayList;
import java.util.List;
public class And implements Ast{
    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }

    public ArrayList<Ast> AndList;
    int line;

    public And(int line){
        this.line = line;
        this.AndList = new ArrayList<>();
    }
    
    public void addAnd(Ast and){
        this.AndList.add(and);
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

    

}