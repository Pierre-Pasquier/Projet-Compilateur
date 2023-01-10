package ast;

import java.util.ArrayList;
import java.util.List;

public class Opbinexpr implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> opbinexpr;

    public Opbinexpr(){
        this.opbinexpr = new ArrayList<>();
    }

    
    public void addOpBin(Ast binexpr){
        this.opbinexpr.add(binexpr);
    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
