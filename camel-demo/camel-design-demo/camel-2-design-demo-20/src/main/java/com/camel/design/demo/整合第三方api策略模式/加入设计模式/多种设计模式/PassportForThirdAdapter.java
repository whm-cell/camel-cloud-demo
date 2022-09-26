package com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式;

import com.camel.design.demo.整合第三方api策略模式.ResultMsg;
import com.camel.design.demo.整合第三方api策略模式.SiginService;
import com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式.适配器.LoginAdapter;
import com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式.适配器.LoginForQQAdapter;
import com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式.适配器.LoginForTelAdapter;
import com.camel.design.demo.整合第三方api策略模式.加入设计模式.多种设计模式.适配器.LoginForWxAdapter;

import java.lang.reflect.InvocationTargetException;

/**
 * @Title: PassportForThirdAdapter
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/26 0026 10:52
 * @Version: 1.0
 */
public class PassportForThirdAdapter extends SiginService implements  IPassportForThird{
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWxAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForTelAdapter.class);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {

        try{
            // 通过反射机制，获取对象  适配器不一样要实现接口
            LoginAdapter instance = clazz.getDeclaredConstructor().newInstance(5);

            // 判断传递过来的适配器能否处理指定的逻辑
            if(instance.support(instance)){
                return instance.login(key,instance);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
