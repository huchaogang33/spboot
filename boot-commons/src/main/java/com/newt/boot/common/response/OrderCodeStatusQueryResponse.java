package com.newt.boot.common.response;

import java.io.Serializable;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/7/29
 * 退款/订单状态响应 entity
 */
public class OrderCodeStatusQueryResponse implements Serializable {

    private OrderInfo orderInfo;

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public String toString() {
        return "OrderCodeStatusQueryResponse{" +
                "orderInfo=" + orderInfo +
                '}';
    }
}
