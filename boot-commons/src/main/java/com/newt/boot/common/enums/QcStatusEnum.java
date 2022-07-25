package com.newt.boot.common.enums;

public enum QcStatusEnum {

    SUBMITTED("0", "待处理"),
    FINISHED("1", "已完成"),
    CANCELED("2", "已取消"),
    ;

    private final String code;
    private final String msg;

    QcStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
