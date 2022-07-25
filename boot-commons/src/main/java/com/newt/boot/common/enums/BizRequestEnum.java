package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/7/30
 */
public enum BizRequestEnum {

    BIZ_TYPE("00","业务分类"),
    INST_ID("000","机构标识"),
    SRC_SYS_ID("MCPS","源系统标识"),
    VERSION("1.0.0","版本号"),
    CHANNEL_ID("APP","渠道标识"),//TODO 待确认
    TRANSCCY("156","交易币种"),

    ;


    private final String code;
    private final String msg;

    BizRequestEnum(String code, String msg) {
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
