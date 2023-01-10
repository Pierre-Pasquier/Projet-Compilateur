package ast;

import java.util.List;


public class TypeDeclaration implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast typeid;
    public Ast type;
    public int line;

    public TypeDeclaration(Ast typeid, Ast type,int line){
        this.line = line;
        this.typeid = typeid;
        this.type = type;
    }


    @Override
    public List<String> ControleSemantique() {
        typeid.ControleSemantique();
        type.ControleSemantique();
        return null;
        
    }


}
