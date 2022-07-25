package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/11/24
 * 收入
 * 支出 账户
 */
public enum AmtIncomExpendAccEnum {


    INCOME("income", "收入"),
    EXPEND("expend", "支出"),



    //前端区分->正常收入normalIncom,营销收入marketIncom,支出手续费expendIncom
    NORMAL_INCOM("normalIncom","正常收入"),
    MARKET_INCOM("marketIncom","营销收入"),
    EXPEND_INCOM("expendIncom","支出手续费"),

    ;

    private final String code;
    private final String msg;

    AmtIncomExpendAccEnum(String code, String msg) {
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
