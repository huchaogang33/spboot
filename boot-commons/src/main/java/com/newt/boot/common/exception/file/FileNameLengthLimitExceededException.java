package com.newt.boot.common.exception.file;

/**
 * 文件名称超长限制异常类
 *
 * @author 新大陆金融
 */
public class FileNameLengthLimitExceededException extends FileException {

    private static final long serialVersionUID = 3942741602870340551L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength) {
        super("upload.filename.exceed.length", new Object[]{defaultFileNameLength});
    }
}
