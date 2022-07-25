package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/29
 * 设备绑定关系  bind_status
 */
public enum DevBindInfoEnum {



    UNBINDED("01", "解绑"),
    BINDED("00", "绑定");

    private final String code;
    private final String msg;

    DevBindInfoEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsgByCode(String code) {
        for (DevBindInfoEnum bindStatusEnum : DevBindInfoEnum.values()) {
            if (code.equals(bindStatusEnum.getCode()) ) {
                return bindStatusEnum.getMsg();
            }
        }
        return UNBINDED.getMsg();
    }
}
