package com.newt.boot.common.response;

import java.io.Serializable;

/**
 * 终端设备信息DTO
 */
public class TermDeviceInfoDto implements Serializable {

    private static final long serialVersionUID = -4622089100565925454L;

    /**
     * 商户编号
     */
    private String mchntNo;

    /**
     * 品牌
     */
    private String brandCode;

    /**
     * 机型
     */
    private String modelCode;

    /**
     * 编号
     */
    private String no;

    /**
     * 状态
     */
    private String status;

    /**主键*/
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

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
