package com.camel.demo.core02.factory;

import com.camel.demo.core02.service.IDeptment;
import com.camel.demo.core02.service.IUser;

/**
 * @Title: IFactory
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 17:19
 * @Version: 1.0
 */
public interface IFactory {
    IUser createUser();
    IDeptment createDeptment();
}

