package com.newt.boot.common.response;

import java.io.Serializable;

public class TermDeviceInfoDetailResponse implements Serializable {
    private static final long serialVersionUID = 2482013402145544028L;

    /**
     * 商户内部编号
     */
    private String mchntNo;

    /**
     * 终端编号
     */
    private String termNo;

    /**
     * 终端类型
     */
    private String termType;

    /**
     * 终端厂商
     */
    private String brandCode;

    /**
     * 终端机型
     */
    private String modelCode;

    /**
     * 终端打印商户名称
     */
    private String termPrintMerName;

    /**
     * 终端交易发起方式
     */
    private String termTxnStarWay;

    /**
     * 条码终端设备类型
     */
    private String termDevcTp;

    /**
     * 终端布放地区编码-省
     */
    private String termAddrPrvnc;

    /**
     * 终端布放地区编码-市
     */
    private String termAddrCity;

    /**
     * 终端布放地区编码-区县
     */
    private String termAddrArea;

    /**
     * 布放实体店地址
     */
    private String shopAttr;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 有效半径(千米)
     */
    private String effectiveRadius;

    /**
     * s/n
     */
    private String sn;

    /**
     * 终端联系人
     */
    private String contactName;

    /**
     * 终端联系电话
     */
    private String contactPhone;

    /**
     * 终端布放时间
     */
    private String shoptime;

    //激活时间
    private String activetime;
    
    /**
     * 状态
     */
    private String termStatus;

    /**
     * 绑定人
     */
    private  String bindUserId;

    /**
     * 二维码
     */
    private String qrUrl;
    
    
    


    public String getActivetime() {
		return activetime;
	}

	public void setActivetime(String activetime) {
		this.activetime = activetime;
	}

	public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getBindUserId() {
        return bindUserId;
    }

    public void setBindUserId(String bindUserId) {
        this.bindUserId = bindUserId;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
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

    public String getTermPrintMerName() {
        return termPrintMerName;
    }

    public void setTermPrintMerName(String termPrintMerName) {
        this.termPrintMerName = termPrintMerName;
    }

    public String getTermTxnStarWay() {
        return termTxnStarWay;
    }

    public void setTermTxnStarWay(String termTxnStarWay) {
        this.termTxnStarWay = termTxnStarWay;
    }

    public String getTermDevcTp() {
        return termDevcTp;
    }

    public void setTermDevcTp(String termDevcTp) {
        this.termDevcTp = termDevcTp;
    }

    public String getTermAddrPrvnc() {
        return termAddrPrvnc;
    }

    public void setTermAddrPrvnc(String termAddrPrvnc) {
        this.termAddrPrvnc = termAddrPrvnc;
    }

    public String getTermAddrCity() {
        return termAddrCity;
    }

    public void setTermAddrCity(String termAddrCity) {
        this.termAddrCity = termAddrCity;
    }

    public String getTermAddrArea() {
        return termAddrArea;
    }

    public void setTermAddrArea(String termAddrArea) {
        this.termAddrArea = termAddrArea;
    }

    public String getShopAttr() {
        return shopAttr;
    }

    public void setShopAttr(String shopAttr) {
        this.shopAttr = shopAttr;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getEffectiveRadius() {
        return effectiveRadius;
    }

    public void setEffectiveRadius(String effectiveRadius) {
        this.effectiveRadius = effectiveRadius;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getShoptime() {
        return shoptime;
    }

    public void setShoptime(String shoptime) {
        this.shoptime = shoptime;
    }

    public String getTermStatus() {
        return termStatus;
    }

    public void setTermStatus(String termStatus) {
        this.termStatus = termStatus;
    }
}
