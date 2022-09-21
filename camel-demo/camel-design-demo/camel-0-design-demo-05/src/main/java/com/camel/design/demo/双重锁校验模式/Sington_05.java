package com.camel.design.demo.双重锁校验模式;

/**
 * @Title: Sington05
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 10:49
 * @Version: 1.0
 */
public class Sington_05 {

        private static volatile Sington_05 instance;

        /**
        * 构造方法私有化 ，防止外部new
        */
        private Sington_05() {

        }

        /**
        * 双重校验锁，线程安全
        * @return
        */
        public static Sington_05 getInstance(){
            if (instance == null) {
                synchronized (Sington_05.class) {
                    if (instance == null) {
                        instance = new Sington_05();
                    }
                }
            }
            return instance;
        }
}
