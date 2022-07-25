package com.newt.boot.service.dto;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/7/19
 */
public class Voucher {

    private String voucherId;
    private String stock;
    private String begenTime;
    private String endTime;
    private String shopId;

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getBegenTime() {
        return begenTime;
    }

    public void setBegenTime(String begenTime) {
        this.begenTime = begenTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
