package com.camel.demo.core01.factory;

import com.camel.demo.core01.workshop.ICacheAdapter;
import com.camel.demo.core01.utils.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Title: JDKInvocationHandler
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 15:36
 * @Version: 1.0
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }

}
