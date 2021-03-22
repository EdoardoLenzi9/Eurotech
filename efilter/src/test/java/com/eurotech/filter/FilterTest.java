package com.eurotech.filter;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
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
        Filter filter = new Filter("$filter=contains(firstname)");    
        assertTrue(filter.matches(_user));
    }

    @Test
    public void shouldFilterByContainsKeyValue()
    {
        Filter filter = new Filter("$filter=contains(firstname, joe)");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=contains(firstname,joe)");    
        assertTrue(filter.matches(_user));
        filter = new Filter("$filter=contains(firstname,jack)");    
        assertFalse(filter.matches(_user));
    }

    /* TODO test
        $filter=contains(key)

        $filter=contains(key, 'value')
        $filter=key eq value
        $filter=key gt value
        $filter=key lt value

        // custom, not present in odata
        $filter=regex(key, regex) 

        and, or, not and parenthesization
    */

}
