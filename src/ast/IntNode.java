package ast;

import java.util.ArrayList;
import java.util.List;

public class IntNode implements Ast {

    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public int value;
    public int line;

    public IntNode(int value,int line, int num_region, int num_imbrication, List<List> tds) {
        this.line = line;
        this.value = value;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();


        list.add("int");
        return list;
        
    }

    
}
