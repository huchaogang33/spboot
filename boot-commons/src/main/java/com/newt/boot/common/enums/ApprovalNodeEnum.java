package com.newt.boot.common.enums;

import org.springframework.util.StringUtils;

/**
 * igas提供的接口服务类型枚举
 */
public enum ApprovalNodeEnum {
    APPROVAL_COMMIT("0", "申请提交"),
    BIND_CARD("1", "绑卡"),
    SIGN_CONTRACT("2", "签约"),
    IN_VERIFY("3", "核查"),
    APPROVAL_FIRST("4", "行方初审"),
    APPROVAL_FINAL("5", "行方终审"),
    APPROVAL_ONCE("6", "行方一次审核"),
    APPROVAL_USE("7", "启用"),
    APPROVAL_STOP("8", "停用"),
    APPROVAL_CANCEL("9", "注销"),
    ;

    private String type;
    private String desc;

    ApprovalNodeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static String getDescByType(String type) {
        if (StringUtils.isEmpty(type)) {
            return null;
        }
        for (ApprovalNodeEnum a: ApprovalNodeEnum.values()) {
            if (a.getType().equals(type)) {
                return  a.getDesc();
            }
        }
        return null;
    }
}
