package ast;

import java.util.List;

public class For implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast deb;
    public Ast fin;
    public Ast faire;
    public Ast idf;



    public For(Ast deb,Ast fin,Ast faire,Ast idf){
        this.deb=deb;
        this.fin=fin;
        this.faire=faire;
        this.idf=idf;

    }



    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }


    
}