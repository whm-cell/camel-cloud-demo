package com.camel.design.demo.内部类模式_推荐;

/**
 * @Title: Sington内部类实现
 * @Description:  内部类的实现方案其实其实也是基于  static final形式的成员变量实现。
 * @author: wanghaiming
 * @date: 2022/9/21 0021 10:45
 * @Version: 1.0
 */
public class Sington内部类实现 {

    private Sington内部类实现() {
    }

    private static class SingletonHolder {
        private static final Sington内部类实现 INSTANCE = new Sington内部类实现();
    }

    public static Sington内部类实现 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
