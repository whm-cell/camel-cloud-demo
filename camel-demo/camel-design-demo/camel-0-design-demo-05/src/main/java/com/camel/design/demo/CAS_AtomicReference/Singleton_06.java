package com.camel.design.demo.CAS_AtomicReference;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Title: Singleton_06
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 10:56
 * @Version: 1.0
 */
public class Singleton_06 {

    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<Singleton_06>();

    private Singleton_06() {}

    public static Singleton_06 getInstance(){
        for(;;){
            Singleton_06 singleton06 = INSTANCE.get();
            if(null != singleton06){
                return singleton06;
            }
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }
}
