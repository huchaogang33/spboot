package com.newt.boot.common.request;

import java.io.Serializable;

/**
 * 收银员管理相关请求信息
 */
public class CashierRequestInfo extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 4880863994759367266L;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 昵称
     */
    private String userNick;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 手机号
     */
    private String email;

    /**
     * 角色
     */
    private String role;

    /**
     * 性别
     */
    private String gender;

    /**
     * 状态
     */
    private String status;

    /**
     * pos登录密码
     *
     */
    private  String posPasswd;

    public String getPosPasswd() {
        return posPasswd;
    }

    public void setPosPasswd(String posPasswd) {
        this.posPasswd = posPasswd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
