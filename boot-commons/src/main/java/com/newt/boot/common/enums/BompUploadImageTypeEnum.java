package com.newt.boot.common.enums;

/**
 * Created by Daniel on 2020/6/17.
 */
public enum BompUploadImageTypeEnum {
    NCHNT_ENTRY("00", "商户入驻影响"),
    CREDIT_REPORT("01", "征信报告"),
    MCHNT_INSPECT("02", "商户巡检"),
    QRCODE_LOGO("03", "二维码logo"),
    QRCORE_TEMPLET("04", "三维码模板"),
    MOMP_ADS_PHOTO("05", "营销广告图片"),
    TRANS_IMAGE("06", "交易凭证影像"),
    USER_IMAGE("07", "用户影像"),
    CONTRACT_PDF("08", "合同PDF")
    ;
    private String imageType;
    private String imageDesc;

    BompUploadImageTypeEnum(String imageType, String imageDesc) {
        this.imageType = imageType;
        this.imageDesc = imageDesc;
    }



    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }
}
