package com.newt.boot.common.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeInfoDto implements Serializable {
    private static final long serialVersionUID = -3891464947981884266L;
    /**
     * 系统流水号
     */
    private String sysSeqNum;

    /**
     * 商户订单号
     */
    private String mchntOrderId;

    /**
     * 交易时间
     */
    private Date txnTime;

    /**
     * 交易金额
     */
    private BigDecimal amt;

    /**
     * 交易状态
     */
    private String TradeStatus;

    /**
     * 业务状态
     */
    private String bizStatus;

    /**
     * 交易码
     */
    private String txnNum;

    /**
     * + ,-
     */
    private String addOrSubt;

    /**
     * 交易来源
     */
    private String tradeSource;

    public String getAddOrSubt() {
        return addOrSubt;
    }

    public void setAddOrSubt(String addOrSubt) {
        this.addOrSubt = addOrSubt;
    }

    public String getTradeSource() {
        return tradeSource;
    }

    public String getTxnNum() {
        return txnNum;
    }

    public void setTxnNum(String txnNum) {
        this.txnNum = txnNum;
    }

    public void setTradeSource(String tradeSource) {
        this.tradeSource = tradeSource;
    }

    public String getSysSeqNum() {
        return sysSeqNum;
    }

    public void setSysSeqNum(String sysSeqNum) {
        this.sysSeqNum = sysSeqNum;
    }

    public String getMchntOrderId() {
        return mchntOrderId;
    }

    public void setMchntOrderId(String mchntOrderId) {
        this.mchntOrderId = mchntOrderId;
    }

    public Date getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(Date txnTime) {
        this.txnTime = txnTime;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getTradeStatus() {
        return TradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        TradeStatus = tradeStatus;
    }

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }
}
