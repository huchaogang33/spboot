package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/6/28
 *
 */
public enum IsSignEnum {
    /**是否签约 10 需签约 ，20 无需签约且审核中 ,30无需签约审核通过 40 绑卡*/

    IS_SIGN("10", "需签约"),
    NO_SIGN("20", "无需签约且审核中"),
    NO_MARNL_PASS("30", "无需签约审核通过"),
    BIND_CARD("40","需绑卡"),
    ;

    private String code;
    private String msg;

    private IsSignEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
