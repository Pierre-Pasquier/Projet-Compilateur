package ast;

import java.util.List;

public class TypeRetour implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast type;
    public int line;
    
    public TypeRetour(Ast type,int line){
        this.line = line;
        this.type=type;
    }

    @Override
    public List<String> ControleSemantique() {
        return type.ControleSemantique();
    }

}
