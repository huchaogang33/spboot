package com.newt.boot.common.enums;

public enum BindStatusEnum {
    UNBINDED("00", "未绑定"),
    BINDED("01", "已绑定");

    private final String code;
    private final String msg;

    BindStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsgByCode(String code) {
        for (BindStatusEnum bindStatusEnum : BindStatusEnum.values()) {
            if (code.equals(bindStatusEnum.getCode()) ) {
                return bindStatusEnum.getMsg();
            }
        }
        return UNBINDED.getMsg();
    }
}
