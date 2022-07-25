package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/25
 */
public enum  TxnNumEnum {


    /**
     * 条码支付（被扫）     P01MC006
     *    主扫          P01MC003
     *     * 银联卡预授权         P06MC102
     *     * 银联卡预授权完成     P06MC502
     *      * 银联卡消费         P01MC001
     *      * 动态收款码          T00MC020
     */

    SWEP("P01MC006","条码支付(被扫)"),
    MAIN_SWEP("P01MC003","主扫"),
    UP_PRE_COMPLE("P06MC502","银联卡预授权完成"),
    UP_CONSUM("P01MC001","银联卡消费"),
    QR_DYBAMIC_CODE("T00MC020","动态收款码"),

    UP_PRE_NOT("P06MC102","银联卡预授权"),
    /**

     * 条码支付撤销         P03MC006
     * 条码支付退款         P04MC004

     * 银联卡预授权冲正     P06MC202
     * 银联卡预授权撤销     P06MC302

     * 银联卡预授权完成撤销 P06MC702
     *
     * 银联卡消费冲正     P02MC001
     * 银联卡消费撤销     P03MC001
     * 银联卡消费退货     P04MC001

     */
    PAY_REVOKE("P03MC006","条码支付撤销"),
    PAY_REFUND("P04MC004","条码支付退款"),
    UP_PRE_REVERSAL("P06MC202","银联卡预授权冲正"),
    UP_PRE_REVOKE("P06MC302","银联卡预授权撤销"),
    UP_PRE_COMPLE_REVOKE("P06MC702","银联卡预授权完成撤销"),
    UP_CONSUM_REVERSAL("P02MC001","银联卡消费冲正"),
    UP_CONSUM_REVOKE("P03MC001","银联卡消费撤销"),
    UP_CONSUM_REFUND("P04MC001","银联卡消费退货"),

    ;




    private final String code;
    private final String msg;

    TxnNumEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (TxnNumEnum qrStatusEnum : TxnNumEnum.values()) {
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
