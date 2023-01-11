package ast;

import java.util.ArrayList;
import java.util.List;

public class For implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast deb;
    public Ast fin;
    public Ast faire;
    public Ast idf;
    public int line;



    public For(Ast deb,Ast fin,Ast faire,Ast idf,int line){
        this.line = line;
        this.deb=deb;
        this.fin=fin;
        this.faire=faire;
        this.idf=idf;

    }



    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        list.addAll(deb.ControleSemantique());
        list.addAll(fin.ControleSemantique());
        list.addAll(faire.ControleSemantique());
        list.addAll(idf.ControleSemantique());
        list.add("");
        return list;
        
    }


    
}