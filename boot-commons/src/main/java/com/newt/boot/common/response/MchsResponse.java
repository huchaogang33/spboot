package com.newt.boot.common.response;

import java.io.Serializable;

public class MchsResponse<T> implements Serializable {

    private static final long serialVersionUID = -900651896285562328L;
    /**
     * 调用结果
     */
    private boolean success;

    /**
     * 返回码
     */
    private String msgCode;

    /**
     * 返回描述
     */
    private String msgDesc;

    /**
     * 返回数据
     */
    private T data;

    public MchsResponse(T data) {
        this.data = data;
    }

    public MchsResponse(boolean success, String msgCode, String msgDesc, T data) {
        this.success = success;
        this.msgCode = msgCode;
        this.msgDesc = msgDesc;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

