package com.camel.design.demo;

/**
 * @Title: a_实体煎饼_被装饰的实体
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 15:21
 * @Version: 1.0
 */
public class a_实体煎饼_被装饰的实体 extends a_抽象煎饼{

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 8;
    }
}
