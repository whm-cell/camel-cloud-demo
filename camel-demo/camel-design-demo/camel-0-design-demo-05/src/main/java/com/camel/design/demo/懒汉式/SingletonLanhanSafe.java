package com.camel.design.demo.懒汉式;

/**
 * @Title: SingletonLanhanSafe
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 10:35
 * @Version: 1.0
 */
public class SingletonLanhanSafe {

    private static SingletonLanhanSafe instance;

    /**
     * 构造方法私有化 ，防止外部new
     */
    private SingletonLanhanSafe() {

    }

    /**
     * 懒汉式，线程安全
     * @return
     */
    public static synchronized SingletonLanhanSafe getInstance() {
        if (instance == null) {
            instance = new SingletonLanhanSafe();
        }
        return instance;
    }
}
