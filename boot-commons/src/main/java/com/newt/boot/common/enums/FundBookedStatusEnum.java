package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/1/12
 * t_c_mchnt_day_statis  入账状态
 */
public enum FundBookedStatusEnum {

    /**
     * BOOKED 已入账
     * CHARGED 已挂帐
     * DELAYED 已延迟
     */
    BOOKED("BOOKED","已入账"),
    CHARGED("CHARGED","已挂帐"),
    DELAYED("DELAYED","已延迟"),

    ;
    private final String code;
    private final String msg;

    FundBookedStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (FundBookedStatusEnum qrStatusEnum : FundBookedStatusEnum.values()) {
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
