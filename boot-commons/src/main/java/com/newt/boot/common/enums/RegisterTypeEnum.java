package com.newt.boot.common.enums;

public enum RegisterTypeEnum {
    R000("000", "个体工商户"),
    R010("010", "国有企业"),
    R020("020", "集体企业"),
    R030("030", "股份合作企业"),
    R041("041", "国有联营企业"),
    R042("042", "集体联营企业"),
    R043("043", "国有与集体联营企业"),
    R044("044", "其他联营企业"),
    R051("051", "国有独资公司"),
    R052("052", "其他有限责任公司"),
    R060("060", "股份有限公司"),
    R071("071", "私营独资企业"),
    R072("072", "私营合伙企业"),
    R073("073", "私营有限责任公司"),
    R074("074", "私营股份有限公司"),
    R080("080", "其他企业"),
    R110("110", "合资经营企业"),
    R120("120", "合作经营企业"),
    R130("130", "独资经营企业"),
    R140("140", "投资股份有限公司"),
    R210("210", "中外合资经营企业"),
    R220("220", "中外合作经营企业"),
    R230("230", "外资企业"),
    R240("240", "外商投资股份有限公司"),
    R310("310", "政府机构"),
    R320("320", "事业单位"),
    ;

    private final String code;
    private final String msg;

    RegisterTypeEnum(String code, String msg) {
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
        for (RegisterTypeEnum registerTypeEnum : RegisterTypeEnum.values()) {
            if (code.equals(registerTypeEnum.getCode()) ) {
                return registerTypeEnum.getMsg();
            }
        }
        return R080.getMsg();
    }
}
