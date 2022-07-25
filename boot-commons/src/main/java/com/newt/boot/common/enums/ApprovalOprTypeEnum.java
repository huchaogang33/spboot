package com.newt.boot.common.enums;

import org.springframework.util.StringUtils;

/**
 * igas提供的接口服务类型枚举
 */
public enum ApprovalOprTypeEnum {
    MCHNT("0", "商户"),
    AGENT("1", "代理商"),
    BANK("2", "行员"),
    ;

    private String type;
    private String desc;

    ApprovalOprTypeEnum(String type, String desc) {
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
        for (ApprovalOprTypeEnum a: ApprovalOprTypeEnum.values()) {
            if (a.getType().equals(type)) {
                return  a.getDesc();
            }
        }
        return null;
    }
}
