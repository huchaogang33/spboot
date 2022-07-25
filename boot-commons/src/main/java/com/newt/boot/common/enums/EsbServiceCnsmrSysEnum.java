package com.newt.boot.common.enums;

/**
 * Created with IntelliJ IDEA.
 * ESB银行核心消费方流水号前缀枚举
 *
 * @author: Zan YanHai.
 * @CreatedTime: 2021/9/28 15:52
 * @Description: 2021/9/28 15:52
 */
public enum EsbServiceCnsmrSysEnum {

    //定义8位前缀
    IAMBS("IAMBS000", "跑批应用", 1),
    IGAS1("IGAS1000", "联机应用", 2),
    BOMPS("BOMPS000", "前端应用", 3),
    MCHS("MCHS1000", "商户应用", 4),
    ;

    EsbServiceCnsmrSysEnum(String prefix, String desc, int index) {
        this.prefix = prefix;
        this.desc = desc;
        this.index = index;
    }

    private String prefix;

    private String desc;

    private int index;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "EsbServiceCnsmrSysEnum{" +
                "desc='" + desc + '\'' +
                ", index=" + index +
                '}';
    }
}
