package com.camel.demo.core01;

import com.camel.demo.core01.factory.JDKProxy;
import com.camel.demo.core01.workshop.impl.ACacheImpl;

public interface CacheService {
    String get(final String key);

}
