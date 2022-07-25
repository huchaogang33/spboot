package com.newt.boot.common.response;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/27
 */
public class BizMarketerAdvertDto {

    /**
     * 广告类型
     */
    private String advertType;


    /**
     * 描述
     */
    private String advertDesc;

    /**
     * 营销页面信息
     */
    private String pageInfo;


    /**
     * 域名地址
     */
    private String domainUrl;

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public String getAdvertDesc() {
        return advertDesc;
    }

    public void setAdvertDesc(String advertDesc) {
        this.advertDesc = advertDesc;
    }

    public String getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public void setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
    }
}
