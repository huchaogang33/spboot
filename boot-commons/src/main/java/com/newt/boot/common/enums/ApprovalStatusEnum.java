package com.newt.boot.common.enums;

import org.springframework.util.StringUtils;

/**
 * igas提供的接口服务类型枚举
 */
public enum ApprovalStatusEnum {
    APPROVAL_COMMIT_SUCCESS("01", "申请提交成功"),
    APPROVAL_COMMIT_FAIL("02", "申请提交失败"),
    BIND_CARD_SUCCESS("11", "绑卡成功"),
    BIND_CARD_FAIL("12", "绑卡失败"),
    SIGN_CONTRACT_SUCCESS("21", "签约成功"),
    SIGN_CONTRACT_FAIL("22", "签约失败"),
    IN_VERIFY_PASS("31", "核查通过"),
    IN_VERIFY_REJECT("32", "核查拒绝"),
    IN_VERIFY_RETURN("33", "核查退回"),
    APPROVAL_FIRST_PASS("41", "行方初审通过"),
    APPROVAL_FIRST_REJECT("42", "行方初审拒绝"),
    APPROVAL_FINAL_PASS("51", "行方终审通过"),
    APPROVAL_FINAL_REJECT("52", "行方终审拒绝"),
    APPROVAL_ONCE_PASS("61", "行方一次审核通过"),
    APPROVAL_ONCE_REJECT("62", "行方一次审核拒绝"),
    ;

    private String type;
    private String desc;

    ApprovalStatusEnum(String type, String desc) {
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

    public static String getDescByType(String type) {
        if (StringUtils.isEmpty(type)) {
            return null;
        }
        for (ApprovalStatusEnum a: ApprovalStatusEnum.values()) {
            if (a.getType().equals(type)) {
                return  a.getDesc();
            }
        }
        return null;
    }
}
