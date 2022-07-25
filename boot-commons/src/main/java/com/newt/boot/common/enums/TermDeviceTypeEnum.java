package com.newt.boot.common.enums;

public enum TermDeviceTypeEnum {
    TERM("Term", "终端"),
    DEVICE("Device", "设备"),
    CODE("Code", "台牌和静态二维码"),
    OTHER("Other", "其他"),
    ;

    private final String code;
    private final String msg;

    TermDeviceTypeEnum(String code, String msg) {
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
        for (TermDeviceTypeEnum termDeviceTypeEnum : TermDeviceTypeEnum.values()) {
            if (code.equals(termDeviceTypeEnum.getCode()) ) {
                return termDeviceTypeEnum.getMsg();
            }
        }
        return OTHER.getMsg();
    }
}
