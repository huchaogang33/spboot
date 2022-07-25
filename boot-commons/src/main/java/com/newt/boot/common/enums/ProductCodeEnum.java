package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/2
 * 业务产品代码
 */
public enum ProductCodeEnum {



    /**
     * 00-基础公共
     * 01-刷卡支付
     * 02-付款扫码(主扫)
     * 03-收款扫码(被扫)
     * 04-信用卡分期
     * 05-银行卡支付
     * 06-XX手机银行支付
     * 07-微信支付
     * 08-支付宝支付
     * 09-银联云闪付
     */
    //业务产品代码
    BP00("00", "基础公共"),
    BP01("01", "刷卡支付"),
    BP02("02", "付款扫码"),
    BP03("03", "收款扫码"),
    BP04("04", "信用卡分期"),
    BP05("05", "银行卡支付"),
    BP06("06", "XX手机银行支付"),
    BP07("07", "微信支付"),
    BP08("08", "支付宝支付"),
    BP09("09", "银联云闪付"),



    /**
     * 天数枚举
     */

    DAY_0("0","当日"),
    DAY_1("1","昨日"),
    DAY_7("7","近七日"),
    DAY_14("14","近14日"),
    DAY_15("15","近15日"),
    DAY_30("30","近30日"),
    DAY_90("90","近90日"),

    ;

    private final String code;
    private final String msg;

    ProductCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (ProductCodeEnum qrStatusEnum : ProductCodeEnum.values()) {
            if (code.equals(qrStatusEnum.getCode()) ) {
                return qrStatusEnum.getMsg();
            }
        }
        return null;
    }

    public static ProductCodeEnum getEnmByCode(String code) {
        for (ProductCodeEnum qrStatusEnum : ProductCodeEnum.values()) {
            if (code.equals(qrStatusEnum.getCode()) ) {
                return qrStatusEnum;
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
