package com.newt.boot.common.enums;

public enum BindDevTypeEnum {
    PHONE("01", "手机设备"),
    VOICE("02", "语音设备");

    private final String code;
    private final String msg;

    BindDevTypeEnum(String code, String msg) {
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
        for (BindDevTypeEnum bindDevTypeEnum : BindDevTypeEnum.values()) {
            if (code.equals(bindDevTypeEnum.getCode()) ) {
                return bindDevTypeEnum.getMsg();
            }
        }
        return VOICE.getMsg();
    }
}
