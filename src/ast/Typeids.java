package ast;

import java.util.List;


public class Typeids implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeids1;
    public Ast typeids2;
    public Ast typeids3;
    public int line;
    
    public Typeids(Ast typeids1, Ast typeids2, Ast typeids3,int line){
        this.line = line;
        this.typeids1 = typeids1;
        this.typeids2 = typeids2;
        this.typeids3 = typeids3;
    }


    @Override
    public List<String> ControleSemantique() {
        typeids1.ControleSemantique();
        typeids2.ControleSemantique();
        typeids3.ControleSemantique();
        return null;
        
    }

}
