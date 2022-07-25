package com.newt.boot.common.response;

import java.io.Serializable;

public class MchntQrcodeDto implements Serializable {
    private static final long serialVersionUID = 6329590546850911466L;

    private String qrUrl;

    private String logoUrlPath;

    private String userId;

    private String name;

    private String role;

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getLogoUrlPath() {
        return logoUrlPath;
    }

    public void setLogoUrlPath(String logoUrlPath) {
        this.logoUrlPath = logoUrlPath;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
