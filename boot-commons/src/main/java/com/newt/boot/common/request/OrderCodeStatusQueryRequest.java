package com.newt.boot.common.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/7/29
 * 退款及订单状态查询 entity
 */
public class OrderCodeStatusQueryRequest implements Serializable {

    private String oriTraceNo;
    private String oriPayId;
    private String mchntNo;
    private String userId;
    @NotNull(message = "流水号不能为空")
    private String traceNo;

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

    public OrderCodeStatusQueryRequest() {
    }

    public String getOriTraceNo() {
        return this.oriTraceNo;
    }

    public void setOriTraceNo(String oriTraceNo) {
        this.oriTraceNo = oriTraceNo;
    }

    public String getOriPayId() {
        return this.oriPayId;
    }

    public void setOriPayId(String oriPayId) {
        this.oriPayId = oriPayId;
    }

    public String getMchntNo() {
        return this.mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }


    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderCodeStatusQueryRequest{" +
                "oriTraceNo='" + oriTraceNo + '\'' +
                ", oriPayId='" + oriPayId + '\'' +
                ", mchntNo='" + mchntNo + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
