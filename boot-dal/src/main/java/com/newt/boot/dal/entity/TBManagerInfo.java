package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 客户经理信息表
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class TBManagerInfo extends Model<TBManagerInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 机构标识
     */
    @TableId(value = "inst_id", type = IdType.ASSIGN_UUID)
    private String instId;

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
     * 拓展经理手机号
     */
    private String managerPhone;

    /**
     * 所在省份
     */
    private String province;

    /**
     * 所在市
     */
    private String city;

    /**
     * 所在区
     */
    private String area;

    /**
     * 角色类型
     */
    private String roleType;

    /**
     * 用户状态
     */
    private String userStatus;

    /**
     * 用户openId
     */
    private String openId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 创建人
     */
    private String oprId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建机构
     */
    private String crtOrgId;

    /**
     * 最后修改人
     */
    private String lastOprId;

    /**
     * 最后修改时间
     */
    private String lastUpdateTime;

    /**
     * 非业务主键
     */
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
     * 代理商团队id
     */
    private String agentDeptId;


    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
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

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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

    public String getCrtOrgId() {
        return crtOrgId;
    }

    public void setCrtOrgId(String crtOrgId) {
        this.crtOrgId = crtOrgId;
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

    public String getAgentDeptId() {
        return agentDeptId;
    }

    public void setAgentDeptId(String agentDeptId) {
        this.agentDeptId = agentDeptId;
    }

    @Override
    protected Serializable pkVal() {
        return this.instId;
    }

    @Override
    public String toString() {
        return "TBManagerInfo{" +
        "instId=" + instId +
        ", signInstId=" + signInstId +
        ", signInstType=" + signInstType +
        ", managerId=" + managerId +
        ", managerName=" + managerName +
        ", managerPhone=" + managerPhone +
        ", province=" + province +
        ", city=" + city +
        ", area=" + area +
        ", roleType=" + roleType +
        ", userStatus=" + userStatus +
        ", openId=" + openId +
        ", batchNo=" + batchNo +
        ", oprId=" + oprId +
        ", createTime=" + createTime +
        ", crtOrgId=" + crtOrgId +
        ", lastOprId=" + lastOprId +
        ", lastUpdateTime=" + lastUpdateTime +
        ", id=" + id +
        ", remark1=" + remark1 +
        ", remark2=" + remark2 +
        ", remark3=" + remark3 +
        ", agentDeptId=" + agentDeptId +
        "}";
    }
}
