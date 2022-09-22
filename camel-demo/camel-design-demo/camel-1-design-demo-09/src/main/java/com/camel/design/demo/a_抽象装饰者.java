package com.camel.design.demo;

/**
 * @Title: a_抽象装饰者
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 15:22
 * @Version: 1.0
 */
public class a_抽象装饰者 extends a_抽象煎饼{

    /**
     * 通过组合模式，让两个子类建立关系 ，这里就是注入service的操作
     */
    private a_抽象煎饼 a_抽象煎饼;

    public a_抽象装饰者(a_抽象煎饼 a_抽象煎饼) {
        this.a_抽象煎饼 = a_抽象煎饼;
    }


    @Override
    public String getDesc() {
        return this.a_抽象煎饼.getDesc();
    }

    @Override
    public int getPrice() {
        return this.a_抽象煎饼.getPrice();
    }
}
