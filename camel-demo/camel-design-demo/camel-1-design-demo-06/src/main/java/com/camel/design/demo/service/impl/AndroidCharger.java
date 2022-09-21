package com.camel.design.demo.service.impl;

import com.camel.design.demo.service.MicroUsbInterface;

/**
 * @Title: AndordCharger
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 16:03
 * @Version: 1.0
 */
public class AndroidCharger implements MicroUsbInterface {

    /**
     * 安卓手机的充电器
     */
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("MicroUsb充电");
    }
}
