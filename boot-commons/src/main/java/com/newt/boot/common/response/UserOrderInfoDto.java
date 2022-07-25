package com.newt.boot.common.response;

import java.math.BigDecimal;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/16
 */
public class UserOrderInfoDto {

    //交易金额
    private String payAmt;

    //创建时间
    private String orderCreTime;

    //订单号
    private String sysSeqNum;

    //累计退款金额
    private BigDecimal refundAmt=new BigDecimal(0);

    //交易类型来源
    private String tradeSource;

    //是否支持退款 true 是
    private boolean isRefund;

    public String getTradeSource() {
        return tradeSource;
    }

    public void setTradeSource(String tradeSource) {
        this.tradeSource = tradeSource;
    }

    public boolean isRefund() {
        return isRefund;
    }

    public void setRefund(boolean refund) {
        isRefund = refund;
    }

    public String getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(String payAmt) {
        this.payAmt = payAmt;
    }

    public String getOrderCreTime() {
        return orderCreTime;
    }

    public void setOrderCreTime(String orderCreTime) {
        this.orderCreTime = orderCreTime;
    }

    public String getSysSeqNum() {
        return sysSeqNum;
    }

    public void setSysSeqNum(String sysSeqNum) {
        this.sysSeqNum = sysSeqNum;
    }

    public BigDecimal getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(BigDecimal refundAmt) {
        this.refundAmt = refundAmt;
    }
}
