package com.camel.design.demo.factory;

import com.camel.design.demo.Add;
import com.camel.design.demo.Operation;
import com.camel.design.demo.Sub;

/**
 * @Title: OperationFactory
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 9:25
 * @Version: 1.0
 */
public class OperationFactory {

    public static Operation creatOperation(char operator){
        return switch (operator) {
            case '+' -> new Add();
            case '-' -> new Sub();
            default -> throw new RuntimeException("不支持的运算符");
        };
    }
}
