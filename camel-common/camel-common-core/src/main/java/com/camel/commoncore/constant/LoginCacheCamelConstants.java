package com.camel.commoncore.constant;

/**
 * @Title: LoginCacheConstants
 * @Description: 存储登录缓存时间
 * @author: wanghaiming
 * @date: 2022/9/15 0015 15:13
 * @Version: 1.0
 */
public class LoginCacheCamelConstants {
    /**
     * 缓存有效期，默认720（分钟）
     */
    public final static long EXPIRATION = 720;

    /**
     * 缓存刷新时间，默认120（分钟）
     */
    public final static long REFRESH_TIME = 120;

    /**
     * 权限缓存前缀
     */
    public final static String LOGIN_TOKEN_KEY = "login_tokens:";
}
