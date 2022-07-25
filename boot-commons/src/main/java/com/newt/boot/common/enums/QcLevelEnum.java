package com.newt.boot.common.enums;

public enum QcLevelEnum {

    HIGH("H", "高"),
    MIDDLE("M", "中"),
    LOW("L", "低"),
    ;

    private final String code;
    private final String msg;

    QcLevelEnum(String code, String msg) {
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
