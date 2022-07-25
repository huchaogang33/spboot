package com.newt.boot.common.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class TradeInfoRequest extends FallQueryRequest {
    private static final long serialVersionUID = 6562533204818230828L;

    /**
     * 业务状态
     */
    private String bizStatus;

    /**
     * 金额下限
     */
    private BigDecimal amtStart;

    /**
     * 金额上限
     */
    private BigDecimal amtEnd;

    /**
     * 交易时间下限
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date txnTimeStart;

    /**
     * 交易时间上限
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date txnTimeEnd;

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }

    public BigDecimal getAmtStart() {
        return amtStart;
    }

    public void setAmtStart(BigDecimal amtStart) {
        this.amtStart = amtStart;
    }

    public BigDecimal getAmtEnd() {
        return amtEnd;
    }

    public void setAmtEnd(BigDecimal amtEnd) {
        this.amtEnd = amtEnd;
    }

    public Date getTxnTimeStart() {
        return txnTimeStart;
    }

    public void setTxnTimeStart(Date txnTimeStart) {
        this.txnTimeStart = txnTimeStart;
    }

    public Date getTxnTimeEnd() {
        return txnTimeEnd;
    }

    public void setTxnTimeEnd(Date txnTimeEnd) {
        this.txnTimeEnd = txnTimeEnd;
    }
}
