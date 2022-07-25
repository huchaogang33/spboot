package com.newt.boot.common.enums;

public enum ResponseStatus {

    RESPONSE_SUCCESS(200, "成功"),
    SERVICE_NOLOGIN(201, "当前登录信息错误，请重新登录"),
    SERVICE_VALIDATIONCODE(202, "验证码错误"),
    SERVICE_AUTHORITY(203, "无权限"),
    SERVICE_LOGINFAIL(204, "用户名密码错误"),
    SERVICE_LOGINFAILTIMES(204, "用户名或密码错误过多，请联系管理员"),
    SERVICE_FILL(205, "失败"),
    SERVICE_ERROR_TIP(206, "异常提示"),
    SERVICE_WHITE_LIST(207, "访问限制"),
    SERVICE_USERNAME_EXIST(208, "用户账号已存在"),
    SERVICE_USERNAME_IS_BLANK(209, "用户账号不可为空");


    private int code;
    private String msg;

    private ResponseStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
