package com.newt.boot.common.enums;

import org.springframework.util.StringUtils;

/**
 * 是否驳回-枚举(Y-是),(N-否)
 */
public enum IsRejectturnEnum {
    YES("Y", "是"),
    NO("N", "否"),
    ;

    private String type;
    private String desc;

    IsRejectturnEnum(String type, String desc) {
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
        for (IsRejectturnEnum a: IsRejectturnEnum.values()) {
            if (a.getType().equals(type)) {
                return  a.getDesc();
            }
        }
        return null;
    }
}
