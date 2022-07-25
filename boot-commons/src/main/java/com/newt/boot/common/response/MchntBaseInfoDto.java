package com.newt.boot.common.response;

import java.io.Serializable;

public class MchntBaseInfoDto implements Serializable {
    private static final long serialVersionUID = 418313014894083678L;

    /**
     * 商户类型
     */
    private String mchntType;

    /**
     * 商户号
     */
    private String mchntNo;

    /**
     * 商户名称
     */
    private String mchntName;

    /**
     * 商户简称
     */
    private String mchntSimpleName;

    /**
     * 企业性质
     */
    private String mchntNature;


    /**
     * 经营范围
     */
    private String managementScope;

    /**
     * 行业类别
     */
    private String industryType;

    /**
     * 签约机构
     */
    private String signInstId;

    /**
     * 员工人数
     */
    private String employeeNum;

    /**
     * 商户营业面积
     */
    private String mchntBizArea;

    /**
     * 营业开始时间
     */
    private String bizStartTime;

    /**
     * 营业结束时间
     */
    private String bizEndTime;

    /**
     * 营业地址-省
     */
    private String mchntBizProvince;

    /**
     * 营业地址-市
     */
    private String mchntBizCity;

    /**
     * 营业地址-区
     */
    private String mchntBizRegion;

    /**
     * 营业地址-街道
     */
    private String mchntBizStreet;

    /**
     * 营业地址
     */
    private String mchntBizAddr;

    /**
     * 商户经度坐标
     */
    private String mchntLng;

    /**
     * 商户纬度坐标
     */
    private String mchntLat;

    /**
     * 发送短信标识
     */
    private String smsFlag;

    /**
     * 商户联系人
     */
    private String mchntContactName;

    /**
     * 商户联系人证件类型
     */
    private String mchntContactCertType;

    /**
     * 商户联系人证件号码
     */
    private String mchntContactCertNo;

    /**
     * 证件生效日期
     */
    private String certEffectiveDate;

    /**
     * 证件失效日期
     */
    private String certExpiryDate;

    /**
     * 商户联系电话
     */
    private String mchntContactPhone;

    /**
     * 商户联系人手机号
     */
    private String mchntContactMobile;

    /**
     * 商户联系人邮箱
     */
    private String mchntContactEmail;

    private String  createTime;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getManagementScope() {
        return managementScope;
    }

    public void setManagementScope(String managementScope) {
        this.managementScope = managementScope;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getMchntType() {
        return mchntType;
    }

    public void setMchntType(String mchntType) {
        this.mchntType = mchntType;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getMchntName() {
        return mchntName;
    }

    public void setMchntName(String mchntName) {
        this.mchntName = mchntName;
    }

    public String getMchntSimpleName() {
        return mchntSimpleName;
    }

    public void setMchntSimpleName(String mchntSimpleName) {
        this.mchntSimpleName = mchntSimpleName;
    }

    public String getMchntNature() {
        return mchntNature;
    }

    public void setMchntNature(String mchntNature) {
        this.mchntNature = mchntNature;
    }

    public String getSignInstId() {
        return signInstId;
    }

    public void setSignInstId(String signInstId) {
        this.signInstId = signInstId;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getMchntBizArea() {
        return mchntBizArea;
    }

    public void setMchntBizArea(String mchntBizArea) {
        this.mchntBizArea = mchntBizArea;
    }

    public String getBizStartTime() {
        return bizStartTime;
    }

    public void setBizStartTime(String bizStartTime) {
        this.bizStartTime = bizStartTime;
    }

    public String getBizEndTime() {
        return bizEndTime;
    }

    public void setBizEndTime(String bizEndTime) {
        this.bizEndTime = bizEndTime;
    }

    public String getMchntBizProvince() {
        return mchntBizProvince;
    }

    public void setMchntBizProvince(String mchntBizProvince) {
        this.mchntBizProvince = mchntBizProvince;
    }

    public String getMchntBizCity() {
        return mchntBizCity;
    }

    public void setMchntBizCity(String mchntBizCity) {
        this.mchntBizCity = mchntBizCity;
    }

    public String getMchntBizRegion() {
        return mchntBizRegion;
    }

    public void setMchntBizRegion(String mchntBizRegion) {
        this.mchntBizRegion = mchntBizRegion;
    }

    public String getMchntBizStreet() {
        return mchntBizStreet;
    }

    public void setMchntBizStreet(String mchntBizStreet) {
        this.mchntBizStreet = mchntBizStreet;
    }

    public String getMchntBizAddr() {
        return mchntBizAddr;
    }

    public void setMchntBizAddr(String mchntBizAddr) {
        this.mchntBizAddr = mchntBizAddr;
    }

    public String getMchntLng() {
        return mchntLng;
    }

    public void setMchntLng(String mchntLng) {
        this.mchntLng = mchntLng;
    }

    public String getMchntLat() {
        return mchntLat;
    }

    public void setMchntLat(String mchntLat) {
        this.mchntLat = mchntLat;
    }

    public String getSmsFlag() {
        return smsFlag;
    }

    public void setSmsFlag(String smsFlag) {
        this.smsFlag = smsFlag;
    }

    public String getMchntContactName() {
        return mchntContactName;
    }

    public void setMchntContactName(String mchntContactName) {
        this.mchntContactName = mchntContactName;
    }

    public String getMchntContactCertType() {
        return mchntContactCertType;
    }

    public void setMchntContactCertType(String mchntContactCertType) {
        this.mchntContactCertType = mchntContactCertType;
    }

    public String getMchntContactCertNo() {
        return mchntContactCertNo;
    }

    public void setMchntContactCertNo(String mchntContactCertNo) {
        this.mchntContactCertNo = mchntContactCertNo;
    }

    public String getCertEffectiveDate() {
        return certEffectiveDate;
    }

    public void setCertEffectiveDate(String certEffectiveDate) {
        this.certEffectiveDate = certEffectiveDate;
    }

    public String getCertExpiryDate() {
        return certExpiryDate;
    }

    public void setCertExpiryDate(String certExpiryDate) {
        this.certExpiryDate = certExpiryDate;
    }

    public String getMchntContactPhone() {
        return mchntContactPhone;
    }

    public void setMchntContactPhone(String mchntContactPhone) {
        this.mchntContactPhone = mchntContactPhone;
    }

    public String getMchntContactMobile() {
        return mchntContactMobile;
    }

    public void setMchntContactMobile(String mchntContactMobile) {
        this.mchntContactMobile = mchntContactMobile;
    }

    public String getMchntContactEmail() {
        return mchntContactEmail;
    }

    public void setMchntContactEmail(String mchntContactEmail) {
        this.mchntContactEmail = mchntContactEmail;
    }
}
