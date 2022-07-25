package com.newt.boot.common.enums;

/***
 * 核查商户信息是否有效状态
 */
public enum DataStatusEnum {
    DATA_Y("Y", "有效"),
    DATA_N("N", "失效"),
    ;

    private final String code;
    private final String msg;

    DataStatusEnum(String code, String msg) {
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
        for (DataStatusEnum certTypeEnum : DataStatusEnum.values()) {
            if (code.equals(certTypeEnum.getCode()) ) {
                return certTypeEnum.getMsg();
            }
        }
        return null;
    }
}
