package com.newt.boot.common.enums;

public enum QrStatusEnum {
    NORMAL("00", "使用中"),
    DISABLED("01", "已停用"),
    ;

    private final String code;
    private final String msg;

    QrStatusEnum(String code, String msg) {
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
        for (QrStatusEnum qrStatusEnum : QrStatusEnum.values()) {
            if (code.equals(qrStatusEnum.getCode()) ) {
                return qrStatusEnum.getMsg();
            }
        }
        return NORMAL.getMsg();
    }
}
