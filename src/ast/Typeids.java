package ast;

public class Typeids implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeids1;
    public Ast typeids2;
    public Ast typeids3;
    
    public Typeids(Ast typeids1, Ast typeids2, Ast typeids3){
        this.typeids1 = typeids1;
        this.typeids2 = typeids2;
        this.typeids3 = typeids3;
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
