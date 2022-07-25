package com.newt.boot.common.enums;
//合同签署枚举
public enum ContractSignTypeEnum {
	
	MCHNT_SIGN("0","商户已签署"),
	BANK_SIGN("1","行方已签署"),
    ;
	
	private final String code;
    private final String msg;

    ContractSignTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (ContractSignTypeEnum qrStatusEnum : ContractSignTypeEnum.values()) {
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
