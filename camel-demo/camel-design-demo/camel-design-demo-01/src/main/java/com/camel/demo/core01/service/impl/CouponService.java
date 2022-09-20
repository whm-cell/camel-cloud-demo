package com.camel.demo.core01.service.impl;

import com.camel.demo.core01.service.ICommonService;

/**
 * @Title: AService
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 14:17
 * @Version: 1.0
 */
public class CouponService implements ICommonService {
    @Override
    public void sendCoupon() {
        System.out.println("发送优惠券商品");
    }
}