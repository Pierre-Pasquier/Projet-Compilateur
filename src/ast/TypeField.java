package ast;

import java.util.List;


public class TypeField implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;

    public TypeField(Ast Idf, Ast typeid){
        this.Idf = Idf;
        this.typeid = typeid;
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
