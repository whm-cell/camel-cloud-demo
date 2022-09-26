package com.camel.design.demo.整合第三方api策略模式;


/**
 * @Title: SiginService
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/26 0026 10:46
 * @Version: 1.0
 */
public abstract class SiginService {

    /**
     * 注册
     */
    public ResultMsg regist(String username, String password) {
        // 经过一系列的注册逻辑，比如验证用户名是否已存在
        Member member = new Member();
        member.setUsername(username);
        member.setPassword(password);
        return new ResultMsg(200, "注册成功", member);
    }


    /**
     * 登录
     */
    public ResultMsg login(String username, String password) {
        // 经过一系列的登陆逻辑，比如验证用户名密码正确
        Member member = new Member();
        member.setUsername(username);
        member.setPassword(password);
        return new ResultMsg(200, "登录成功", member);
    }

}
