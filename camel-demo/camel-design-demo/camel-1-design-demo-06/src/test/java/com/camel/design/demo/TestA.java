package com.camel.design.demo;

import com.camel.design.demo.service.impl.AndroidCharger;
import com.camel.design.demo.service.impl.AppleCharger;
import com.camel.design.demo.新建适配器.Adapter;
import org.junit.jupiter.api.Test;

/**
 * @Title: Test
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 16:30
 * @Version: 1.0
 */
public class TestA {

    @Test()
    public void test(){
        Adapter adapter = new Adapter(new AndroidCharger());
        adapter.chargeWithLightning();

        /**
         * 适配器模式，不对原有的类进行修改，只是对原有的类进行适配
         * 让新的类，可以通过调用一个适配器的方式，来调用原有的类
         */
    }
}
