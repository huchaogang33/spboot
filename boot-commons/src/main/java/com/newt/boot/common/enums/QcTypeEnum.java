package com.newt.boot.common.enums;

public enum QcTypeEnum {

    ERR("01","异常交易"),
    EQUIP_ER("02","终端故障"),
    MIS("03","差错"),
    COST("04","耗材"),
    OTHER("05","其他"),
    ;

    private final String code;
    private final String msg;

    QcTypeEnum(String code, String msg) {
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
