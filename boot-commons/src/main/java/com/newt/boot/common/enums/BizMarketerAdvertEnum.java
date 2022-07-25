package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/13
 * 营销相关枚举
 */
public enum BizMarketerAdvertEnum {


    //失效状态
    STATUS_0("0","0待发布"),
    STATUS_1("1","1使用中"),
    STATUS_2("2","2已失效"),

    //审核状态
    ACT_AUDIT_STATE_4("4","4-发布-待审核"),
    ACT_AUDIT_STATE_5("5","5-发布-审核通过"),
    ACT_AUDIT_STATE_6("6","6-发布-审核拒绝"),

    //删除标志
    DEL_FLAG_0("0","未删除"),
    DEL_FLAG_1("1","已删除"),

    //图片类型
    ADVERT_TYPE_01("01","商户服务轮播广告"),
    ADVERT_TYPE_02("02","交易成功推广广告"),
    ;


    private final String code;
    private final String msg;

    BizMarketerAdvertEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
