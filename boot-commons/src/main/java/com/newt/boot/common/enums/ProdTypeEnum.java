package com.newt.boot.common.enums;

/**
 * 支付通道：微信、支付宝、银联、银联二维码小微、网联
 */
public enum ProdTypeEnum {
    /**
     * 支付通道-收单自主聚合码
     */
    BASE_PROD("00", "基础产品"),
    /**
     * 支付通道-银联
     */
    PROD("01", "标准产品");

    private String type;
    private String desc;

    ProdTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
