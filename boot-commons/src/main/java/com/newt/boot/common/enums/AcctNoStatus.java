package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/9/23
 * 四要素校验卡状态
 */
public enum AcctNoStatus {

    ACCT_NORMAL("A", "正常"),
    ACCT_SLEEP("B", "睡眠户"),
    ;

    private final String code;
    private final String msg;

    AcctNoStatus(String code, String msg) {
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
