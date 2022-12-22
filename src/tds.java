import parser.exprLexer;
import parser.exprParser;
import parser.exprParser.ProgramContext;
import java.util.List;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import ast.*;
import graphViz.GraphVizVisitor;

public static void add_lvalue (Lvalues lvalues, List<List> tds) {
    if (lvalues.lvalue instanceof IdfList) {
        add_lvalue((Lvalues) lvalue.lvalue, tds);
    } 
    else if (lvalues.lvalue instanceof IdfExprList)
    {
        tds.add((List) lvalues.lvalue);
    }

    
}

public static void add_variable_declaration(VariableDeclaration variable_declaration, List<List> tds) {
    
    private List line = new ArrayList();
    line.add((List) variable_declaration.Idf);
    if (variable_declaration.typeid != null) {
        line.add((List) variable_declaration.typeid);
    }
    if (isEmpty(tds)) {
        dpl=0;
    }
    else {
        dpl = tds.get(tds.size()-1).get(0);
        dpl=dpl+get_size(variable_declaration.expr);
    }
    line.add(tdl);
    tds.add(line);
}

public static void add_function_declaration(FunctionDeclaration function_declaration, List<List> tds) {
    private List line = new ArrayList();
    line.add((List) function_declaration.Idf);
    line.add((List) function_declaration.typeid);
    tds.add(line);
}
    


