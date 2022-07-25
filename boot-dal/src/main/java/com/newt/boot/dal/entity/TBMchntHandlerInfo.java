package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class TBMchntHandlerInfo extends Model<TBMchntHandlerInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 非业务主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 机构标识
     */
    private String instId;

    /**
     * 商户号
     */
    private String mchntNo;

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

    /**
     * 记录状态Y正式N非正式
     */
    private String recordStatus;

    /**
     * 创建人
     */
    private String oprId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 最后修改人
     */
    private String lastOprId;

    /**
     * 最后修改时间
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

    /**
     * 备用字段4
     */
    private String remark4;

    /**
     * 备用字段5
     */
    private String remark5;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

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

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
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

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBMchntHandlerInfo{" +
        "id=" + id +
        ", instId=" + instId +
        ", mchntNo=" + mchntNo +
        ", handlerName=" + handlerName +
        ", handlerCertType=" + handlerCertType +
        ", handlerCertNo=" + handlerCertNo +
        ", certEffectiveDate=" + certEffectiveDate +
        ", certExpiryDate=" + certExpiryDate +
        ", handlerMobile=" + handlerMobile +
        ", handlerEmail=" + handlerEmail +
        ", recordStatus=" + recordStatus +
        ", oprId=" + oprId +
        ", createTime=" + createTime +
        ", lastOprId=" + lastOprId +
        ", lastUpdateTime=" + lastUpdateTime +
        ", remark1=" + remark1 +
        ", remark2=" + remark2 +
        ", remark3=" + remark3 +
        ", remark4=" + remark4 +
        ", remark5=" + remark5 +
        "}";
    }
}
