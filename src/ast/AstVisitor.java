package ast;


public interface AstVisitor<T> {

    public T visit(Plus plus);
    public T visit(Div div);
    public T visit(And and);
    public T visit(Mult mult);
    public T visit(Div div);
    public T visit(Comp comp);

    public T visit(ExprSeq affect);
    public T visit(ExprList affect);
    public T visit(FieldList affect);
    public T visit(Idf affect);
    public T visit(IdfList affect);
    public T visit(IdfExprList affect);
    public T visit(DeclarationList affect);
    public T visit(TypeDeclaration affect);
    public T visit(TypeFieldList affect);
    public T visit(TypeField affect);
    public T visit(VariableDeclaration affect);
    public T visit(FunctionDeclaration affect);


    public T visit(Exprtiret exprtiret);
    public T visit(Nilop nil_op);
    public T visit(Typeids typeids);
    public T visit(Ops ops);
    public T visit(Parenthesis parenthesis);
    public T visit(While while1);
    public T visit(For for1);
    public T visit(Declarationlists declarationlists);
    public T visit(Printis printis);
    public T visit(Printe printe);
    public T visit(Ifthenelse ifthenelse);
    public T visit(Lvalues lvalues);


}
