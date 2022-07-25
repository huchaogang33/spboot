package com.newt.boot.common.enums;

public enum MchtUserStatusEnum {
    ACTIVED("A", "正常"),
    DISABLED("D", "停用"),
    CANCLE("C","注销")

        ;
    private final String code;
    private final String msg;

    MchtUserStatusEnum(String code, String msg) {
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
