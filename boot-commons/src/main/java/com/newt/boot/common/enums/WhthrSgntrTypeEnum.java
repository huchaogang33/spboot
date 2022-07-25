package com.newt.boot.common.enums;

//是否签署
public enum WhthrSgntrTypeEnum {
	
	COPY("0","抄送"),
	SIGN("1","签署"),
	NOT_SIGN("2","暂不签署"),
    ;
	
	private final String code;
    private final String msg;

    WhthrSgntrTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (WhthrSgntrTypeEnum qrStatusEnum : WhthrSgntrTypeEnum.values()) {
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
