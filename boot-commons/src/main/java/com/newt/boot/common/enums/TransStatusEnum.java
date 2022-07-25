package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/4
 * 交易状态 -- trans_status
 */
public enum TransStatusEnum {

    /**
     * 0-初始状态
     * 1-交易成功
     * 2-交易失败
     * 3-交易超时
     */
    TRANS_0("0", "初始状态"),
    TRANS_1("1", "交易成功"),
    TRANS_2("2", "交易失败"),
    TRANS_3("3", "交易超时"),
    ;

    private String code;
    private String msg;

    private TransStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
