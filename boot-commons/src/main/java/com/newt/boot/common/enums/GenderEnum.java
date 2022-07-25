package com.newt.boot.common.enums;

public enum GenderEnum {

    MALE("M", "男"),
    FEMALE("F", "女");

    private final String code;
    private final String msg;

    GenderEnum(String code, String msg) {
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
