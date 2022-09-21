package com.camel.demo.core01.factory;

import com.camel.demo.core01.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Title: JDKProxy
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 15:32
 * @Version: 1.0
 */
public class JDKProxy {

    /**
     * 这种适合多实现的情况下，使用实现类去找到对应的接口 ，默认找第一个！
     * @param interfaceClass
     * @param cacheAdapter
     * @return
     * @param <T>
     * @throws Exception
     */
    public static <T> T getProxy2(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }

    public static <T> T getProxy(Class<T> cacheClazz, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{cacheClazz}, handler);
    }


}
