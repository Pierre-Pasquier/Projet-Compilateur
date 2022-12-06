package ast;

import java.util.ArrayList;

public class Opbinexpr implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> opbinexpr;
    public Ast arg;

    public Opbinexpr(){
        this.opbinexpr = new ArrayList<>();
    }

    public Opbinexpr(Ast arg){
        this.arg = arg;
    }
    
    public void addOpBin(Ast binexpr){
        this.opbinexpr.add(binexpr);
    }
}
