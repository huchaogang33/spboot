package com.newt.boot.common.response;

import java.io.Serializable;

public class MchntUserInfoResponse implements Serializable {

    private static final long serialVersionUID = 4912318327208777083L;

    private String userId;

    private String login;

    private String avatar;

    private String userName;

    private String gender;

    private String phone;

    private String email;

    private String role;

    private String mchntNo;

    private String mchntName;

    /**
     * 收银编号
     */
    private String cashierNo;

    /**结算模式*/
    private String mchntSettleModel;

    /**是否跳过签约绑卡 Y 是 N 否 */
    private String isStoreIndeFlag;

    /**审核状态*/
    private String auditStatus;

    /**是否设置交易密码*/
    private String isSetTranPwd;


    /**商户类型*/
    private String mchntType;

    //商户状态
    private String mchntStatus;

        /**开通退款标志 Y开通,N否*/
    private String refundFlag;

    public String getRefundFlag() {
        return refundFlag;
    }

    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }

    public String getMchntStatus() {
        return mchntStatus;
    }

    public void setMchntStatus(String mchntStatus) {
        this.mchntStatus = mchntStatus;
    }

    public String getMchntType() {
        return mchntType;
    }

    public void setMchntType(String mchntType) {
        this.mchntType = mchntType;
    }

    public String getIsSetTranPwd() {
        return isSetTranPwd;
    }

    public void setIsSetTranPwd(String isSetTranPwd) {
        this.isSetTranPwd = isSetTranPwd;
    }

    public String getMchntSettleModel() {
        return mchntSettleModel;
    }

    public void setMchntSettleModel(String mchntSettleModel) {
        this.mchntSettleModel = mchntSettleModel;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getIsStoreIndeFlag() {
        return isStoreIndeFlag;
    }

    public void setIsStoreIndeFlag(String isStoreIndeFlag) {
        this.isStoreIndeFlag = isStoreIndeFlag;
    }

    public String getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(String cashierNo) {
        this.cashierNo = cashierNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
}
