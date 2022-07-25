package com.newt.boot.common.enums;

public enum RecordStatusEnum {
    YES("Y", "使用中"),
    NO("N", "已停用"),
    CANCEL("L","已注销"),
    WAIT_ACTIVE("I","待激活"),
    ;

    private final String code;
    private final String msg;

    RecordStatusEnum(String code, String msg) {
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
        for (RecordStatusEnum recordStatusEnum : RecordStatusEnum.values()) {
            if (code.equals(recordStatusEnum.getCode()) ) {
                return recordStatusEnum.getMsg();
            }
        }
        return null;
    }
}
