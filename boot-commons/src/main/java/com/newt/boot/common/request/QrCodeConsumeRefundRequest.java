package com.newt.boot.common.request;


import javax.validation.constraints.NotNull;

public class QrCodeConsumeRefundRequest extends BaseRequest {
    private String oriTraceNo  ;	/**原请求流水号*/
    private String oriPayId    ;	/**原支付流水号*/
    private String mchntNo     ;	/**商户号      */
    private String userId      ;	/**操作员      */
    private String transAmt    ;    /**退款金额    */
    private String termNo      ;    /**终端号      */
    private String userPwd;        /**密码*/
    private String refundDesc;     /**退款描述*/
    private String reason;         /**退款原因*/
    @NotNull(message = "流水号不能为空")
    private String traceNo;

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

    /**流水号*/



    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOriTraceNo() {
        return oriTraceNo;
    }

    public void setOriTraceNo(String oriTraceNo) {
        this.oriTraceNo = oriTraceNo;
    }

    public String getOriPayId() {
        return oriPayId;
    }

    public void setOriPayId(String oriPayId) {
        this.oriPayId = oriPayId;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }


}
