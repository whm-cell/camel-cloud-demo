package com.camel.demo.test;

import com.camel.demo.StoreFactory;
import org.junit.jupiter.api.Test;

/**
 * @Title: ApiTest
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 14:34
 * @Version: 1.0
 */
public class ApiTest {

    @Test
    public void test() {
        StoreFactory storeFactory = new StoreFactory();

        storeFactory.getCommodityService(1).sendCoupon();
        

        storeFactory.getCommodityService(2).sendCoupon();

        storeFactory.getCommodityService(3).sendCoupon();




    }

}
