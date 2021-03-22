package com.eurotech.filter;

import java.util.Map;

public interface IFilter {

    public boolean matches(Map<String, String> resource);
    public String stringify();
}
