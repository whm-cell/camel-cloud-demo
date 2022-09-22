package com.camel.design.demo;

/**
 * @Title: 最终被使用抽象类
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 13:31
 * @Version: 1.0
 */
public abstract class a_最终被使用抽象类 {

    /**
     * 新增
     * @param a
     */
    public  void add(a_最终被使用抽象类 a){
        throw new RuntimeException("不支持的操作 - add");
    };

    /**
     * 移除
     */
    public  void remove(a_最终被使用抽象类 a){
        throw new RuntimeException("不支持的操作 - remove");
    };

    public String getName(){
        throw new RuntimeException("不支持的操作 - getName");
    };

    public double getPrice(){
        throw new RuntimeException("不支持的操作 - getPrice");
    };

    public void print(){
        throw new RuntimeException("不支持的操作 - print");
    };

}
