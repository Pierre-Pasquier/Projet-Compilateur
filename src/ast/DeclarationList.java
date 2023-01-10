package ast;

import java.util.ArrayList;

public class DeclarationList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> DeclarationList;

    public DeclarationList(){
        this.DeclarationList = new ArrayList<>();
    }
    
    public void addDeclaration(Ast declaration){
        this.DeclarationList.add(declaration);
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
