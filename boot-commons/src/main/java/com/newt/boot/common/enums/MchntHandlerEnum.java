package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/11/18
 * 是否经办人枚举 Y是N 否
 */
public enum MchntHandlerEnum {


    TRUE_HANDLER("Y", "是经办人"),
    FALSE_HANDLER("N", "不是经办人"),
    ;

    private String type;
    private String desc;

    MchntHandlerEnum(String type, String desc) {
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
}
