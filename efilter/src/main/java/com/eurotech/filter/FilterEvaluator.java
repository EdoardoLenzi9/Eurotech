package com.eurotech.filter;

import java.util.Map;

import com.eurotech.filter.parser.*;


public class FilterEvaluator extends FilterBaseVisitor<Boolean>
{
    private Map<String, String> _resource;

    public Map<String, String> getResource() {
        return _resource;
    }

    public void setResource(Map<String, String> resource) {
        _resource = resource;
    }

    public FilterEvaluator()
    {
        super();
        _resource = null;
    }

    public FilterEvaluator(Map<String, String> resource)
    {
        super();
        _resource = resource;
    }

    @Override
    public Boolean visitStart(FilterParser.StartContext ctx) 
    {
        return this.visit(ctx.filter());
    }

    @Override
    public Boolean visitFilter(FilterParser.FilterContext ctx) 
    {
        return this.visit(ctx.cond());
    }

    @Override
    public Boolean visitAndOrExpr(FilterParser.AndOrExprContext ctx) 
    {
        Boolean left = visit(ctx.left);
        Boolean right = visit(ctx.right);
        String op = ctx.op.getText();
        switch (op) 
        {
            case " and ": return left && right;
            case " or ": return left || right;
            default: throw new IllegalArgumentException("Unknown operator " + op);
        }
    }

    @Override
    public Boolean visitContainsKeyValueExpr(FilterParser.ContainsKeyValueExprContext ctx)
    {
        String key = ctx.key.getText();
        String value = ctx.value.getText();
        if(!_resource.containsKey(key)){
            throw new IllegalArgumentException("Unknown key " + key);
        }
        return _resource.get(key).toLowerCase().equals(value.toLowerCase());
    }

    @Override
    public Boolean visitContainsKeyExpr(FilterParser.ContainsKeyExprContext ctx)
    {
        String key = ctx.key.getText();
        if(!_resource.containsKey(key)){
            throw new IllegalArgumentException("Unknown key " + key);
        }
        return true;
    }

    @Override
    public Boolean visitRegexExpr(FilterParser.RegexExprContext ctx)
    {
        String key = ctx.key.getText();
        String regex = ctx.regex.getText();
        regex = regex.substring(1,regex.length()-1);
        if(!_resource.containsKey(key)){
            throw new IllegalArgumentException("Unknown key " + key);
        }
        return _resource.get(key).matches(regex);
    }
    
    @Override
    public Boolean visitCompareExpr(FilterParser.CompareExprContext ctx)
    {
        String key = ctx.key.getText();
        String op = ctx.op.getText();
        Integer value = Integer.parseInt(ctx.value.getText());
        if(!_resource.containsKey(key)){
            throw new IllegalArgumentException("Unknown key " + key);
        }

        Integer field = Integer.parseInt(_resource.get(key));

        switch(op)
        {
            case " eq ": return field == value;
            case " lt ": return field < value;
            case " gt ": return field > value; 
            default:     throw new IllegalArgumentException("Unknown operator " + op); 
        }
    }

    @Override
    public Boolean visitNotExpr(FilterParser.NotExprContext ctx) 
    {
        return ! visit(ctx.right);
    }

    @Override
    public Boolean visitParenthesisExpr(FilterParser.ParenthesisExprContext ctx)
    {
        return visit(ctx.center);
    }

    @Override
    public Boolean visitAtomExpr(FilterParser.AtomExprContext ctx) 
    {
        throw new IllegalArgumentException("Unknown atom " + ctx.atom.getText());
    }
}
