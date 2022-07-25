package com.newt.boot.common.request;

import java.io.Serializable;

/**
 * 密码变更请求信息
 */
public class PwdModifyRequestInfo implements Serializable {

    private static final long serialVersionUID = -8029568076166689435L;

    private String oldPwd;

    private String newPwd;

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    @Override
    public String toString() {
        return "PwdModifyRequestInfo{" +
                "oldPwd='" + "********" + '\'' +
                ", newPwd='" + "********" + '\'' +
                '}';
    }
}
