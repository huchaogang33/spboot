package com.newt.boot.common.request;

import java.io.Serializable;

public class TermActiveRequestInfo implements Serializable {

    private static final long serialVersionUID = -4540430760031992438L;

    /**
     * 商户编号
     */
    private String mchntNo;

    /**
     * 终端编号
     */
    private String no;

    /**
     * 关联人员
     */
    private String userId;

    /**
     * 类型
     */
    private String type;

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
