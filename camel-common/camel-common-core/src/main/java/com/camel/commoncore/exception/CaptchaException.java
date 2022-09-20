package com.camel.commoncore.exception;

/**
 * @Title: CaptchaException
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 10:34
 * @Version: 1.0
 */
public final class CaptchaException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public CaptchaException(String message)
    {
        super(message);
    }

}
