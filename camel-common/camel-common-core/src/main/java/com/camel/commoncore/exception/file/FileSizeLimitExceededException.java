package com.camel.commoncore.exception.file;

/**
 * @Title: FileSizeLimitExceededException
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 10:43
 * @Version: 1.0
 */
public class FileSizeLimitExceededException extends FileException {
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("file.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
