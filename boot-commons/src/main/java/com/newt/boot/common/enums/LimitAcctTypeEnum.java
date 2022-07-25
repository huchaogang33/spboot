package com.newt.boot.common.enums;

public enum LimitAcctTypeEnum {
    DEBIT_ACCT("20", "借记账户"),
    CREDIT_ACCT("21", "贷记账户"),
    DEFAULT_ACCT("*", "不区分账户"),
    ;

    private final String code;
    private final String msg;

    LimitAcctTypeEnum(String code, String msg) {
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
