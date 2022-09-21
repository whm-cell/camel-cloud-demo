package com.camel.demo.core02.service.impl;

import com.camel.demo.core02.service.IUser;

/**
 * @Title: IMysqlUserImpl
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 17:26
 * @Version: 1.0
 */
public class IMysqlUserImpl implements IUser {

    @Override
    public void insertUser() {
        System.out.println("insertUser");
    }

    @Override
    public void updateUser() {
        System.out.println("updateUser");
    }
}

