package com.newt.boot.common.response;

import java.io.Serializable;

public class CashierInfoResponse implements Serializable {

    private static final long serialVersionUID = 6156636112992336586L;

    private String userId;

    private String avatar;

    private String userName;

    private String userNick;

    private String phone;

    private String role;

    private String status;

    /**
     * 收银编号
     */
    private String cashierNo;

    /**pos密码*/
    private String posPasswd;

    public String getPosPasswd() {
        return posPasswd;
    }

    public void setPosPasswd(String posPasswd) {
        this.posPasswd = posPasswd;
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

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
