package ast;

public class Or {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}