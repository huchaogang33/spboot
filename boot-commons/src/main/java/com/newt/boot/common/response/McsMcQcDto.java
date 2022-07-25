package com.newt.boot.common.response;

import java.io.Serializable;
import java.util.Date;

public class McsMcQcDto implements Serializable {

    private static final long serialVersionUID = -88685698549708685L;

    private String qcId;

    /**
     * 故障类型
     */
    private String qcType;

    /**
     * 故障信息状态
     */
    private String qcStatus;

    /**
     * 故障等级
     */
    private String qcLevel;

    /**
     * 故障标题
     */
    private String qcTitle;

    /**
     * 故障上报时间
     */
    private Date rptTime;

    /**
     * 故障处理时间
     */
    private Date dealTime;

    public String getQcId() {
        return qcId;
    }

    public void setQcId(String qcId) {
        this.qcId = qcId;
    }

    public String getQcType() {
        return qcType;
    }

    public void setQcType(String qcType) {
        this.qcType = qcType;
    }

    public String getQcStatus() {
        return qcStatus;
    }

    public void setQcStatus(String qcStatus) {
        this.qcStatus = qcStatus;
    }

    public String getQcLevel() {
        return qcLevel;
    }

    public void setQcLevel(String qcLevel) {
        this.qcLevel = qcLevel;
    }

    public String getQcTitle() {
        return qcTitle;
    }

    public void setQcTitle(String qcTitle) {
        this.qcTitle = qcTitle;
    }

    public Date getRptTime() {
        return rptTime;
    }

    public void setRptTime(Date rptTime) {
        this.rptTime = rptTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
}
