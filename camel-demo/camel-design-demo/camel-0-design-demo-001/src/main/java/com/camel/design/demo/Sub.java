package com.camel.design.demo;

/**
 * @Title: Sub
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 9:17
 * @Version: 1.0
 */
public class Sub extends Operation {
    @Override
    public double result() {
        return numberA - numberB;
    }
}
