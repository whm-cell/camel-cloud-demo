package com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式.适配器;

import com.camel.design.demo.整合第三方api策略模式.ResultMsg;

/**
 * @Title: LoginForQQAdapter
 * @Description: 微信登录适配器
 * @author: wanghaiming
 * @date: 2022/9/26 0026 11:01
 * @Version: 1.0
 */
public class LoginForWxAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWxAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
