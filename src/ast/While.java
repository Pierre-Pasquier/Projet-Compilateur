package ast;

import java.util.List;


public class While implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast condition;
    public Ast faire;
    public int line;


    public While(Ast condition,Ast faire,int line){
        this.line = line;
        this.line = line;
        this.condition = condition;
        this.faire = faire;


    }


    @Override
    public List<String> ControleSemantique() {
        condition.ControleSemantique();
        faire.ControleSemantique();
        return null;
        
    }


}

