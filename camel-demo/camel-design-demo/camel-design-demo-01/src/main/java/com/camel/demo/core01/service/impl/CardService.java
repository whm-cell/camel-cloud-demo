package com.camel.demo.core01.service.impl;

import com.camel.demo.core01.service.ICommonService;

/**
 * @Title: CardService 卡片商品 - 商品的实现类（具体策略角色 - 这一层并不会执行真正的发送功能，而是交付给其它的真正发送的服务）
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 14:17
 * @Version: 1.0
 */
public class CardService implements ICommonService {
    @Override
    public void sendCoupon() {
        System.out.println("发送卡片商品");
    }
}
