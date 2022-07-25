package com.newt.boot.common.enums;

public enum MchntTypeEnum {
   /* M00("00", "普通商户"),
    M10("10", "连锁商户"),
    M11("11", "连锁商户门店"),
    M20("20", "小微商户"),
    */
	//刘子良 2021-09-10 17:25 add
	 M20("20", "个体工商户"),
	 M30("30", "企业商户"),
	 M40("40", "党政机关、事业单位及其他社会团体"),
	 M10("10", "小微商户"),


    //商户状态mchnt_status
    /**
     * 00-非正式商户
     * 01-正式商户
     * 02-停用商户
     * 03-已注销商户
     */
    MCHNT00("00","非正式商户"),
    MCHNT01("01","正式商户"),
    MCHNT02("02","停用商户"),
    MCHNT03("03","已注销商户"),
    ;

    private final String code;
    private final String msg;

    MchntTypeEnum(String code, String msg) {
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
        for (MchntTypeEnum mchntTypeEnum : MchntTypeEnum.values()) {
            if (code.equals(mchntTypeEnum.getCode()) ) {
                return mchntTypeEnum.getMsg();
            }
        }
        return M10.getMsg();
    }
}
