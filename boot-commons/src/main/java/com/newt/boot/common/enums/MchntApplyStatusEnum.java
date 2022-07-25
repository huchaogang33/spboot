package com.newt.boot.common.enums;

/**
 * Created with IntelliJ IDEA. settleMode
 * @author: Zan YanHai.
 * @CreatedTime: 2021/7/18 17:09
 * @Description: 2021/7/18 17:09
 */
public enum MchntApplyStatusEnum {

    PASSED ("1","已通过"),
    REFUSED("2","已拒绝"),
    REVIEWING("3","审核中"),
    WAI_SUBMIT("4","待提交"),
    ;

    MchntApplyStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
