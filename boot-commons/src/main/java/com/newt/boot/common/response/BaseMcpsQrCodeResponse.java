package com.newt.boot.common.response;

import java.io.Serializable;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/7/27
 */
public class BaseMcpsQrCodeResponse implements Serializable {

    private String qrCode; //二维码信息
    private String payId;//支付流水号
    private String qrCodeType;//支持的支付方式


    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getQrCodeType() {
        return qrCodeType;
    }

    public void setQrCodeType(String qrCodeType) {
        this.qrCodeType = qrCodeType;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }



    @Override
    public String toString() {
        return "BaseMcpsResponse{" +
                "qrCode='" + qrCode + '\'' +
                ", payId='" + payId + '\'' +
                ", qrCodeType='" + qrCodeType + '\'' +
                '}';
    }
}
