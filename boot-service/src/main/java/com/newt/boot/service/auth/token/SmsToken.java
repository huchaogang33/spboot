package com.newt.boot.service.auth.token;

import org.apache.shiro.authc.HostAuthenticationToken;

public class SmsToken implements HostAuthenticationToken {

    private static final long serialVersionUID = -9053762507177739817L;

    private String phone;

    private String code;

    private String host;

    public SmsToken(String phone, String code, String host) {
        this.phone = phone;
        this.code = code;
        this.host = host;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public Object getPrincipal() {
        return this.phone;
    }

    @Override
    public Object getCredentials() {
        return this.code;
    }
}
