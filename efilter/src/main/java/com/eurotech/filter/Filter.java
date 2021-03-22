package com.eurotech.filter;

import java.util.Map;

import com.eurotech.filter.parser.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Filter implements IFilter
{

    private String _filter;
    private FilterEvaluator _evaluator;
    private ParseTree _tree;

    public String stringify() {
        return _filter;
    }

    public Filter(String filter)
    {
        _filter = filter;
        _evaluator = new FilterEvaluator();
        FilterLexer lexer = new FilterLexer(CharStreams.fromString(filter));
        FilterParser parser = new FilterParser(new CommonTokenStream(lexer));
        _tree = parser.start();
    }

    public boolean matches(Map<String, String> resource)
    {
        _evaluator.setResource(resource);
        return _evaluator.visit(_tree);
    }

}
