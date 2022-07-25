package com.newt.boot.common.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class GenDynamicQrRequest implements Serializable {


    private String userId           ;                     /*操作员 */

    private String mchntNo        ;                     /*商户号    */

    private String transCcy       ;                     /*交易币种 */
    @NotNull(message = "金额 不能为空")
    private String transAmt       ;                     /*金额 */
    private String goodDesc       ;                     /*商品名称 */
    @NotNull(message = "授权码 不能为空")
    private String payQrCode      ;                     /*授权码 */
    //流水号
    @NotNull(message = "流水号不能为空")
    private String traceNo;

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getPayQrCode() {
        return payQrCode;
    }

    public void setPayQrCode(String payQrCode) {
        this.payQrCode = payQrCode;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTransCcy() {
        return transCcy;
    }

    public void setTransCcy(String transCcy) {
        this.transCcy = transCcy;
    }

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }
}
