package com.camel.design.demo.phone不扮演任何角色;

import com.camel.design.demo.service.LightningInterface;

/**
 * @Title: Iphone6Plus
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 16:07
 * @Version: 1.0
 */
public class Iphone6Plus {
    private LightningInterface lightningInterface;

    public Iphone6Plus() {
    }

    public Iphone6Plus(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    public void charge() {
        System.out.println("开始给我的Iphone6Plus手机充电...");
        lightningInterface.chargeWithLightning();
        System.out.println("结束给我的Iphone6Plus手机充电...");
    }

    public LightningInterface getLightningInterface() {
        return lightningInterface;
    }

    public void setLightningInterface(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }
}
