package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/10/11
 */
public enum DeviceInfoStatusEnum {

    STATUS_NOT_USE_10("10", "未使用"),

    STATUS_USE_08("08", "已绑定"),

    STATUS_USE_11("11", "已使用"),

    STATUS_DESTROY_12("12", "损毁"),

    STATUS_FAULT_13("13", "故障"),

    STATUS_INSTALL_OUT_14("14", "装机出库"),

    STATUS_WITHDRAW_15("15", "撤机"),

    STATUS_LOSS_16("16", "丢失"),

    STATUS_RETURN_THIRD_17("17", "返还第三方");

    private final String code;
    private final String msg;

    DeviceInfoStatusEnum(String code, String msg) {
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
