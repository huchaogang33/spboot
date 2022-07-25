package com.newt.boot.service.auth.token;

import org.apache.shiro.authc.HostAuthenticationToken;

public class JwtToken implements HostAuthenticationToken {

    private static final long serialVersionUID = 806187102335526800L;

    private String token;

    private String deviceId;

    public JwtToken(String token, String deviceId) {
        this.token = token;
        this.deviceId = deviceId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String getHost() {
        return this.deviceId;
    }


    @Override
    public Object getPrincipal() {
        return this.token;
    }

    @Override
    public Object getCredentials() {
        return this.token;
    }
}
