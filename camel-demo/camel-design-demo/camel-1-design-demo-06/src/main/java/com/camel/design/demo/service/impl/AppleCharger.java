package com.camel.design.demo.service.impl;

import com.camel.design.demo.service.LightningInterface;

/**
 * @Title: AppleCharger
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 16:05
 * @Version: 1.0
 */
public class AppleCharger implements LightningInterface {

    /**
     * 苹果手机的充电器
     */
    @Override
    public void chargeWithLightning() {
        System.out.println("Lightning充电");
    }
}
