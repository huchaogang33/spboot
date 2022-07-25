package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 商户行业类别
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class TBIndustryInfo extends Model<TBIndustryInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 非业务主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 行业编号
     */
    private String industryType;

    /**
     * 行业名称
     */
    private String industryName;

    /**
     * 行业描述
     */
    private String industryDesc;

    /**
     * 商户组别编号
     */
    private String grpNo;

    /**
     * 商户经营类型
     */
    private String merBusiType;

    /**
     * 审批拒绝原因
     */
    private String auditRefuseReason;

    /**
     * 状态
     */
    private String status;

    /**
     * 审批状态
     */
    private String auditStatus;

    /**
     * 创建机构
     */
    private String crtOrgId;

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
     * 最后审核人
     */
    private String lastAuditId;

    /**
     * 最后审核时间
     */
    private String lastAuditTime;

    /**
     * 备用字段1
     */
    private String reserve1;

    /**
     * 备用字段2
     */
    private String reserve2;

    /**
     * 备用字段3
     */
    private String reserve3;

    /**
     * 备用字段4
     */
    private String reserve4;

    /**
     * 备用字段5
     */
    private String reserve5;

    /**
     * 备用字段6
     */
    private String reserve6;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getIndustryDesc() {
        return industryDesc;
    }

    public void setIndustryDesc(String industryDesc) {
        this.industryDesc = industryDesc;
    }

    public String getGrpNo() {
        return grpNo;
    }

    public void setGrpNo(String grpNo) {
        this.grpNo = grpNo;
    }

    public String getMerBusiType() {
        return merBusiType;
    }

    public void setMerBusiType(String merBusiType) {
        this.merBusiType = merBusiType;
    }

    public String getAuditRefuseReason() {
        return auditRefuseReason;
    }

    public void setAuditRefuseReason(String auditRefuseReason) {
        this.auditRefuseReason = auditRefuseReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getCrtOrgId() {
        return crtOrgId;
    }

    public void setCrtOrgId(String crtOrgId) {
        this.crtOrgId = crtOrgId;
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

    public String getLastAuditId() {
        return lastAuditId;
    }

    public void setLastAuditId(String lastAuditId) {
        this.lastAuditId = lastAuditId;
    }

    public String getLastAuditTime() {
        return lastAuditTime;
    }

    public void setLastAuditTime(String lastAuditTime) {
        this.lastAuditTime = lastAuditTime;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4;
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5;
    }

    public String getReserve6() {
        return reserve6;
    }

    public void setReserve6(String reserve6) {
        this.reserve6 = reserve6;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBIndustryInfo{" +
        "id=" + id +
        ", industryType=" + industryType +
        ", industryName=" + industryName +
        ", industryDesc=" + industryDesc +
        ", grpNo=" + grpNo +
        ", merBusiType=" + merBusiType +
        ", auditRefuseReason=" + auditRefuseReason +
        ", status=" + status +
        ", auditStatus=" + auditStatus +
        ", crtOrgId=" + crtOrgId +
        ", oprId=" + oprId +
        ", createTime=" + createTime +
        ", lastOprId=" + lastOprId +
        ", lastUpdateTime=" + lastUpdateTime +
        ", lastAuditId=" + lastAuditId +
        ", lastAuditTime=" + lastAuditTime +
        ", reserve1=" + reserve1 +
        ", reserve2=" + reserve2 +
        ", reserve3=" + reserve3 +
        ", reserve4=" + reserve4 +
        ", reserve5=" + reserve5 +
        ", reserve6=" + reserve6 +
        "}";
    }
}
