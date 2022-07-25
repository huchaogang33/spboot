package com.newt.boot.service.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * 读取项目相关配置
 *
 */
@Component
@ConfigurationProperties(prefix = "mchs.app")
public class MchsAppConfig {
    /**
     * 上传路径
     */
    private static String profile;

    /**
     * 版本
     */
    private String version;

    public static String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        MchsAppConfig.profile = profile;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取上传路径
     */
    public static String getUploadPath(String type) {
        return getProfile() + File.separator + type;
    }
}
