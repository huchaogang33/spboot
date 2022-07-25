package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/12/2
 * 商户状态枚举
 * 00-非正式,01-正式，02-停用，03-已注销
 */
public enum  MchntStatusEnum {

    MCS00("00","非正式"),
    MCS01("01","正式"),
    MCS02("02","停用"),
    MCS03("03","已注销"),
    REVOKE("04","撤件商户"),
    ;

    private final String code;
    private final String msg;

    MchntStatusEnum(String code, String msg) {
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
        for (MchntStatusEnum mchntTypeEnum : MchntStatusEnum.values()) {
            if (code.equals(mchntTypeEnum.getCode()) ) {
                return mchntTypeEnum.getMsg();
            }
        }
        return null;
    }
}
