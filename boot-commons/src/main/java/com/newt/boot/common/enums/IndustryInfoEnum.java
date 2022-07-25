package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/17
 * 行业类别状态枚举
 */
public enum IndustryInfoEnum {


    //00-非正式,01-正式，02-停用，03-已注销
    //状态
    STATUS_00("00", "非正式"),
    STATUS_01("01", "正式"),
    STATUS_02("02", "停用"),
    STATUS_03("03", "已注销"),


    /**
     * 00-待提交审批,
     * 01-新增-审批流程中,
     * 02-新增-审批通过,
     * 03-新增-审批拒绝,
     * 11-注销-审批流程中,
     * 12-注销-审批通过,
     * 13-注销-审批拒绝,
     * 21-停用-审批流程中,
     * 22-停用-审批通过,
     * 23-停用-审批拒绝,
     * 31-启用-审批流程中,
     * 32-启用-审批通过,
     * 33-启用-审批拒绝,
     * 41-修改-审批流程中,
     * 42-修改-审批通过,
     * 43-修改-审批拒绝
     */
    //审批状态

    AUDIT_STATUS_32("32","审批通过")
    ;

    private final String code;
    private final String msg;

    IndustryInfoEnum(String code, String msg) {
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
