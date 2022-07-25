package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/10/19
 * 结算账户类型 对公 04对私 01
 */
public enum SettleAcctTypeEnum {


    PREIVATE("00", "对私"),
    PUBLIC("04", "对公")
    ;

    private final String code;
    private final String msg;

    SettleAcctTypeEnum(String code, String msg) {
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
