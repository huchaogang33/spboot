package com.newt.boot.common.enums;

public enum UserStatusEnum {
    NORMAL("0", "正常"),
    LEAVE("1", "离职"),
    LOCKED("2", "锁定"),
    ;

    private String code;
    private String msg;

    private UserStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
