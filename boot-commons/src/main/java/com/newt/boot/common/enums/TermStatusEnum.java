package com.newt.boot.common.enums;

public enum TermStatusEnum {

    T00("00", "非正式"),
    T01("01", "使用中"),
    T02("02", "已停用"),
    T03("03", "已注销"),
    T04("04", "已注册"),
    ;

    private final String code;
    private final String msg;

    TermStatusEnum(String code, String msg) {
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
        for (TermStatusEnum termStatusEnum : TermStatusEnum.values()) {
            if (code.equals(termStatusEnum.getCode()) ) {
                return termStatusEnum.getMsg();
            }
        }
        return T00.getMsg();
    }
}
