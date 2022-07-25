package com.newt.boot.common.request;

import java.io.Serializable;

public class DeviceinfoRequestInfo implements Serializable {

    private static final long serialVersionUID = 673859550543559651L;
    /**
     * 多法人机构号
     */
    private String instId;

    /**
     * 设备编号
     */
    private String deviceNo;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }
}
