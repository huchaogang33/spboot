package com.newt.boot.common.response;

import java.io.Serializable;

public class MchntImageInfoDto implements Serializable {
    private static final long serialVersionUID = -6798585945001974192L;

    /**
     * 影像类型
     */
    private String imageType;

    /**
     * 影像序号
     */
    private Long imageIndex;

    /**
     * 本地存储路径
     */
    private String imageLocalPath;

    /**
     * 远程存储路径
     */
    private String imageRemotePath;

    /*图片描述*/

    private String imageDesc;

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Long getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(Long imageIndex) {
        this.imageIndex = imageIndex;
    }

    public String getImageLocalPath() {
        return imageLocalPath;
    }

    public void setImageLocalPath(String imageLocalPath) {
        this.imageLocalPath = imageLocalPath;
    }

    public String getImageRemotePath() {
        return imageRemotePath;
    }

    public void setImageRemotePath(String imageRemotePath) {
        this.imageRemotePath = imageRemotePath;
    }
}
