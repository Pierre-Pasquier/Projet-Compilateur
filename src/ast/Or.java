package ast;

public interface Or {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}