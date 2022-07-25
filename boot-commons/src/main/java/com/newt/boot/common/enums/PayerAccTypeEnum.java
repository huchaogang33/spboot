package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/26
 */
public enum PayerAccTypeEnum {


    /**
     * 00-本行借记账户
     * 01-本行贷记账户
     * 02-本行存折
     * 03-本行内部户
     * 04-本行对公户
     * 10-他行借记账户
     * 11-他行贷记账户
     * 12-他行存折
     * 13-他行内部户
     * 14-他行对公户
     * 20-积分
     * 21-优惠券
     * 22-红包
     * 23-零钱
     * *-其它
     */

    OWN_DEBIT("00","本行借记账户"),
    OWN_CREDIT("01","本行贷记账户"),
    OWN_BANK_BOOK("02","本行存折"),
    OWN_INTERNAL_ACCOUNT("03","本行内部户"),
    OWN_CORPORATE_ACCOUNT("04","本行对公户"),
    OTHER_DEBIT("10","他行借记账户"),
    OTHER_CREDIT("11","他行贷记账户"),
    OTHER_BANK_BOOK("12","他行存折"),
    OTHER_INTERNAL_ACCOUNT("13","他行内部户"),
    OTHER_CORPORATE_ACCOUNT("14","他行对公户"),
    COUPON("21","优惠券"),
    SCORE("20","积分"),
    REDPACKET("22","红包"),
    LOOSE_CHANGE("23","零钱"),
    DEFAULT("*","其它")
    ;

    private final String code;
    private final String msg;

    PayerAccTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (PayerAccTypeEnum qrStatusEnum : PayerAccTypeEnum.values()) {
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
