package com.newt.boot.common.enums;

public enum LimitTypeEnum {
    MCHNT_LIMIT("11", "商户限额"),
    MCHNT_TRADE_LIMIT("12", "商户交易限额"),
    MCHNT_REFUND_LIMIT("14", "商户退货限额"),
    ;

    private final String code;
    private final String msg;

    LimitTypeEnum(String code, String msg) {
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
