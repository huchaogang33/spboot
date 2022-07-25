package com.newt.boot.common.enums;

import org.springframework.util.StringUtils;

/***
 * 是否需要重新绑卡枚举
 */
public enum AcctChangeBindEnum {

    APP_UPD("app","仅用于app换绑卡时标识"),

    TRUE_BIND("Y", "换绑"),
    FALSE_BIND("N", "正常"),

    ;

    private String type;
    private String desc;

    AcctChangeBindEnum(String type, String desc) {
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
        for (AcctChangeBindEnum a: AcctChangeBindEnum.values()) {
            if (a.getType().equals(type)) {
                return  a.getDesc();
            }
        }
        return null;
    }
}
