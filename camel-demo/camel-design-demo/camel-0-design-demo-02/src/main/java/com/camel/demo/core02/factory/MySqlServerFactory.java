package com.camel.demo.core02.factory;

import com.camel.demo.core02.service.IDeptment;
import com.camel.demo.core02.service.IUser;
import com.camel.demo.core02.service.impl.IMysqlDeptmentImpl;
import com.camel.demo.core02.service.impl.IMysqlUserImpl;

/**
 * @Title: MySqlServerFactory
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 17:30
 * @Version: 1.0
 */
public class MySqlServerFactory implements IFactory {


    @Override
    public IUser createUser() {
        return new IMysqlUserImpl();
    }

    @Override
    public IDeptment createDeptment() {
        return new IMysqlDeptmentImpl();
    }
}
