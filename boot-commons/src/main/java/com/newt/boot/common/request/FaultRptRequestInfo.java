package com.newt.boot.common.request;

import java.io.Serializable;
import java.util.List;

/**
 * 故障上报请求
 */
public class FaultRptRequestInfo implements Serializable {
    private static final long serialVersionUID = 9140707773765749349L;

    private String qcType;

    private String qcLevel;

    private String qcTitle;

    private String content;

    private List<FaultImgInfo> picUrls;

    public String getQcType() {
        return qcType;
    }

    public void setQcType(String qcType) {
        this.qcType = qcType;
    }

    public String getQcLevel() {
        return qcLevel;
    }

    public void setQcLevel(String qcLevel) {
        this.qcLevel = qcLevel;
    }

    public String getQcTitle() {
        return qcTitle;
    }

    public void setQcTitle(String qcTitle) {
        this.qcTitle = qcTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<FaultImgInfo> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<FaultImgInfo> picUrls) {
        this.picUrls = picUrls;
    }
}
