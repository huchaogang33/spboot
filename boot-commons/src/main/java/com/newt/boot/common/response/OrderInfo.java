package com.newt.boot.common.response;

import java.io.Serializable;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/7/29
 */
public class OrderInfo implements Serializable {
    private String transDate;
    private String transTime;
    private String txnNum;
    private String mchntNo;
    private String mchntBizOrderId;
    private String mchntOrderId;
    private String mchntName;
    private String payAcctNo;
    private String orderCcy;
    private String orderAmt;
    private String realPayAmt;
    private String discountAmt;
    private String refundAmt;
    private String orderExpiryTime;
    private PayTypeInfo payTypeInfo;
    private String orderDesc;
    private String orderStatus;
    private String bizStatus;

    public OrderInfo() {
    }

    public String getTransDate() {
        return this.transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return this.transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getTxnNum() {
        return this.txnNum;
    }

    public void setTxnNum(String txnNum) {
        this.txnNum = txnNum;
    }

    public String getMchntNo() {
        return this.mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getMchntBizOrderId() {
        return this.mchntBizOrderId;
    }

    public void setMchntBizOrderId(String mchntBizOrderId) {
        this.mchntBizOrderId = mchntBizOrderId;
    }

    public String getMchntOrderId() {
        return this.mchntOrderId;
    }

    public void setMchntOrderId(String mchntOrderId) {
        this.mchntOrderId = mchntOrderId;
    }

    public String getMchntName() {
        return this.mchntName;
    }

    public void setMchntName(String mchntName) {
        this.mchntName = mchntName;
    }

    public String getPayAcctNo() {
        return this.payAcctNo;
    }

    public void setPayAcctNo(String payAcctNo) {
        this.payAcctNo = payAcctNo;
    }

    public String getOrderCcy() {
        return this.orderCcy;
    }

    public void setOrderCcy(String orderCcy) {
        this.orderCcy = orderCcy;
    }

    public String getOrderAmt() {
        return this.orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getRealPayAmt() {
        return this.realPayAmt;
    }

    public void setRealPayAmt(String realPayAmt) {
        this.realPayAmt = realPayAmt;
    }

    public String getDiscountAmt() {
        return this.discountAmt;
    }

    public void setDiscountAmt(String discountAmt) {
        this.discountAmt = discountAmt;
    }

    public String getRefundAmt() {
        return this.refundAmt;
    }

    public void setRefundAmt(String refundAmt) {
        this.refundAmt = refundAmt;
    }

    public String getOrderExpiryTime() {
        return this.orderExpiryTime;
    }

    public void setOrderExpiryTime(String orderExpiryTime) {
        this.orderExpiryTime = orderExpiryTime;
    }

    public PayTypeInfo getPayTypeInfo() {
        return this.payTypeInfo;
    }

    public void setPayTypeInfo(PayTypeInfo payTypeInfo) {
        this.payTypeInfo = payTypeInfo;
    }

    public String getOrderDesc() {
        return this.orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBizStatus() {
        return this.bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "transDate='" + transDate + '\'' +
                ", transTime='" + transTime + '\'' +
                ", txnNum='" + txnNum + '\'' +
                ", mchntNo='" + mchntNo + '\'' +
                ", mchntBizOrderId='" + mchntBizOrderId + '\'' +
                ", mchntOrderId='" + mchntOrderId + '\'' +
                ", mchntName='" + mchntName + '\'' +
                ", payAcctNo='" + payAcctNo + '\'' +
                ", orderCcy='" + orderCcy + '\'' +
                ", orderAmt='" + orderAmt + '\'' +
                ", realPayAmt='" + realPayAmt + '\'' +
                ", discountAmt='" + discountAmt + '\'' +
                ", refundAmt='" + refundAmt + '\'' +
                ", orderExpiryTime='" + orderExpiryTime + '\'' +
                ", payTypeInfo=" + payTypeInfo +
                ", orderDesc='" + orderDesc + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", bizStatus='" + bizStatus + '\'' +
                '}';
    }
}
