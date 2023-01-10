package ast;

public class While implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast condition;
    public Ast faire;


    public While(Ast condition,Ast faire){
        this.condition = condition;
        this.faire = faire;


    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }


}

