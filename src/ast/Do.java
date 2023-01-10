package ast;

import java.util.List;

public class Do implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast faire;
    public int line;
    public Do(Ast faire,int line){
        this.line = line;
        this.faire=faire;
    }
    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
