package ast;

import java.util.List;

public class Else implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast ouOccasionnel;
    public Else(Ast ouOccasionnel){
        this.ouOccasionnel=ouOccasionnel;
    }
    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
