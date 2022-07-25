package com.newt.boot.common.request;

import java.io.Serializable;

/**
 * 密码重置请求信息
 */
public class PwdResetRequestInfo implements Serializable {

    private static final long serialVersionUID = 5804792394134839277L;

    private String code;

    private String newPwd;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    @Override
    public String toString() {
        return "PwdResetRequestInfo{" +
                "code='" + code + '\'' +
                ", newPwd='" + "******" + '\'' +
                '}';
    }
}
