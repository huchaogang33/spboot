package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 商户用户信息表
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class TMchntUserInfo extends Model<TMchntUserInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(value = "user_id", type = IdType.ASSIGN_UUID)
    private String userId;

    /**
     * 登录名
     */
    private String login;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户昵称
     */
    private String nick;

    /**
     * 性别 M-男 F-女
     */
    private String gender;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色
     */
    private String role;

    /**
     * 商户编号
     */
    private String mchntNo;

    /**
     * 商户名称
     */
    private String mchntName;

    /**
     * 收银编号
     */
    private String cashierNo;

    /**
     * 交易密码
     */
    private String txPasswd;

    /**
     * POS登录密码
     */
    private String posPasswd;

    /**
     * 加密盐值
     */
    private String salt;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 用户状态
     */
    private String status;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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

    public String getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(String cashierNo) {
        this.cashierNo = cashierNo;
    }

    public String getTxPasswd() {
        return txPasswd;
    }

    public void setTxPasswd(String txPasswd) {
        this.txPasswd = txPasswd;
    }

    public String getPosPasswd() {
        return posPasswd;
    }

    public void setPosPasswd(String posPasswd) {
        this.posPasswd = posPasswd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "TMchntUserInfo{" +
        "userId=" + userId +
        ", login=" + login +
        ", avatar=" + avatar +
        ", name=" + name +
        ", nick=" + nick +
        ", gender=" + gender +
        ", phone=" + phone +
        ", email=" + email +
        ", role=" + role +
        ", mchntNo=" + mchntNo +
        ", mchntName=" + mchntName +
        ", cashierNo=" + cashierNo +
        ", txPasswd=" + txPasswd +
        ", posPasswd=" + posPasswd +
        ", salt=" + salt +
        ", deviceId=" + deviceId +
        ", status=" + status +
        ", createBy=" + createBy +
        ", createTime=" + createTime +
        ", updateBy=" + updateBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
