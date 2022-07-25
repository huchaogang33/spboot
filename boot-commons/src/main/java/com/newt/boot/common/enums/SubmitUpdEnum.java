package com.newt.boot.common.enums;

/**
 * 进件临时表修改，提交枚举
 */
public enum SubmitUpdEnum {


    SUBMIT("1", "提交"),
    PRE_VIEW("2","合同预览"),
    CONTRCT("3","签约成功"),
    REJECT("4","拒绝"),
    UPD("0", "修改"),
    ;

    private final String code;
    private final String msg;

    SubmitUpdEnum(String code, String msg) {
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
