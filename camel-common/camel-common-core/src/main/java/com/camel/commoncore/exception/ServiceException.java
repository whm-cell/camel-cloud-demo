package com.camel.commoncore.exception;

/**
 * @Title: ServiceException
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 10:28
 * @Version: 1.0
 *
 * final 修饰，不允许被继承
 */
public final class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误提示
     */
    private String message;

    /**
     * 错误明细，内部调试错误
     */
    private String detailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException() {}

    public ServiceException(String message)
    {
        this.message = message;
    }

    public ServiceException(Integer code,String message)
    {
        this.message = message;
        this.code = code;
    }

    public String getDetailMessage()
    {
        return detailMessage;
    }

    @Override
    public String getMessage()
    {
        return message;
    }

    public Integer getCode()
    {
        return code;
    }

    public ServiceException setMessage(String message)
    {
        this.message = message;
        return this;
    }

    public ServiceException setDetailMessage(String detailMessage)
    {
        this.detailMessage = detailMessage;
        return this;
    }
}
