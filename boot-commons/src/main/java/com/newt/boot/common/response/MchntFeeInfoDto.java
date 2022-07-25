package com.newt.boot.common.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class MchntFeeInfoDto implements Serializable {
    private static final long serialVersionUID = 6117491643817499445L;

    /**
     * 基础产品编码
     */
    private String baseProdCode;

    /**
     * 费率类型
     */
    private String feeType;

    /**
     * 手续费收取方式
     */
    private String feeInputMode;

    /**
     * 费率比率
     */
    private BigDecimal feeRate;

    /**
     * 封顶金额
     */
    private BigDecimal feeCappingAmt;

    /**
     * 固定金额
     */
    private BigDecimal feeFixedAmt;

    public String getBaseProdCode() {
        return baseProdCode;
    }

    public void setBaseProdCode(String baseProdCode) {
        this.baseProdCode = baseProdCode;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeInputMode() {
        return feeInputMode;
    }

    public void setFeeInputMode(String feeInputMode) {
        this.feeInputMode = feeInputMode;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getFeeCappingAmt() {
        return feeCappingAmt;
    }

    public void setFeeCappingAmt(BigDecimal feeCappingAmt) {
        this.feeCappingAmt = feeCappingAmt;
    }

    public BigDecimal getFeeFixedAmt() {
        return feeFixedAmt;
    }

    public void setFeeFixedAmt(BigDecimal feeFixedAmt) {
        this.feeFixedAmt = feeFixedAmt;
    }
}
