package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/10/18
 *
 */
public enum MsgPushKeyEnum {

    //01(阿里云)

    ALI_CLOUD("01", "阿里云")
    ;

    private final String code;
    private final String msg;

    MsgPushKeyEnum(String code, String msg) {
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
