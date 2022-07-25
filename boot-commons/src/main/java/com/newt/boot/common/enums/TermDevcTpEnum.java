package com.newt.boot.common.enums;

public enum TermDevcTpEnum {
	
	T01("01", "智能 POS"),
    T02("02", "传统 POS (外接扫码/显码设备或内置扫码/显码模块)"),
    T03("03", "收银机(外接扫码/显码设备或内置扫码/显码模块)"),
    T04("04", "自助收银终端(支持扫码或显码功能)"),
    T05("05", "智能移动设备（包含手机、PAD）"),
    T99("99", "其他设备S");

    private final String code;
    private final String msg;

    TermDevcTpEnum(String code, String msg) {
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
        for (TermDevcTpEnum termTypeEnum : TermDevcTpEnum.values()) {
            if (code.equals(termTypeEnum.getCode()) ) {
                return termTypeEnum.getMsg();
            }
        }
        return T01.getMsg();
    }
}
