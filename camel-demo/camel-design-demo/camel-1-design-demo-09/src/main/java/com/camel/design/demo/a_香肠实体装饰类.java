package com.camel.design.demo;

/**
 * @Title: a_济南实体装饰类
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 15:24
 * @Version: 1.0
 */
public class a_香肠实体装饰类 extends a_抽象装饰者{

    public a_香肠实体装饰类(com.camel.design.demo.a_抽象煎饼 a_抽象煎饼) {
        super(a_抽象煎饼);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() +4 ;
    }
}
