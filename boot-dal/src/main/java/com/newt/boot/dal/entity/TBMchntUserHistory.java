package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 商户用户历史表
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class TBMchntUserHistory extends Model<TBMchntUserHistory> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 商户号
     */
    private String mchntNo;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 商户用户中间表
     */
    private String bizData1;

    /**
     * 商户用户扩展表
     */
    private String bizData2;

    /**
     * 数据域3
     */
    private String bizData3;

    /**
     * 用户状态
     */
    private String userStatus;

    /**
     * 创建人
     */
    private String oprId;

    /**
     * 创建时间戳
     */
    private String createTime;

    /**
     * 最后修改人
     */
    private String lastOprId;

    /**
     * 最后修改时间戳
     */
    private String lastUpdateTime;

    /**
     * 备用字段1
     */
    private String remark1;

    /**
     * 备用字段2
     */
    private String remark2;

    /**
     * 备用字段3
     */
    private String remark3;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBizData1() {
        return bizData1;
    }

    public void setBizData1(String bizData1) {
        this.bizData1 = bizData1;
    }

    public String getBizData2() {
        return bizData2;
    }

    public void setBizData2(String bizData2) {
        this.bizData2 = bizData2;
    }

    public String getBizData3() {
        return bizData3;
    }

    public void setBizData3(String bizData3) {
        this.bizData3 = bizData3;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getOprId() {
        return oprId;
    }

    public void setOprId(String oprId) {
        this.oprId = oprId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastOprId() {
        return lastOprId;
    }

    public void setLastOprId(String lastOprId) {
        this.lastOprId = lastOprId;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBMchntUserHistory{" +
        "id=" + id +
        ", mchntNo=" + mchntNo +
        ", phone=" + phone +
        ", bizData1=" + bizData1 +
        ", bizData2=" + bizData2 +
        ", bizData3=" + bizData3 +
        ", userStatus=" + userStatus +
        ", oprId=" + oprId +
        ", createTime=" + createTime +
        ", lastOprId=" + lastOprId +
        ", lastUpdateTime=" + lastUpdateTime +
        ", remark1=" + remark1 +
        ", remark2=" + remark2 +
        ", remark3=" + remark3 +
        "}";
    }
}
