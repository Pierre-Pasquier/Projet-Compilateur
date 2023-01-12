package ast;

import java.util.ArrayList;
import java.util.List;

public class Opbinexpr implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> opbinexpr;
    public int line;

    public Opbinexpr(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.opbinexpr = new ArrayList<>();
    }

    
    public void addOpBin(Ast binexpr){
        this.opbinexpr.add(binexpr);
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < opbinexpr.size(); i++) {
            list.addAll(opbinexpr.get(i).ControleSemantique());
        }
        list.add("");
        return list;
        
    }

}
