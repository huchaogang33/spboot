package com.newt.boot.common.enums;
/**  
 * @Title:  NineElementVerifyEnum.java   
 * @Package com.newland.receipt.mchs.common.enums   
 * @Description:    描述   
 * @author: Qiguowen     
 * @date:   2022年5月9日 下午5:34:15   
 * @Copyright: 
 */
public enum NineElementVerifyEnum {
	NO_HIT_RULE("0", "未命中"),
	HIT_RULE("1", "命中");
	
	private final String code;
    private final String msg;

    NineElementVerifyEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
