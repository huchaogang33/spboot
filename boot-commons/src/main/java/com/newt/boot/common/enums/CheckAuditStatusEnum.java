package com.newt.boot.common.enums;

/***
 * 核查状态10待核查20已完成30已拒绝
 */
public enum CheckAuditStatusEnum {
    CAS10("10", "待核查"),
    CAS20("20", "已完成"),
    CAS30("30", "已拒绝"),

    ;

    private final String code;
    private final String msg;

    CheckAuditStatusEnum(String code, String msg) {
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
        for (CheckAuditStatusEnum certTypeEnum : CheckAuditStatusEnum.values()) {
            if (code.equals(certTypeEnum.getCode()) ) {
                return certTypeEnum.getMsg();
            }
        }
        return null;
    }
}
