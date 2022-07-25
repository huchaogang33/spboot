package com.newt.boot.common.enums;

public enum CertTypeEnum {
    C01("01", "身份证"),
    C02("02", "军官证"),
    C03("03", "护照"),
    C04("04", "户口簿"),
    C05("05", "士兵证"),
    C06("06", "港澳来往内地通行证"),
    C07("07", "台湾同胞来往内地通行证"),
    C08("08", "临时身份证"),
    C09("09", "外国人居留证"),
    C10("10", "警官证"),
    C99("99", "其他"),
    ;

    private final String code;
    private final String msg;

    CertTypeEnum(String code, String msg) {
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
        for (CertTypeEnum certTypeEnum : CertTypeEnum.values()) {
            if (code.equals(certTypeEnum.getCode()) ) {
                return certTypeEnum.getMsg();
            }
        }
        return C99.getMsg();
    }
}
