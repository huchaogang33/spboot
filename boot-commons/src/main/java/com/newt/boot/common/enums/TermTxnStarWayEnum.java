package com.newt.boot.common.enums;

public enum TermTxnStarWayEnum {
    T01("01", "自助支付"),
    T10("10", "现场消费"),
    ;

    private final String code;
    private final String msg;

    TermTxnStarWayEnum(String code, String msg) {
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
        for (TermTxnStarWayEnum termTxnStarWayEnum : TermTxnStarWayEnum.values()) {
            if (code.equals(termTxnStarWayEnum.getCode()) ) {
                return termTxnStarWayEnum.getMsg();
            }
        }
        return null;
    }
}
