package com.newt.boot.common.request;


import java.io.Serializable;

public class ScanQrCodeReceiptsRequest implements Serializable {
    private String userId           ;                     /*操作员 */
    private String mchntNo        ;                     /*商户号    */
    private String transCcy       ;                     /*交易币种 */
    private String transAmt       ;                     /*金额 */
    private String goodDesc       ;                     /*商品名称 */
    private String payQrCode      ;                     /*授权码 */
    private String traceNo      ;                     /*流水号 */

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

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

    public String getTransCcy() {
        return transCcy;
    }

    public void setTransCcy(String transCcy) {
        this.transCcy = transCcy;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
