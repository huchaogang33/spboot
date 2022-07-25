package com.newt.boot.common.enums;

public enum BizStatusEnum {
    BIZ_SUCCESSED("00", "交易成功"),
    BIZ_PROCESSING("01", "交易处理中"),
    BIZ_FAILED("02", "交易失败"),
    PAYING("03", "付款中"),
    CANCELED("10", "已撤销"),
    PART_CANCELES("11", "部分撤销"),
    REVERSED("20", "已冲正"),
    REFUND_SUCCESSED("30", "已退款"),
    PART_REFUND_SUCCESSED("31", "部分退款"),
    AUTH_UNFINISHED("40", "授权未完成"),
    AUTH_FINISHED("41", "授权已完成"),
    SETTLED("99", "已清算"),
    ;

    private final String code;
    private final String msg;

    BizStatusEnum(String code, String msg) {
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
