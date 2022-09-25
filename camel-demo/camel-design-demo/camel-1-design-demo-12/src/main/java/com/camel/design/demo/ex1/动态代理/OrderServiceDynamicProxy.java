package com.camel.design.demo.ex1.动态代理;

import com.camel.design.demo.ex1.Order;
import com.camel.design.demo.ex1.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
  * @Title: OrderServiceDynamicProxy     
  * @Description:        
  * @author: wanghaiming      
  * @date: 2022/9/23 0023 13:52
  * @Version: 1.0
  */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }


    public Object bind() {
        Class<?> aClass = target.getClass();
       return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 获取参数（如果传递的是对象，那么就是对象的引用）
        Object argObject = args[0];
        beforeMethod(argObject);
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }


    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before code");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        // DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
