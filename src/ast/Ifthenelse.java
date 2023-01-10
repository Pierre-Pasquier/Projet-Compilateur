package ast;

import java.util.List;

import org.antlr.v4.codegen.SourceGenTriggers;

public class Ifthenelse implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast condition;
    public Ast alors;
    public Ast ouOccasionnel;
    public int line;


    public Ifthenelse(Ast condition,Ast alors,Ast ouOccasionnel,int line){
        this.line = line;
        this.condition=condition;
        this.alors=alors;
        this.ouOccasionnel=ouOccasionnel;
    }


    public Ifthenelse(Ast condition,Ast alors){
        this.condition=condition;
        this.alors=alors;
    }


    @Override
    public List<String> ControleSemantique() {
<<<<<<< HEAD
        condition.ControleSemantique();
        alors.ControleSemantique();
        ouOccasionnel.ControleSemantique();
        return null;
=======
        // TODO Auto-generated method stub

        //je regarde si c'est un entier , si s'en est un alors on est bon et sinon on
        //regarde dans la tds pour voir si c'est un entier

        System.out.println(condition.ControleSemantique());


        return condition.ControleSemantique();
>>>>>>> bc95715dad560a3c36b88805f181254914cfcd93
        
    }


}
