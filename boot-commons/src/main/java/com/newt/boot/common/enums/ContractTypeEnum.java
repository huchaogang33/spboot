package com.newt.boot.common.enums;

//合同类型枚举
public enum ContractTypeEnum {
	
	
	MM("MM","买卖合同"),
	GY("GY","供用电、水、气、热力合同"),
	ZY("ZY","赠与合同"),
	JK("JK","借款合同"),
	ZL("02","租赁合同"),
	RZZL("02","融资租赁合同"),
	CL("02","承揽合同"),
	JSGC("02","建设工程合同"),
	YS("02","运输合同"),
	JS("02","技术合同"),
	BG("02","保管合同"),
	CC("02","仓储合同"),
	WT("02","委托合同"),
	XJ("02","行纪合同"),
	JJ("02","居间合同"),
	LD("02","劳动合同"),
	QT("02","其他合同"),
	
    ;

    private final String code;
    private final String msg;

    ContractTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static String getMsgByCode(String code) {
        for (ContractTypeEnum qrStatusEnum : ContractTypeEnum.values()) {
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
