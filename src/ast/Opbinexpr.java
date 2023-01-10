package ast;

import java.util.ArrayList;
import java.util.List;

public class Opbinexpr implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> opbinexpr;
    public int line;

    public Opbinexpr(int line){
        this.line = line;
        this.opbinexpr = new ArrayList<>();
    }

    
    public void addOpBin(Ast binexpr){
        this.opbinexpr.add(binexpr);
    }


    @Override
    public List<String> ControleSemantique() {
        for (int i = 0; i < opbinexpr.size(); i++) {
            opbinexpr.get(i).ControleSemantique();
        }
        return null;
        
    }

}
