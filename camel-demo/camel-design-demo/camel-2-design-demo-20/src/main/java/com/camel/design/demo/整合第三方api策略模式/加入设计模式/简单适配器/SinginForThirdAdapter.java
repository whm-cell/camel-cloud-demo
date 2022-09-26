package com.camel.design.demo.整合第三方api策略模式.加入设计模式.简单适配器;

import com.camel.design.demo.整合第三方api策略模式.ResultMsg;
import com.camel.design.demo.整合第三方api策略模式.SiginService;

/**
 * @Title: SinginForThirdAdapter
 * @Description:  简单适配器版本
 * @author: wanghaiming
 * @date: 2022/9/26 0026 10:48
 * @Version: 1.0
 */
public class SinginForThirdAdapter extends SiginService {

    /**
     * 这种是直接调用 父类的接口
     * @param qqName
     * @param qqPassword
     * @return
     */
    public ResultMsg loginForQQ(String qqName, String qqPassword) {
        // 1.0 假设QQ登录独有的适配逻辑，是通过qq账号密码加个qq后缀得到userName和password
        String userName = qqName + "qq";
        String password = qqPassword + "qq";
        // 2.0 调用原本的登录逻辑
        return super.login(userName, password);
    }

    /**
     * 登录微信  但是这种适配器模式也不便于扩展，各个api的实现位置，都是写死在适配器中的
     * @param wxName
     * @param wxPassword
     * @return
     */
    public ResultMsg loginWx(String wxName, String wxPassword) {
        String userName = wxName + "wx";
        String password = wxPassword + "wx";
        // 2.0 调用原本的登录逻辑
        return super.login(userName, password);
    }
}
