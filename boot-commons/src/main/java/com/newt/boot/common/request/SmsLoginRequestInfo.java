package com.newt.boot.common.request;

import java.io.Serializable;

/**
 * 短信验证码登录请求信息
 */
public class SmsLoginRequestInfo implements Serializable {

    private static final long serialVersionUID = -1533561081816929705L;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 短信验证码
     */
    private String code;

    /**商户号*/
    private String mchntNo;


    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
