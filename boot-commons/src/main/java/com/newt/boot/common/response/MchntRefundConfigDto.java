package com.newt.boot.common.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/3
 */
public class MchntRefundConfigDto implements Serializable {

    /** 主键 */
    private Long id;

    /** 商户编号 */
    private String mchntNo;

    /** 开通退款标志 */
    private String refundFlag;

    /** 退款允许时间段开始 hhmm */
    private String refundStartTime;

    /** 退款允许时间段结束 hhmm */
    private String refundEndTime;

    /** 退款日限额 */
    private BigDecimal moneyLimitDay;

    /** 退款月限额 */
    private BigDecimal moneyLimitMonth;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    private Date updateTime;

    /** 创建者 */
    private String createBy;

    /** 创建时间 */
    private Date createTime;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getMchntNo() {
        return mchntNo;
    }
    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }

    public String getRefundFlag() {
        return refundFlag;
    }
    public void setRefundStartTime(String refundStartTime) {
        this.refundStartTime = refundStartTime;
    }

    public String getRefundStartTime() {
        return refundStartTime;
    }
    public void setRefundEndTime(String refundEndTime) {
        this.refundEndTime = refundEndTime;
    }

    public String getRefundEndTime() {
        return refundEndTime;
    }
    public void setMoneyLimitDay(BigDecimal moneyLimitDay) {
        this.moneyLimitDay = moneyLimitDay;
    }

    public BigDecimal getMoneyLimitDay() {
        return moneyLimitDay;
    }
    public void setMoneyLimitMonth(BigDecimal moneyLimitMonth) {
        this.moneyLimitMonth = moneyLimitMonth;
    }

    public BigDecimal getMoneyLimitMonth() {
        return moneyLimitMonth;
    }
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("mchntNo", getMchntNo())
                .append("refundFlag", getRefundFlag())
                .append("refundStartTime", getRefundStartTime())
                .append("refundEndTime", getRefundEndTime())
                .append("moneyLimitDay", getMoneyLimitDay())
                .append("moneyLimitMonth", getMoneyLimitMonth())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }


}
