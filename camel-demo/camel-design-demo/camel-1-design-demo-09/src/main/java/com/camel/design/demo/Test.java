package com.camel.design.demo;

/**
 * @Title: Test
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 15:32
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        a_抽象煎饼 a_抽象煎饼类;

        a_抽象煎饼类 = new a_实体煎饼_被装饰的实体();
        a_抽象煎饼类 = new a_香肠实体装饰类(a_抽象煎饼类);
        a_抽象煎饼类 = new a_鸡蛋实体装饰类(a_抽象煎饼类);

        System.out.println(a_抽象煎饼类.getDesc()+" 价格:"+a_抽象煎饼类.getPrice());

    }

}
