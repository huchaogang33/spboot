package com.newt.boot.common.enums;

public enum OpenAccountTypeEnum {
	
	 TYPE1("1", "个人开户"),
	 TYPE2("2", "企业开户");
	
	private final String code;
    private final String msg;

    OpenAccountTypeEnum(String code, String msg) {
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
