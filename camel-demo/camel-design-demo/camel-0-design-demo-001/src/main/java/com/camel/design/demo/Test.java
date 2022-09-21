package com.camel.design.demo;

import com.camel.design.demo.factory.OperationFactory;

/**
 * @Title: Test
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 9:27
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Operation operation = OperationFactory.creatOperation('+');
        operation.numberA = 1;
        operation.numberB = 2;
        System.out.println(operation.result());
    }
}
