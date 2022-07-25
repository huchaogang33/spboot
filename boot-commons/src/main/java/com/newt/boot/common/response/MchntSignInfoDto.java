package com.newt.boot.common.response;

import java.io.Serializable;

public class MchntSignInfoDto implements Serializable {

    private static final long serialVersionUID = 8905112051672367411L;

    /**
     * 经办人信息
     */
    private MchntHandlerDto handlerDto;
    /**
     * 经营执照类型
     */
    private String licenceType;

    /**
     * 企业注册类型
     */
    private String enterRegisterType;

    /**
     * 经营执照名称
     */
    private String licenceName;

    /**
     * 统一社会信息代码
     */
    private String licenceCode;

    /**
     * 注册资本
     */
    private String registerCapital;

    /**
     * 执照生效日期
     */
    private String licenceEffectiveDate;

    /**
     * 执照失效日期
     */
    private String licenceExpiryDate;

    /**
     * 注册地址-省
     */
    private String registerProvince;

    /**
     * 注册地址-市
     */
    private String registerCity;

    /**
     * 注册地址-区
     */
    private String registerArea;

    /**
     * 注册地址-街道
     */
    private String registerStreet;

    /**
     * 注册详细地址
     */
    private String registerAddr;

    /**
     * 法人姓名
     */
    private String artifName;

    /**
     * 法人证件类型
     */
    private String artifCertType;

    /**
     * 法人证件号码
     */
    private String artifCertNo;

    /**
     * 证件生效日期
     */
    private String certEffectiveDate;

    /**
     * 证件失效日期
     */
    private String certExpiryDate;

    /**
     * 法人手机号
     */
    private String artifMobile;

    /**
     * 法人电子邮箱
     */
    private String artifEmail;

    /**
     * 是否经办人Y是 否
     */
    private String isHandler;

    public String getIsHandler() {
        return isHandler;
    }

    public void setIsHandler(String isHandler) {
        this.isHandler = isHandler;
    }

    public MchntHandlerDto getHandlerDto() {
        return handlerDto;
    }

    public void setHandlerDto(MchntHandlerDto handlerDto) {
        this.handlerDto = handlerDto;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }

    public String getEnterRegisterType() {
        return enterRegisterType;
    }

    public void setEnterRegisterType(String enterRegisterType) {
        this.enterRegisterType = enterRegisterType;
    }

    public String getLicenceName() {
        return licenceName;
    }

    public void setLicenceName(String licenceName) {
        this.licenceName = licenceName;
    }

    public String getLicenceCode() {
        return licenceCode;
    }

    public void setLicenceCode(String licenceCode) {
        this.licenceCode = licenceCode;
    }

    public String getRegisterCapital() {
        return registerCapital;
    }

    public void setRegisterCapital(String registerCapital) {
        this.registerCapital = registerCapital;
    }

    public String getLicenceEffectiveDate() {
        return licenceEffectiveDate;
    }

    public void setLicenceEffectiveDate(String licenceEffectiveDate) {
        this.licenceEffectiveDate = licenceEffectiveDate;
    }

    public String getLicenceExpiryDate() {
        return licenceExpiryDate;
    }

    public void setLicenceExpiryDate(String licenceExpiryDate) {
        this.licenceExpiryDate = licenceExpiryDate;
    }

    public String getRegisterProvince() {
        return registerProvince;
    }

    public void setRegisterProvince(String registerProvince) {
        this.registerProvince = registerProvince;
    }

    public String getRegisterCity() {
        return registerCity;
    }

    public void setRegisterCity(String registerCity) {
        this.registerCity = registerCity;
    }

    public String getRegisterArea() {
        return registerArea;
    }

    public void setRegisterArea(String registerArea) {
        this.registerArea = registerArea;
    }

    public String getRegisterStreet() {
        return registerStreet;
    }

    public void setRegisterStreet(String registerStreet) {
        this.registerStreet = registerStreet;
    }

    public String getRegisterAddr() {
        return registerAddr;
    }

    public void setRegisterAddr(String registerAddr) {
        this.registerAddr = registerAddr;
    }

    public String getArtifName() {
        return artifName;
    }

    public void setArtifName(String artifName) {
        this.artifName = artifName;
    }

    public String getArtifCertType() {
        return artifCertType;
    }

    public void setArtifCertType(String artifCertType) {
        this.artifCertType = artifCertType;
    }

    public String getArtifCertNo() {
        return artifCertNo;
    }

    public void setArtifCertNo(String artifCertNo) {
        this.artifCertNo = artifCertNo;
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

    public String getArtifMobile() {
        return artifMobile;
    }

    public void setArtifMobile(String artifMobile) {
        this.artifMobile = artifMobile;
    }

    public String getArtifEmail() {
        return artifEmail;
    }

    public void setArtifEmail(String artifEmail) {
        this.artifEmail = artifEmail;
    }
}
