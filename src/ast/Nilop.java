package ast;

import java.util.List;

public class Nilop implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast nilop;


    public Nilop(Ast nilop){
        this.nilop = nilop;
    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
