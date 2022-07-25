package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 代理机构信息正式表
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class TBAgentInfo extends Model<TBAgentInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 非业务主键
     */
    private String id;

    /**
     * 多法人总行机构标识
     */
    private String instId;

    /**
     * 代理机构代码
     */
    @TableId(value = "agent_code", type = IdType.ASSIGN_UUID)
    private String agentCode;

    /**
     * 代理机构名称
     */
    private String agentName;

    /**
     * 代理机构简称
     */
    private String agentSimpleName;

    /**
     * 上级代理机构代码
     */
    private String superAgentCode;

    /**
     * 管理机构代码
     */
    private String manageInstId;

    /**
     * 经营执照类型
     */
    private String licenceType;

    /**
     * 经营执照注册号
     */
    private String licenceCode;

    /**
     * 注册资本
     */
    private String registerCapital;

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
     * 联系人
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 联系人邮箱
     */
    private String contactEmaiil;

    /**
     * 代理机构邮编
     */
    private String postCode;

    /**
     * 代理机构地址
     */
    private String agentAddr;

    /**
     * 是否参与分润
     */
    private String isProfitFlag;

    /**
     * 是否全行可见
     */
    private String isShowAllFlag;

    /**
     * 结算方式
     */
    private String settleType;

    /**
     * 结算周期
     */
    private Long settleCycle;

    /**
     * 结算账号
     */
    private String settleAcctNo;

    /**
     * 结算账户类型
     */
    private String settleAcctType;

    /**
     * 结算账户开户名
     */
    private String settleAcctName;

    /**
     * 结算账户开户行行号
     */
    private String acctOpenBankNo;

    /**
     * 结算账户开户行名称
     */
    private String acctOpenBankName;

    /**
     * 结算账户开户地址-省
     */
    private String acctOpenProvince;

    /**
     * 结算账户开户地址-市
     */
    private String acctOpenCity;

    /**
     * 结算账户开户地址-区
     */
    private String acctOpenArea;

    /**
     * 分润规则
     */
    private String profitRule;

    /**
     * 代理机构状态
     */
    private String agentStatus;

    /**
     * 审批状态
     */
    private String auditStatus;

    /**
     * 停用原因
     */
    private String stopReason;

    /**
     * 注销原因
     */
    private String cancelReason;

    /**
     * 审批拒绝原因
     */
    private String auditRefuseReason;

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
     * 代理商平台机构id
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

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentSimpleName() {
        return agentSimpleName;
    }

    public void setAgentSimpleName(String agentSimpleName) {
        this.agentSimpleName = agentSimpleName;
    }

    public String getSuperAgentCode() {
        return superAgentCode;
    }

    public void setSuperAgentCode(String superAgentCode) {
        this.superAgentCode = superAgentCode;
    }

    public String getManageInstId() {
        return manageInstId;
    }

    public void setManageInstId(String manageInstId) {
        this.manageInstId = manageInstId;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmaiil() {
        return contactEmaiil;
    }

    public void setContactEmaiil(String contactEmaiil) {
        this.contactEmaiil = contactEmaiil;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAgentAddr() {
        return agentAddr;
    }

    public void setAgentAddr(String agentAddr) {
        this.agentAddr = agentAddr;
    }

    public String getIsProfitFlag() {
        return isProfitFlag;
    }

    public void setIsProfitFlag(String isProfitFlag) {
        this.isProfitFlag = isProfitFlag;
    }

    public String getIsShowAllFlag() {
        return isShowAllFlag;
    }

    public void setIsShowAllFlag(String isShowAllFlag) {
        this.isShowAllFlag = isShowAllFlag;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public Long getSettleCycle() {
        return settleCycle;
    }

    public void setSettleCycle(Long settleCycle) {
        this.settleCycle = settleCycle;
    }

    public String getSettleAcctNo() {
        return settleAcctNo;
    }

    public void setSettleAcctNo(String settleAcctNo) {
        this.settleAcctNo = settleAcctNo;
    }

    public String getSettleAcctType() {
        return settleAcctType;
    }

    public void setSettleAcctType(String settleAcctType) {
        this.settleAcctType = settleAcctType;
    }

    public String getSettleAcctName() {
        return settleAcctName;
    }

    public void setSettleAcctName(String settleAcctName) {
        this.settleAcctName = settleAcctName;
    }

    public String getAcctOpenBankNo() {
        return acctOpenBankNo;
    }

    public void setAcctOpenBankNo(String acctOpenBankNo) {
        this.acctOpenBankNo = acctOpenBankNo;
    }

    public String getAcctOpenBankName() {
        return acctOpenBankName;
    }

    public void setAcctOpenBankName(String acctOpenBankName) {
        this.acctOpenBankName = acctOpenBankName;
    }

    public String getAcctOpenProvince() {
        return acctOpenProvince;
    }

    public void setAcctOpenProvince(String acctOpenProvince) {
        this.acctOpenProvince = acctOpenProvince;
    }

    public String getAcctOpenCity() {
        return acctOpenCity;
    }

    public void setAcctOpenCity(String acctOpenCity) {
        this.acctOpenCity = acctOpenCity;
    }

    public String getAcctOpenArea() {
        return acctOpenArea;
    }

    public void setAcctOpenArea(String acctOpenArea) {
        this.acctOpenArea = acctOpenArea;
    }

    public String getProfitRule() {
        return profitRule;
    }

    public void setProfitRule(String profitRule) {
        this.profitRule = profitRule;
    }

    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getStopReason() {
        return stopReason;
    }

    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getAuditRefuseReason() {
        return auditRefuseReason;
    }

    public void setAuditRefuseReason(String auditRefuseReason) {
        this.auditRefuseReason = auditRefuseReason;
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
        return this.agentCode;
    }

    @Override
    public String toString() {
        return "TBAgentInfo{" +
        "id=" + id +
        ", instId=" + instId +
        ", agentCode=" + agentCode +
        ", agentName=" + agentName +
        ", agentSimpleName=" + agentSimpleName +
        ", superAgentCode=" + superAgentCode +
        ", manageInstId=" + manageInstId +
        ", licenceType=" + licenceType +
        ", licenceCode=" + licenceCode +
        ", registerCapital=" + registerCapital +
        ", artifName=" + artifName +
        ", artifCertType=" + artifCertType +
        ", artifCertNo=" + artifCertNo +
        ", certEffectiveDate=" + certEffectiveDate +
        ", certExpiryDate=" + certExpiryDate +
        ", artifMobile=" + artifMobile +
        ", artifEmail=" + artifEmail +
        ", contactName=" + contactName +
        ", contactPhone=" + contactPhone +
        ", contactEmaiil=" + contactEmaiil +
        ", postCode=" + postCode +
        ", agentAddr=" + agentAddr +
        ", isProfitFlag=" + isProfitFlag +
        ", isShowAllFlag=" + isShowAllFlag +
        ", settleType=" + settleType +
        ", settleCycle=" + settleCycle +
        ", settleAcctNo=" + settleAcctNo +
        ", settleAcctType=" + settleAcctType +
        ", settleAcctName=" + settleAcctName +
        ", acctOpenBankNo=" + acctOpenBankNo +
        ", acctOpenBankName=" + acctOpenBankName +
        ", acctOpenProvince=" + acctOpenProvince +
        ", acctOpenCity=" + acctOpenCity +
        ", acctOpenArea=" + acctOpenArea +
        ", profitRule=" + profitRule +
        ", agentStatus=" + agentStatus +
        ", auditStatus=" + auditStatus +
        ", stopReason=" + stopReason +
        ", cancelReason=" + cancelReason +
        ", auditRefuseReason=" + auditRefuseReason +
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
