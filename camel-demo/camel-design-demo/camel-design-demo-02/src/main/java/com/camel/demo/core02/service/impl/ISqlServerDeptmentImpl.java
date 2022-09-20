package com.camel.demo.core02.service.impl;

import com.camel.demo.core02.service.IDeptment;

/**
 * @Title: ISqlServerDeptmentImpl
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 17:26
 * @Version: 1.0
 */
public class ISqlServerDeptmentImpl implements IDeptment {

    @Override
    public void insertDeptment() {
        System.out.println("insertDeptment");
    }

    @Override
    public void updateDeptment() {
        System.out.println("updateDeptment");
    }
}
