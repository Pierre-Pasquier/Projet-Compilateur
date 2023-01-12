package ast;

import java.util.ArrayList;
import java.util.List;

public class DeclarationList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> DeclarationList;
    public int line;

    public DeclarationList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.DeclarationList = new ArrayList<>();
    }
    
    public void addDeclaration(Ast declaration){
        this.DeclarationList.add(declaration);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < DeclarationList.size(); i++) {
            list.addAll(DeclarationList.get(i).ControleSemantique());
        }
        list.add("");
        return list;
        
    }

}
