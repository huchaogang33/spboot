package com.newt.boot.common.enums;
//认证方式枚举
public enum AutMdTypeEnum {
	
		AUTMD01("0", "线下人工审核"),
		AUTMD02("1", "公安部数据联网核查"),
		AUTMD03("2", "绑定银行卡实名认证"),
		AUTMD04("3", "其他(说明方式)"),
		AUTMD05("4", "公安部"),
	    ;

	    private final String code;
	    private final String msg;

	    AutMdTypeEnum(String code, String msg) {
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
	        for (AutMdTypeEnum certTypeEnum : AutMdTypeEnum.values()) {
	            if (code.equals(certTypeEnum.getCode()) ) {
	                return certTypeEnum.getMsg();
	            }
	        }
	        return null ;
	    }
}
