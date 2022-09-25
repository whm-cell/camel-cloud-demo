package com.camel.design.demo.升级版本2;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        String promotionKey = "lijian";
        PromotionActivity promotionActivity = new PromotionActivity(策略工厂为了消除ifelse.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
