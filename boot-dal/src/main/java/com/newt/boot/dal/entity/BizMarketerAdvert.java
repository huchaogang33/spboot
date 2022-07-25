package com.newt.boot.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 营销广告管理
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
public class BizMarketerAdvert extends Model<BizMarketerAdvert> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 广告类型
     */
    private String advertType;

    /**
     * 生效日期
     */
    private Date effectDate;

    /**
     * 失效日期
     */
    private Date invalidDate;

    /**
     * 描述
     */
    private String advertDesc;

    /**
     * 营销页面信息
     */
    private String pageInfo;

    /**
     * 状态 0待发布 1使用中 2 已失效
     */
    private String status;

    /**
     * 4-活动审核状态:发布-待审核、5-发布-审核通过、6-发布-审核拒绝
     */
    private String actAuditState;

    /**
     * 删除标志0：未删除 1：已删除
     */
    private String delFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getAdvertDesc() {
        return advertDesc;
    }

    public void setAdvertDesc(String advertDesc) {
        this.advertDesc = advertDesc;
    }

    public String getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActAuditState() {
        return actAuditState;
    }

    public void setActAuditState(String actAuditState) {
        this.actAuditState = actAuditState;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BizMarketerAdvert{" +
        "id=" + id +
        ", advertType=" + advertType +
        ", effectDate=" + effectDate +
        ", invalidDate=" + invalidDate +
        ", advertDesc=" + advertDesc +
        ", pageInfo=" + pageInfo +
        ", status=" + status +
        ", actAuditState=" + actAuditState +
        ", delFlag=" + delFlag +
        "}";
    }
}
