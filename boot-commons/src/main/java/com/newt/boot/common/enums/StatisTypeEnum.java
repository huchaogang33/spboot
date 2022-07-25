package com.newt.boot.common.enums;

public enum StatisTypeEnum {
    DAY("D", "日"),
    MONTH("M", "月");

    private final String code;
    private final String msg;

    StatisTypeEnum(String code, String msg) {
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
