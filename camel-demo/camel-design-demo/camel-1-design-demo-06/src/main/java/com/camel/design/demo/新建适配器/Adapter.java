package com.camel.design.demo.新建适配器;

import com.camel.design.demo.service.LightningInterface;
import com.camel.design.demo.service.MicroUsbInterface;

/**
 * @Title: Adapter
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 16:25
 * @Version: 1.0
 */
public class Adapter implements LightningInterface {

    private MicroUsbInterface microUsbInterface;

    public Adapter(){

    }

    public Adapter(MicroUsbInterface microUsbInterface){
        this.microUsbInterface = microUsbInterface;
    }


    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }

    // ---------------get  set -----------------
    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
