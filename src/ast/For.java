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



    public For(Ast idf,Ast deb,Ast fin,Ast faire,int line){
        this.line = line;
        this.deb=deb;
        this.fin=fin;
        this.faire=faire;
        this.idf=idf;
    }



    @Override
    public List<String> ControleSemantique() {
        TDS.num_imbrication++;
        TDS.num_region++;
        List<String> list = new ArrayList<String>();
        list.addAll(faire.ControleSemantique());
        TDS.num_imbrication--;
        return list;
        
    }


    
}