package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/25
 * 业务细分  biztype
 */
public enum BizTypeEnum {


    /**
     * 业务细分
     * bizType
     */
    bizType_00("00","微信"),
    bizType_01("01","支付宝"),
    bizType_02("02","云闪付"),

    ;

    private final String code;
    private final String msg;

    BizTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (BizTypeEnum qrStatusEnum : BizTypeEnum.values()) {
            if (code.equals(qrStatusEnum.getCode()) ) {
                return qrStatusEnum.getMsg();
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
