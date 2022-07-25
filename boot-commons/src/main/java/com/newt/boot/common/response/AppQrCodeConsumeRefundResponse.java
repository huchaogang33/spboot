package com.newt.boot.common.response;

import java.io.Serializable;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/7/29
 * 退款
 */
public class AppQrCodeConsumeRefundResponse  implements Serializable {

    private String settleDate;
    private OrderInfo orderInfo;

    public AppQrCodeConsumeRefundResponse() {
    }

    public String getSettleDate() {
        return this.settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public String toString() {
        return "AppQrCodeConsumeRefundResponse{" +
                "settleDate='" + settleDate + '\'' +
                ", orderInfo=" + orderInfo +
                '}';
    }
}
