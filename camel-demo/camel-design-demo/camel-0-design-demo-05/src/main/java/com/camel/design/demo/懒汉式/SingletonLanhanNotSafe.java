package com.camel.design.demo.懒汉式;

/**
 * @Title: Singleton
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 10:32
 * @Version: 1.0
 */
public class SingletonLanhanNotSafe {

    private static SingletonLanhanNotSafe instance;

    /**
     * 构造方法私有化 ，防止外部new
     */
    private SingletonLanhanNotSafe() {

    }

    /**
     * 懒汉式，线程不安全
     * @return
     */
    public static SingletonLanhanNotSafe getInstance(){
        if(instance == null){
            instance = new SingletonLanhanNotSafe();
        }
        return instance;
    }


}
