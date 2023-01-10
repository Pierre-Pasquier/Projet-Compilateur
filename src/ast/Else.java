package ast;

import java.util.List;

public class Else implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast ouOccasionnel;
    public int line;
    public Else(Ast ouOccasionnel,int line){
        this.line = line;
        this.ouOccasionnel=ouOccasionnel;
    }
    @Override
    public List<String> ControleSemantique() {
        ouOccasionnel.ControleSemantique();
        return null;
        
    }

}
