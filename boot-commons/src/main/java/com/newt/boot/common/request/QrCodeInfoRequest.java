package com.newt.boot.common.request;

import java.io.Serializable;

public class QrCodeInfoRequest implements Serializable {

    private static final long serialVersionUID = -8391910780597448014L;

    private String qrUrl;

    private String userId;

    private String logoPath;

    private String traceNo;


    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }
}
