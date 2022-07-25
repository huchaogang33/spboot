//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.newt.boot.common.response;

import java.io.Serializable;

public class PayTypeInfo implements Serializable {
    private String payType;
    private String tranAmt;
    private String payerAcctType;
    private String payerAcctInfo;
    private String transFlag;

    public PayTypeInfo() {
    }

    public String getTransFlag() {
        return this.transFlag;
    }

    public void setTransFlag(String transFlag) {
        this.transFlag = transFlag;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getTranAmt() {
        return this.tranAmt;
    }

    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getPayerAcctType() {
        return this.payerAcctType;
    }

    public void setPayerAcctType(String payerAcctType) {
        this.payerAcctType = payerAcctType;
    }

    public String getPayerAcctInfo() {
        return this.payerAcctInfo;
    }

    public void setPayerAcctInfo(String payerAcctinfo) {
        this.payerAcctInfo = payerAcctinfo;
    }

    @Override
    public String toString() {
        return "PayTypeInfo{" +
                "payType='" + payType + '\'' +
                ", tranAmt='" + tranAmt + '\'' +
                ", payerAcctType='" + payerAcctType + '\'' +
                ", payerAcctInfo='" + payerAcctInfo + '\'' +
                ", transFlag='" + transFlag + '\'' +
                '}';
    }
}
