package com.newt.boot.common.exception.file;

/**
 * 文件名大小限制异常类
 */
public class FileSizeLimitExceededException extends FileException {

    private static final long serialVersionUID = 3882452780468822839L;

    public FileSizeLimitExceededException(long defaultMaxSize) {
        super("upload.exceed.maxSize", new Object[]{defaultMaxSize});
    }
}
