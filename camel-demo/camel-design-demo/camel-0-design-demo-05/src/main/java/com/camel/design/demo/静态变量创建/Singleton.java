package com.camel.design.demo.静态变量创建;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title: Singleton
 * @Description:  使用静态类实现
 * @author: wanghaiming
 * @date: 2022/9/21 0021 10:30
 * @Version: 1.0
 */
public class Singleton {

    private static Map<String,Object> map  = new ConcurrentHashMap<String, Object>();

}
