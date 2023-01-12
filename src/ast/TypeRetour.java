package ast;

import java.util.List;

public class TypeRetour implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast type;
    public int line;
    
    public TypeRetour(Ast type,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.type=type;
    }

    @Override
    public List<String> ControleSemantique() {
        return type.ControleSemantique();
    }

}
