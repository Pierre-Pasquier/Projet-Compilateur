package ast;

import java.util.List;

public class BorneInf implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast deb;
    public BorneInf(Ast deb){
        this.deb=deb;
    }
    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }
}

