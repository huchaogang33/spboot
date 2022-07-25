package com.newt.boot.common.enums;

public enum LicenceTypeEnum {
    L00("00", "营业执照"),
    L01("01", "机构信用代码证"),
    L02("02", "民办非企业登记证书"),
    L03("03", "全国组织机构代码证"),
    L04("04", "事业单位法人证书"),
    L05("05", "境外企业证书"),
    L06("06", "社会团体法人登记证书"),
    L07("07", "工会法人资格证书"),
    L08("08", "政府批文"),
    L09("09", "预先核准通知书"),
    L10("10", "其他批文或证明"),
    L11("11", "贷款卡号"),
    L99("99", "其他"),
    ;

    private final String code;
    private final String msg;

    LicenceTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsgByCode(String code) {
        for (LicenceTypeEnum licenceTypeEnum : LicenceTypeEnum.values()) {
            if (code.equals(licenceTypeEnum.getCode()) ) {
                return licenceTypeEnum.getMsg();
            }
        }
        return L99.getMsg();
    }
}
