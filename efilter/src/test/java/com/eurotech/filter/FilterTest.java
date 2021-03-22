package com.eurotech.filter;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;


public class FilterTest 
{
    
    private Map<String, String> _user;

    public FilterTest()
    {
        _user = new LinkedHashMap<String, String>();
        _user.put("firstname",     "joe");
        _user.put("surname",       "bloggs");
        _user.put("role",          "administrator");
        _user.put("age",           "35");
    }

    @Test
    public void shouldFilterByContains()
    {
        IFilter filter = new Filter("$filter=contains(firstname)");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=contains(firstname, joe)");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=contains(firstname,joe)");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=contains(firstname,jack)");    
        assertFalse(filter.matches(_user));
    }
    
    @Test
    public void shouldFilterManageCaseSensitivity()
    {
        IFilter filter = new Filter("$filter=contains(firstname, JoE)");    
        assertTrue(filter.matches(_user));
    }

    @Test
    public void shouldFilterByRegex()
    {
        IFilter filter = new Filter("$filter=regex(firstname, 'j.e')");    
        assertTrue(filter.matches(_user));
    }

    @Test
    public void shouldFilterByTreshold()
    {
        IFilter filter = new Filter("$filter=age eq 35");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=age gt 34");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=age lt 36");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=age gt 36");    
        assertFalse(filter.matches(_user));
        filter = new Filter("$filter=age lt 34");    
        assertFalse(filter.matches(_user));
    }

    @Test
    public void shouldFilterByBooleanAlgebra()
    {
        IFilter filter = new Filter("$filter=(age eq 35) and (age gt 30)");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=(age gt 34) or (age lt 34)");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=(age gt 35) or (age lt 35)");    
        assertFalse(filter.matches(_user));
        filter = new Filter("$filter=not (age gt 35) or (age lt 35)");    
        assertTrue(filter.matches(_user));
    }
 
    @Test
    public void shouldFilterByEvilQuery()
    {
        IFilter filter = new Filter("$filter=(age eq 35) and not not (contains(firstname)) and ((regex(surname, '[^c]*')))");    
        assertTrue(filter.matches(_user));
    }

    @Test
    public void shouldStringifyFilterCorrectly()
    {
        String query = "$filter=(age eq 35) and not not (contains(firstname)) and ((regex(surname, '[^c]*')))";
        IFilter filter = new Filter(query);    
        assertEquals(query, filter.stringify());
    }

    @Test
    public void shouldFilterCorrectlyAfterUpdatingResource()
    {
        // Create a filter using your API.
        IFilter filter = new Filter("$filter=(age eq 35) and not not (contains(firstname)) and ((regex(surname, '[^c]*')))"); 
        // Filter should match.
        assertTrue(filter.matches(_user));      
        // Update resource
        _user.put("age", "25");
        // Filter mismatch
        assertFalse(filter.matches(_user));
    }

}
