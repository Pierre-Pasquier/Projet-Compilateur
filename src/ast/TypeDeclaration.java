package ast;

import java.util.List;


public class TypeDeclaration implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast typeid;
    public Ast type;

    public TypeDeclaration(Ast typeid, Ast type){
        this.typeid = typeid;
        this.type = type;
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
