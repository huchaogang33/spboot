package com.newt.boot.common.enums;

public enum MchntNatureEnum {
    NOT_CHAIN("01", "非连锁"),
    CHAIN_MCHNT("02", "连锁商户"),
    CHAIN_MCHNT_STORE("03", "连锁商户门店"),
    ;

    private final String code;
    private final String msg;

    MchntNatureEnum(String code, String msg) {
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
        for (MchntNatureEnum mchntNatureEnum : MchntNatureEnum.values()) {
            if (code.equals(mchntNatureEnum.getCode()) ) {
                return mchntNatureEnum.getMsg();
            }
        }
        return null;
    }
}
