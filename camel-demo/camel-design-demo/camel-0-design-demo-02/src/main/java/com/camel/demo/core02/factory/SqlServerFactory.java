package com.camel.demo.core02.factory;

import com.camel.demo.core02.service.IDeptment;
import com.camel.demo.core02.service.impl.ISqlServerDeptmentImpl;
import com.camel.demo.core02.service.impl.ISqlServerUserImpl;
import com.camel.demo.core02.service.IUser;

/**
 * @Title: SqlServerFactory
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 17:28
 * @Version: 1.0
 */
public class SqlServerFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new ISqlServerUserImpl();
    }

    @Override
    public IDeptment createDeptment() {
        return new ISqlServerDeptmentImpl();
    }
}
