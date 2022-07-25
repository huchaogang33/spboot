package com.newt.boot.common.enums;

/**
 * 审核状态枚举
 * Created by hcg
 */
public enum AuditStatusEnum {
    BE_AUDIT("00","待提交审批"),
    ADD_BE_AUDIT("01","新增待审核"),
    ADD_AUDIT_SUCCESS("02","新增审核通过"),
    ADD_AUDIT_REJECT("03","新增审核拒绝"),
    CANCEL_BE_AUDDIT("11","注销待审核"),
    CANCEL_AUDIT_SUCCESS("12","注销审核通过"),
    CANCEL_AUDIT_REJECT("13","注销审核拒绝"),
    STOP_BE_AUDIT("21","停用待审核"),
    STOP_AUDIT_SUCCESS("22","停用审核通过"),
    STOP_AUDIT_REJECT("23","停用审核拒绝"),
    ENABLE_BE_AUDIT("31","启用待审核"),
    ENABLE_AUDIT_SUCCESS("32","启用审核通过"),
    ENALBLE_AUDIT_REJECT("33","启用审核拒绝"),
    MODIFY_BE_COMMIT_AUDIT("40","修改待提交审批"),
    MODIFY_BE_AUDIT("41","修改待审核"),
    MODIFY_AUDIT_SUCCESS("42","修改审核通过"),
    MODIFY_AUDIT_REJECT("43","修改审核拒绝"),
    ;
    private String auditStatus;
    private String auditDesc;

    AuditStatusEnum(String auditStatus, String auditDesc) {
        this.auditStatus = auditStatus;
        this.auditDesc = auditDesc;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }
}
