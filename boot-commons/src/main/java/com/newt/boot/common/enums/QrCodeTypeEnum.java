package com.newt.boot.common.enums;

public enum QrCodeTypeEnum {
    CUPS("CUPS", "银联标准码"),
    NUCC("NUCC", "网联标准码"),
    IGAS("IGAS", "银行聚合码"),
    OBQR("OBQR", "他行二维码"),
    ;

    private final String code;
    private final String msg;

    QrCodeTypeEnum(String code, String msg) {
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
        for (QrCodeTypeEnum qrCodeTypeEnum : QrCodeTypeEnum.values()) {
            if (code.equals(qrCodeTypeEnum.getCode()) ) {
                return qrCodeTypeEnum.getMsg();
            }
        }
        return CUPS.getMsg();
    }
}
