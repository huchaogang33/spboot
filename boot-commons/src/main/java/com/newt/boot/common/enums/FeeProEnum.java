package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/25
 */
public enum FeeProEnum {


    /**
     * 01-本行借记卡
     * 11-他行借记卡
     * 02-本行贷记卡
     * 12-他行贷记卡
     * 03-银联二维码借记
     * 13-银联二维码贷记
     * 04-微信
     * 05-支付宝
     * 06-网联
     */

    //费率类型
    FEE01("01","本行借记卡"),
    FEE02("02","本行贷记卡"),
    FEE11("11","他行借记卡"),
    FEE12("12","他行贷记卡"),
    FEE03("03","银联二维码借记"),
    FEE13("13","银联二维码贷记"),
    FEE04("04","微信"),
    FEE05("05","支付宝"),
    FEE06("06","网联"),

    ;
    private final String code;
    private final String msg;

    FeeProEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (FeeProEnum qrStatusEnum : FeeProEnum.values()) {
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
