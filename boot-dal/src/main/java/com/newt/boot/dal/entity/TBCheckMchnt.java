package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 核查商户信息表
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class TBCheckMchnt extends Model<TBCheckMchnt> {

    private static final long serialVersionUID = 1L;

    /**
     * 机构标识
     */
    private String instId;

    /**
     * 商户号
     */
    private String mchntNo;

    /**
     * 签约机构
     */
    private String signInstId;

    /**
     * 签约机构类型
     */
    private String signInstType;

    /**
     * 拓展经理工号
     */
    private String managerId;

    /**
     * 拓展经理姓名
     */
    private String managerName;

    /**
     * 商户名称是否一致Y是N否
     */
    private String isMchntName;

    /**
     * 商户类型是否一致Y是N否
     */
    private String isMchntType;

    /**
     * 经营内容是否一致Y是N否
     */
    private String isMchntContent;

    /**
     * 统一社会信用代码是否一致Y是N否
     */
    private String isCreditCode;

    /**
     * 法人负责人是否一致Y是N否
     */
    private String isArtif;

    /**
     * 结算账户是否有误Y是N否
     */
    private String isSettleAcct;

    /**
     * 终端布放地址是否一致Y是N否
     */
    private String isTermAddr;

    /**
     * 支行客户经理与商户负责人合照
     */
    private String managerMchntImage;

    /**
     * 支行客户经理与商户门面合照
     */
    private String managerMchntShopImage;

    /**
     * 商事平台查询截图、最多15张
     */
    private String mchntPlatformQuery;

    /**
     * 反洗钱系统查询截图、最多15张
     */
    private String antiMoneyLaund;

    /**
     * 核查结果通过pass,拒绝reject
     */
    private String checkResult;

    /**
     * 核查状态10待核查20已完成30已拒绝
     */
    private String checkAuditStatus;

    /**
     * 核查拒绝原因
     */
    private String checkRejectReason;

    /**
     * 数据是否有效Y是N否
     */
    private String dataStatus;

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
     * 最后审核人
     */
    private String lastAuditId;

    /**
     * 最后审核时间
     */
    private String lastAuditTime;

    /**
     * 非业务主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

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
     * 商户名称
     */
    private String mchntName;

    /**
     * 商户类型
     */
    private String mchntType;

    /**
     * 结算账户类型
     */
    private String settleAcctType;

    /**
     * 行业编号
     */
    private String industryType;


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

    public String getSignInstId() {
        return signInstId;
    }

    public void setSignInstId(String signInstId) {
        this.signInstId = signInstId;
    }

    public String getSignInstType() {
        return signInstType;
    }

    public void setSignInstType(String signInstType) {
        this.signInstType = signInstType;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getIsMchntName() {
        return isMchntName;
    }

    public void setIsMchntName(String isMchntName) {
        this.isMchntName = isMchntName;
    }

    public String getIsMchntType() {
        return isMchntType;
    }

    public void setIsMchntType(String isMchntType) {
        this.isMchntType = isMchntType;
    }

    public String getIsMchntContent() {
        return isMchntContent;
    }

    public void setIsMchntContent(String isMchntContent) {
        this.isMchntContent = isMchntContent;
    }

    public String getIsCreditCode() {
        return isCreditCode;
    }

    public void setIsCreditCode(String isCreditCode) {
        this.isCreditCode = isCreditCode;
    }

    public String getIsArtif() {
        return isArtif;
    }

    public void setIsArtif(String isArtif) {
        this.isArtif = isArtif;
    }

    public String getIsSettleAcct() {
        return isSettleAcct;
    }

    public void setIsSettleAcct(String isSettleAcct) {
        this.isSettleAcct = isSettleAcct;
    }

    public String getIsTermAddr() {
        return isTermAddr;
    }

    public void setIsTermAddr(String isTermAddr) {
        this.isTermAddr = isTermAddr;
    }

    public String getManagerMchntImage() {
        return managerMchntImage;
    }

    public void setManagerMchntImage(String managerMchntImage) {
        this.managerMchntImage = managerMchntImage;
    }

    public String getManagerMchntShopImage() {
        return managerMchntShopImage;
    }

    public void setManagerMchntShopImage(String managerMchntShopImage) {
        this.managerMchntShopImage = managerMchntShopImage;
    }

    public String getMchntPlatformQuery() {
        return mchntPlatformQuery;
    }

    public void setMchntPlatformQuery(String mchntPlatformQuery) {
        this.mchntPlatformQuery = mchntPlatformQuery;
    }

    public String getAntiMoneyLaund() {
        return antiMoneyLaund;
    }

    public void setAntiMoneyLaund(String antiMoneyLaund) {
        this.antiMoneyLaund = antiMoneyLaund;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getCheckAuditStatus() {
        return checkAuditStatus;
    }

    public void setCheckAuditStatus(String checkAuditStatus) {
        this.checkAuditStatus = checkAuditStatus;
    }

    public String getCheckRejectReason() {
        return checkRejectReason;
    }

    public void setCheckRejectReason(String checkRejectReason) {
        this.checkRejectReason = checkRejectReason;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getMchntName() {
        return mchntName;
    }

    public void setMchntName(String mchntName) {
        this.mchntName = mchntName;
    }

    public String getMchntType() {
        return mchntType;
    }

    public void setMchntType(String mchntType) {
        this.mchntType = mchntType;
    }

    public String getSettleAcctType() {
        return settleAcctType;
    }

    public void setSettleAcctType(String settleAcctType) {
        this.settleAcctType = settleAcctType;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBCheckMchnt{" +
        "instId=" + instId +
        ", mchntNo=" + mchntNo +
        ", signInstId=" + signInstId +
        ", signInstType=" + signInstType +
        ", managerId=" + managerId +
        ", managerName=" + managerName +
        ", isMchntName=" + isMchntName +
        ", isMchntType=" + isMchntType +
        ", isMchntContent=" + isMchntContent +
        ", isCreditCode=" + isCreditCode +
        ", isArtif=" + isArtif +
        ", isSettleAcct=" + isSettleAcct +
        ", isTermAddr=" + isTermAddr +
        ", managerMchntImage=" + managerMchntImage +
        ", managerMchntShopImage=" + managerMchntShopImage +
        ", mchntPlatformQuery=" + mchntPlatformQuery +
        ", antiMoneyLaund=" + antiMoneyLaund +
        ", checkResult=" + checkResult +
        ", checkAuditStatus=" + checkAuditStatus +
        ", checkRejectReason=" + checkRejectReason +
        ", dataStatus=" + dataStatus +
        ", oprId=" + oprId +
        ", createTime=" + createTime +
        ", lastOprId=" + lastOprId +
        ", lastUpdateTime=" + lastUpdateTime +
        ", lastAuditId=" + lastAuditId +
        ", lastAuditTime=" + lastAuditTime +
        ", id=" + id +
        ", remark1=" + remark1 +
        ", remark2=" + remark2 +
        ", remark3=" + remark3 +
        ", mchntName=" + mchntName +
        ", mchntType=" + mchntType +
        ", settleAcctType=" + settleAcctType +
        ", industryType=" + industryType +
        "}";
    }
}
