package com.newt.boot.common.response;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/12/14
 */
public class MchntHandlerDto {


    /**
     * 经办人姓名
     */
    private String handlerName;

    /**
     * 经办人证件类型
     */
    private String handlerCertType;

    /**
     * 经办人证件号码
     */
    private String handlerCertNo;

    /**
     * 证件生效日期
     */
    private String certEffectiveDate;

    /**
     * 证件失效日期
     */
    private String certExpiryDate;

    /**
     * 经办人手机号
     */
    private String handlerMobile;

    /**
     * 经办人邮箱
     */
    private String handlerEmail;

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public String getHandlerCertType() {
        return handlerCertType;
    }

    public void setHandlerCertType(String handlerCertType) {
        this.handlerCertType = handlerCertType;
    }

    public String getHandlerCertNo() {
        return handlerCertNo;
    }

    public void setHandlerCertNo(String handlerCertNo) {
        this.handlerCertNo = handlerCertNo;
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

    public String getHandlerMobile() {
        return handlerMobile;
    }

    public void setHandlerMobile(String handlerMobile) {
        this.handlerMobile = handlerMobile;
    }

    public String getHandlerEmail() {
        return handlerEmail;
    }

    public void setHandlerEmail(String handlerEmail) {
        this.handlerEmail = handlerEmail;
    }
}
