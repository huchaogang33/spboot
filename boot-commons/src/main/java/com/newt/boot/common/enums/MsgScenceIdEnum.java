package com.newt.boot.common.enums;

/**
 * 短信场景枚举
 */
public enum MsgScenceIdEnum {

    APP_LOGIN_SMS("1","1" ,"广惠收银APP登录短信验证码","L"),
    APP_MCHNT_CHANGE_PHONE("6","7" ,"商户换绑手机号","H"),
    APP_MCHNT_REST_PWD("11","11","商户忘记密码","R")
    ;

    /**场景id*/
    private final String scenceId;
    /**模板id*/
    private final String templateId;
    /**模板名称*/
    private final String scenceName;
    /**短信类型 仅用于前端*/
    private final String scenceType;

    MsgScenceIdEnum(String scenceId, String templateId,String scenceName ,String scenceType) {
        this.scenceId = scenceId;
        this.templateId = templateId;
        this.scenceName = scenceName;
        this.scenceType = scenceType;
    }


    public String getScenceId() {
        return scenceId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public String getScenceName() {
        return scenceName;
    }
    public String scenceType() {
        return scenceType;
    }
}
