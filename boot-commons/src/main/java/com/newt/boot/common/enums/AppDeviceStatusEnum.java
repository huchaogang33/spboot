package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/10/14
 * 用于设备状态映射-app终端状态-使用中-已停用-已注销
 */
public enum AppDeviceStatusEnum {


    STATUS_USE_11("11", "使用中"),
    STATUS_USE_Y("Y", "使用中"),
    STATUS_NOT_USE("N","已停用"),
    STATUS_CANCEL("L","已注销"),
    ;

    private final String code;
    private final String msg;

    AppDeviceStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsgByCode(String code) {
        for (AppDeviceStatusEnum bindStatusEnum : AppDeviceStatusEnum.values()) {
            if (code.equals(bindStatusEnum.getCode()) ) {
                return bindStatusEnum.getMsg();
            }
        }
        return null;
    }
}
