package ast;

import java.util.List;

public class IntNode implements Ast {

    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public int value;

    public IntNode(int value) {
        this.value = value;
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

    
}
