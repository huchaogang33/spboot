package com.newt.boot.common.enums;

public enum ManagementScopeEnum {
    M01("01", "日用百货类"),
    M02("02", "餐饮、食品类"),
    M03("03", "汽车、汽配类"),
    M04("04", "旅行、住宿类"),
    M05("05", "服装服饰类"),
    M06("06", "休闲娱乐类"),
    M07("07", "房产、建筑类"),
    M08("08", "家居、家装类"),
    M09("09", "商品批发类"),
    M10("10", "生活服务类"),
    M99("99", "其他"),
    ;

    private final String code;
    private final String msg;

    ManagementScopeEnum(String code, String msg) {
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
        for (ManagementScopeEnum managementScopeEnum : ManagementScopeEnum.values()) {
            if (code.equals(managementScopeEnum.getCode()) ) {
                return managementScopeEnum.getMsg();
            }
        }
        return M99.getMsg();
    }
}
