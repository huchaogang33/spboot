package com.newt.boot.common.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class McsMcQcDetailResponse implements Serializable {
    private static final long serialVersionUID = 1454718473553936767L;

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

    /**
     * 上报内容
     */
    private String rptContent;

    /**
     * 处理人
     */
    private String dealPerson;

    /**
     * 处理说明
     */
    private String dealContent;

    /**
     * 故障图片
     */
    private List<String> rptPicUrls;

    /**
     * 处理图片
     */
    private List<String> dealPicUrls;
    
    /** 故障处理信息图片列表 */
    private List<String> qcDealImgPathList = new ArrayList<>(); 
    
    

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

    public String getRptContent() {
        return rptContent;
    }

    public void setRptContent(String rptContent) {
        this.rptContent = rptContent;
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson;
    }

    public String getDealContent() {
        return dealContent;
    }

    public void setDealContent(String dealContent) {
        this.dealContent = dealContent;
    }

    public List<String> getRptPicUrls() {
        return rptPicUrls;
    }

    public void setRptPicUrls(List<String> rptPicUrls) {
        this.rptPicUrls = rptPicUrls;
    }

    public List<String> getDealPicUrls() {
        return dealPicUrls;
    }

    public void setDealPicUrls(List<String> dealPicUrls) {
        this.dealPicUrls = dealPicUrls;
    }

	public List<String> getQcDealImgPathList() {
		return qcDealImgPathList;
	}

	public void setQcDealImgPathList(List<String> qcDealImgPathList) {
		this.qcDealImgPathList = qcDealImgPathList;
	}
    
}
