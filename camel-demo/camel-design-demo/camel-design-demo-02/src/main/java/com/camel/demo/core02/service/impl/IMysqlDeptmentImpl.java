package com.camel.demo.core02.service.impl;

import com.camel.demo.core02.service.IDeptment;

/**
 * @Title: IMysqlDeptmentImpl
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 17:25
 * @Version: 1.0
 */
public class IMysqlDeptmentImpl implements IDeptment {

    @Override
    public void insertDeptment() {
        System.out.println("insertDeptment");
    }

    @Override
    public void updateDeptment() {
        System.out.println("updateDeptment");
    }
}