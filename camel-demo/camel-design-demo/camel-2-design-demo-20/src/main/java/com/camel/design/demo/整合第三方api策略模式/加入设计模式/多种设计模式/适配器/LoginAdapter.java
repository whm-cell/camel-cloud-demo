package com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式.适配器;

import com.camel.design.demo.整合第三方api策略模式.ResultMsg;

/**
 * @Title: LoginAdapter
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/26 0026 10:54
 * @Version: 1.0
 *
 *  * 在适配器里面，这个接口是可有可无，不要跟模板模式混淆
 *  * 模板模式一定是抽象类，而这里仅仅只是一个接口
 */
public interface LoginAdapter {

    /**
     * 判断适配器是否适配
     */
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);


}
