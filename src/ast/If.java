package ast;

import java.util.List;

public class If implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast condition;
    public int line;
    public If(Ast condition,int line){
        this.line = line;
        this.condition=condition;
    }
    
    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return condition.ControleSemantique();
        
    }


}
