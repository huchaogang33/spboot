package com.newt.boot.common.enums;

public enum SettleModelTypeEnum {
	
	NETTING_CLEAR("00", "轧差清算"),
	REVENUE_TWO_LINE("01", "收支两条线")
    ;

    private final String code;
    private final String msg;

    SettleModelTypeEnum(String code, String msg) {
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
