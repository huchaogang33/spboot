package com.newt.boot.common.exception.file;


import com.newt.boot.common.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @author 新大陆金融
 */
public class FileException extends BaseException {

    private static final long serialVersionUID = -4531163531703414725L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
