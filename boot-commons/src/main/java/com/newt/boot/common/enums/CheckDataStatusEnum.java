package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/2/22
 */
public enum CheckDataStatusEnum {
    DATA_Y("Y", "有效"),
    DATA_N("N", "失效"),
    ;

    private final String code;
    private final String msg;

    CheckDataStatusEnum(String code, String msg) {
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
        for (CheckDataStatusEnum certTypeEnum : CheckDataStatusEnum.values()) {
            if (code.equals(certTypeEnum.getCode()) ) {
                return certTypeEnum.getMsg();
            }
        }
        return null;
    }
}
