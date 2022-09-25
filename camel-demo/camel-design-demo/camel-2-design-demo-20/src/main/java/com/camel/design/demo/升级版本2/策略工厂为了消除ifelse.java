package com.camel.design.demo.升级版本2;

import java.util.HashMap;
import java.util.Map;

public class 策略工厂为了消除ifelse {

    private static Map<String,PromotionStrategy> map = new HashMap<>();

    static {
        map.put(activity.fanxian,new FanXianPromotionStrategy());
        map.put(activity.manjian, new ManJianPromotionStrategy());
        map.put(activity.lijian, new LiJianPromotionStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = map.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface activity{
        String manjian = "manjian";
        String fanxian = "fanxian";
        String lijian = "lijian";
    }
}
