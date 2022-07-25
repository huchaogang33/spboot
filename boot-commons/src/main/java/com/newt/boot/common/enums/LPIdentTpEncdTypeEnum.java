package com.newt.boot.common.enums;

public enum LPIdentTpEncdTypeEnum {
	
	IDENNO_0("0", "居民身份证"),
	IDENNO_1("1", "护照"),
	IDENNO_2("Z", "护照"),
    ;

    private final String code;
    private final String msg;

    LPIdentTpEncdTypeEnum(String code, String msg) {
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
        for (LPIdentTpEncdTypeEnum certTypeEnum : LPIdentTpEncdTypeEnum.values()) {
            if (code.equals(certTypeEnum.getCode()) ) {
                return certTypeEnum.getMsg();
            }
        }
        return null ;
    }
}
