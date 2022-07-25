package com.newt.boot.common.enums;

public enum MchtUserRoleEnum {

    //角色状态
    OWNER("O", "法人"),
    ADMIN("A", "管理员"),
    CASHIER("C", "收银员"),

    //收银员状态 用户状态
    USER_STATUS_A("A","启用"),
    USER_STATUS_D("D","停用"),
    ;

    private final String code;
    private final String msg;

    MchtUserRoleEnum(String code, String msg) {
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
