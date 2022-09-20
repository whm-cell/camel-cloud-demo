package com.camel.demo.test;

import com.camel.demo.core01.CacheService;
import com.camel.demo.core01.factory.JDKProxy;
import com.camel.demo.core01.workshop.impl.ACacheImpl;
import com.camel.demo.core01.workshop.impl.BCacheImpl;
import org.junit.jupiter.api.Test;

/**
 * @Title: ApiTest
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 14:34
 * @Version: 1.0
 */
public class ApiTest {

    @Test
    public void test() throws Exception{
        CacheService proxy = JDKProxy.getProxy(CacheService.class, new ACacheImpl());

        System.out.println(proxy.get("key"));

        CacheService adapter = JDKProxy.getProxy(CacheService.class, new BCacheImpl());

        System.out.println(adapter.get("key"));


    }

}
