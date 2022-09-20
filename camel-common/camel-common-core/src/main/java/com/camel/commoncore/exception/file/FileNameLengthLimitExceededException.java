package com.camel.commoncore.exception.file;

/**
 * @Title: FileNameLengthLimitExceededException
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 10:49
 * @Version: 1.0
 */
public class FileNameLengthLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength)
    {
        super("upload.filename.exceed.length", new Object[] { defaultFileNameLength });
    }
}
