package com.camel.demo.core01.workshop.impl;

import com.camel.demo.core01.workshop.ICacheAdapter;

/**
 * @Title: ACacheImpl
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 15:35
 * @Version: 1.0
 */
public class ACacheImpl implements ICacheAdapter {

    public String get(String key) {
        return "ACacheImpl";
    }
}
