package com.camel.design.demo.饿汉式_安全;

/**
 * @Title: SingletonEHanSafe
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 10:36
 * @Version: 1.0
 */
public class SingletonEHanSafe {

    /**
     * 这个饿汉式，相当于静态成员变量在系统启动的时候就已经初始化了 ，饭后全局就持有一份，所以这个是安全的！
     */
    private static SingletonEHanSafe instance = new SingletonEHanSafe();

    /**
    * 构造方法私有化 ，防止外部new
    */
    private SingletonEHanSafe() {

    }

    /**
    * 饿汉式，线程安全
    * @return
    */
    public static SingletonEHanSafe getInstance(){
        return instance;
    }

}
