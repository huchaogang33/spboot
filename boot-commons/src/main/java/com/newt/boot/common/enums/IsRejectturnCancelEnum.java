package com.newt.boot.common.enums;

import org.springframework.util.StringUtils;

/**
 * 是否驳回撤销-枚举(Y-是),(N-否)
 */
public enum IsRejectturnCancelEnum {
    YES("Y", "是"),
    NO("N", "否"),
    ;

    private String type;
    private String desc;

    IsRejectturnCancelEnum(String type, String desc) {
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
        for (IsRejectturnCancelEnum a: IsRejectturnCancelEnum.values()) {
            if (a.getType().equals(type)) {
                return  a.getDesc();
            }
        }
        return null;
    }
}
