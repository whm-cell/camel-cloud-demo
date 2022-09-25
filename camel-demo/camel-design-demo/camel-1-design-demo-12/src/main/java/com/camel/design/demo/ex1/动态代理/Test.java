package com.camel.design.demo.ex1.动态代理;

import com.camel.design.demo.ex1.IOrderService;
import com.camel.design.demo.ex1.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        var aa = (IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        aa.saveOrder(null);
        System.out.println(aa.getClass());
        // jdk动态代理是基于接口的，所以这里的类型是com.sun.proxy.$Proxy0
    }
}
