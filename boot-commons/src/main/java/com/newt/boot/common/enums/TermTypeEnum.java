package com.newt.boot.common.enums;

public enum TermTypeEnum {
    T01("01", "传统POS"),
    T02("02", "有线拨号POS"),
    T03("03", "电话POS"),
    T04("04", "智能POS"),
    T05("05", "mPOS"),
    T06("06", "无线POS"),
    T07("07", "mis终端");

    private final String code;
    private final String msg;

    TermTypeEnum(String code, String msg) {
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
        for (TermTypeEnum termTypeEnum : TermTypeEnum.values()) {
            if (code.equals(termTypeEnum.getCode()) ) {
                return termTypeEnum.getMsg();
            }
        }
        return T01.getMsg();
    }
}
