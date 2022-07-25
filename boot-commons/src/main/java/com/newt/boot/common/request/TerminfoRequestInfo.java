package com.newt.boot.common.request;

import java.io.Serializable;

public class TerminfoRequestInfo implements Serializable {

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
     * 类型
     */
    private String type;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
