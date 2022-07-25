package com.newt.boot.common.enums;

/**
 * 费率类型
 */
public enum FeeTypeEnum {
    /**
     * 本行借记
     */
    INNER_DEBIT_ACCOUNT("01", "本行借记"),
    /**
     * 本行贷记
     */
    INNER_CREDIT_ACCOUNT("02", "本行贷记"),
    /**
     * 他行借记
     */
    OTHER_DEBIT_ACCOUNT("11", "他行借记"),
    /**
     * 他行贷记
     */
    OTHER_CREDIT_ACCOUNT("12", "他行贷记"),
    /**
     * 银联二维码借记
     */
    UPQR_DEBIT("03", "银联二维码借记"),
    /**
     * 银联二维码贷记
     */
    UPQR_CREDIT("13", "银联二维码贷记"),
    /**
     * 微信
     */
    WECHAT("04", "微信"),
    /**
     * 支付宝
     */
    ALIPAY("05", "支付宝"),
    /**
     * 网联
     */
    NUCC("06", "网联"),
    /**
     * 所有
     */
    ALL("99", "所有"),
    /**
     * 提现手续费
     */
    CASHOUT("07", "提现手续费");

    private String type;
    private String desc;

    FeeTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
