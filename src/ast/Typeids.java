package ast;

public class Typeids implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeids1;
    public Ast fieldlist1;
    public Ast typeids2;
    public Ast expr1;
    public Ast expr2;

    public Typeids(Ast typeids1,Ast fieldlist1){
        this.typeids1 = typeids1;
        this.fieldlist1 = fieldlist1;
    }


    public Typeids(Ast typeids2,Ast expr1,Ast expr2){
        this.typeids2 = typeids2;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
}
