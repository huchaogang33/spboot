package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/31
 */
public enum PayTypeEnum {

    /**
     * 00-本行卡支付
     * 01-他行卡支付
     * 02-微信支付
     * 03-支付宝支付
     * 04-银联云闪付
     * 05-分期支付
     * 06-积分支付
     * 07-优惠券支付
     * 08-红包支付
     * 09-零钱支付
     * *-其它支付方式
     */

    WECAR_PAY("02","微信支付"),
    ALI_PAY("03","支付宝支付"),
    UNI_PAY("04","银联云闪付"),
    STAGES_PAY("05","分期支付"),

    ;

    private final String code;
    private final String msg;

    PayTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (PayTypeEnum qrStatusEnum : PayTypeEnum.values()) {
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
