package com.newt.boot.common.enums;

/**
 * 界面传入controller操作类型
 */
public enum BizDataAuditStatusEnum {
    /**
     * 正常 or 新增未提交审批
     */
    AUDIT_STATUS_ADD_NOTCOMMIT("00", "新增-待提交审批"),
    /**
     * 新增-审批流程中
     */
    AUDIT_STATUS_ADD_CHECKING("01", "新增-审批流程中"),
    /**
     * 新增-审批通过
     */
    AUDIT_STATUS_ADD_PASS("02", "新增-审批通过"),
    /**
     * 新增-审批拒绝
     */
    AUDIT_STATUS_ADD_REJECT("03", "新增-审批拒绝"),
    /**
     * 注销-待提交审批
     */
    AUDIT_STATUS_CANCEL_NOTCOMMIT("10", "注销-待提交审批"),
    /**
     * 注销-审批流程中
     */
    AUDIT_STATUS_CANCEL_CHECKING("11", "注销-审批流程中"),
    /**
     * 注销-审批通过
     */
    AUDIT_STATUS_CANCEL_PASS("12", "注销-审批通过"),
    /**
     * 注销-审批拒绝
     */
    AUDIT_STATUS_CANCEL_REJECT("13", "注销-审批拒绝"),
    /**
     * 停用-待提交审批
     */
    AUDIT_STATUS_STOP_NOTCOMMIT("20", "停用-待提交审批"),
    /**
     * 停用-审批流程中
     */
    AUDIT_STATUS_STOP_CHECKING("21", "停用-审批流程中"),
    /**
     * 停用-审批通过
     */
    AUDIT_STATUS_STOP_PASS("22", "停用-审批通过"),
    /**
     * 停用-审批拒绝
     */
    AUDIT_STATUS_STOP_REJECT("23", "停用-审批拒绝"),
    /**
     * 启用-待提交审批
     */
    AUDIT_STATUS_USE_NOTCOMMIT("30", "启用-待提交审批"),
    /**
     * 启用-审批流程中
     */
    AUDIT_STATUS_USE_CHECKING("31", "启用-审批流程中"),
    /**
     * 启用-审批通过
     */
    AUDIT_STATUS_USE_PASS("32", "启用-审批通过"),
    /**
     * 启用-审批拒绝
     */
    AUDIT_STATUS_USE_REJECT("33", "启用-审批拒绝"),
    /**
     * 修改-待提交审批
     */
    AUDIT_STATUS_UPD_NOTCOMMIT("40", "修改-待提交审批"),
    /**
     * 修改-审批流程中
     */
    AUDIT_STATUS_UPD_CHECKING("41", "修改-审批流程中"),
    /**
     * 修改-审批通过
     */
    AUDIT_STATUS_UPD_PASS("42", "修改-审批通过"),
    /**
     * 修改-审批拒绝
     */
    AUDIT_STATUS_UPD_REJECT("43", "修改-审批拒绝");

    private String type;
    private String desc;

    BizDataAuditStatusEnum(String type, String desc) {
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
