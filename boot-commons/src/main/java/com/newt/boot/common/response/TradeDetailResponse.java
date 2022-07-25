package com.newt.boot.common.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeDetailResponse implements Serializable {

    private static final long serialVersionUID = 53756746519507263L;

    /**
     * 商户号
     */
    private String mchntNo;

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
     * 收银员编号
     */
    private String cashierNo;

    /**
     * 收银员编号
     */
    private String cashierName;

    /**
     * 交易描述
     */
    private String orderDesc;

    /**
     * 交易状态
     */
    private String TradeStatus;

    /**
     * 业务状态
     */
    private String bizStatus;

    /**
     * 交易类型
     */
    private String tradeType;

    /**
     * 交易来源
     */
    private String tradeSource;

    /**
     * 付款方账户
     */
    private String payAccount;

    /**
     * 交易码
     */
    private String txmNum;


    public String getTxmNum() {
        return txmNum;
    }

    public void setTxmNum(String txmNum) {
        this.txmNum = txmNum;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
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

    public String getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(String cashierNo) {
        this.cashierNo = cashierNo;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeSource() {
        return tradeSource;
    }

    public void setTradeSource(String tradeSource) {
        this.tradeSource = tradeSource;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }
}
