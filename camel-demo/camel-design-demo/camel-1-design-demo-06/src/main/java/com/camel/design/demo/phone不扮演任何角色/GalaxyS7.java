package com.camel.design.demo.phone不扮演任何角色;

import com.camel.design.demo.service.MicroUsbInterface;

/**
 * @Title: GalaxyS7
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 16:07
 * @Version: 1.0
 */
public class GalaxyS7 {

    private MicroUsbInterface microUsbInterface;

    public GalaxyS7() {
    }

    public GalaxyS7(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge(){
        System.out.println("开始给我的GalaxyS7手机充电...");
        microUsbInterface.chargeWithMicroUsb();
        System.out.println("开始给我的GalaxyS7手机充电...");
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }


}
