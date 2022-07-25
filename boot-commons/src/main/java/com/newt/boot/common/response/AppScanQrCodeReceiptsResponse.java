package com.newt.boot.common.response;

import java.io.Serializable;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/7/29
 */
public class AppScanQrCodeReceiptsResponse implements Serializable {

    private String acqInstCode;
    private String settleDate;
    private OrderInfo orderInfo;

    public String getAcqInstCode() {
        return acqInstCode;
    }

    public void setAcqInstCode(String acqInstCode) {
        this.acqInstCode = acqInstCode;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public String toString() {
        return "AppScanQrCodeReceiptsResponse{" +
                "acqInstCode='" + acqInstCode + '\'' +
                ", settleDate='" + settleDate + '\'' +
                ", orderInfo=" + orderInfo +
                '}';
    }
}
