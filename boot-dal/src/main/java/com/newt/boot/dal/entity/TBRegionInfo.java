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
public class TBRegionInfo extends Model<TBRegionInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 非业务主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 行政区划代码
     */
    private String regionCode;

    /**
     * 行政区划名称
     */
    private String regionName;

    /**
     * 上级行政区划代码
     */
    private String parentCode;

    /**
     * 行政级别
     */
    private String regionLevel;

    /**
     * 银联地区代码
     */
    private String areaCode;

    /**
     * 对应支付宝行政区域代码
     */
    private String alipayAdcode;

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

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getRegionLevel() {
        return regionLevel;
    }

    public void setRegionLevel(String regionLevel) {
        this.regionLevel = regionLevel;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAlipayAdcode() {
        return alipayAdcode;
    }

    public void setAlipayAdcode(String alipayAdcode) {
        this.alipayAdcode = alipayAdcode;
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
        return "TBRegionInfo{" +
        "id=" + id +
        ", regionCode=" + regionCode +
        ", regionName=" + regionName +
        ", parentCode=" + parentCode +
        ", regionLevel=" + regionLevel +
        ", areaCode=" + areaCode +
        ", alipayAdcode=" + alipayAdcode +
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
        ", remark1=" + remark1 +
        ", remark2=" + remark2 +
        ", remark3=" + remark3 +
        ", remark4=" + remark4 +
        ", remark5=" + remark5 +
        "}";
    }
}
