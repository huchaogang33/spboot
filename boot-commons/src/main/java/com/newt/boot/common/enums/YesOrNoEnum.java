package com.newt.boot.common.enums;

public enum YesOrNoEnum {
    YES("Y", "是"),
    NO("N", "否");

    private final String code;
    private final String msg;

    YesOrNoEnum(String code, String msg) {
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
        for (YesOrNoEnum yesOrNoEnum : YesOrNoEnum.values()) {
            if (code.equals(yesOrNoEnum.getCode()) ) {
                return yesOrNoEnum.getMsg();
            }
        }
        return YES.getMsg();
    }
}
