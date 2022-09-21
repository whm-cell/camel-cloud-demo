package com.camel.design.demo;

/**
 * @Title: Add
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 9:17
 * @Version: 1.0
 */
public class Add extends Operation {
    @Override
    public double result() {
        return numberA + numberB;
    }
}
