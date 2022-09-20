package com.camel.commoncore.exception.file;

import com.camel.commoncore.exception.base.BaseException;

/**
 * @Title: FileException
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 10:41
 * @Version: 1.0
    文件上传异常实现 ，继承自BaseException
 */

public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
