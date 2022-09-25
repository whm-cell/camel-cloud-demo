package com.camel.design.demo.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
  * @Title: OrderServiceDynamicProxy     
  * @Description:        
  * @author: wanghaiming      
  * @date: 2022/9/23 0023 13:52
  * @Version: 1.0
  */
public class OrderServiceDynamicProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
