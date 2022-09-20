package com.camel.commoncore.exception;

/**
 * @Title: InnerAuthException
 * @Description: 内部认证异常
 * @author: wanghaiming
 * @date: 2022/9/20 0020 10:31
 * @Version: 1.0
 */
public final class InnerAuthException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public InnerAuthException(String message)
    {
        super(message);
    }

}
