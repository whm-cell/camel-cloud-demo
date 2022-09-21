package com.camel.demo;

import com.camel.demo.core01.service.ICommonService;
import com.camel.demo.core01.service.impl.CardService;
import com.camel.demo.core01.service.impl.CouponService;
import com.camel.demo.core01.service.impl.GoodsService;

/**
 * @Title: StoreFactory  工厂模式的总调度类
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 14:31
 * @Version: 1.0
 */
public class StoreFactory {

    /**
     * 工厂模式的总调度类  - 实现一个入口，对不同的服务进行调度
     * @param commodityType
     * @return
     */
    public ICommonService getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponService();
        if (2 == commodityType) return new GoodsService();
        if (3 == commodityType) return new CardService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
