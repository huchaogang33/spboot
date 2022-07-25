package com.newt.boot.common.enums;

/**
 * 仅用于商户活动手续费月优惠限额表
 * 业务分组字段
 * @author hcg
 * @since 2022-05-26
 */

public enum BizGroupEnum {

    /**
     * 业务分组
     *   *_*表示刷卡和扫码全部限额
     *   01_*表示 刷卡业务全部限额
     *   01_00表示本行借记卡业务限额
     *   01_01表示本行贷记卡业务限额
     *   01_10表示他行借记卡业务限额
     *   01_11表示他行货记卡业务限额
     *   02_*表示 扫码业务全部限额
     *   02_00表示微信扫码业务限额
     *   02_01表示支付宝扫码业务限额
     *   02_02表示云闪付扫码业务限额
     *
     */



    PAY_BY_CARD_AND_SCAN_CODE("*_*","刷卡和扫码全部限额"),
    PAY_BY_CARD("01_*","刷卡业务全部限额"),
    INNER_DEBIT_ACCOUNT("01_00","本行借记卡业务限额"),
    INNER_CREDIT_ACCOUNT("01_01","本行贷记卡业务限额"),
    OTHER_DEBIT_ACCOUNT("01_10","他行借记卡业务限额"),
    OTHER_CREDIT_ACCOUNT("01_11","他行贷记卡业务限额"),
    SCAN_CODE("02_*","扫码业务全部限额"),
    WECHAT_SCAN_CODE("02_00","微信扫码业务限额"),
    ALI_PAY_SCAN_CODE("02_01","支付宝扫码业务限额"),
    CLOUD_PAY_SCAN_CODE("02_02","云闪付扫码业务限额"),

    ;

    private final String code;
    private final String msg;

    BizGroupEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (BizGroupEnum qrStatusEnum : BizGroupEnum.values()) {
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
