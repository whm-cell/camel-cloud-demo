package com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式;

import com.camel.design.demo.整合第三方api策略模式.ResultMsg;

/**
 * @Title: IPassportForThird
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/26 0026 10:52
 * @Version: 1.0
 */
public interface IPassportForThird {

    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);

}
