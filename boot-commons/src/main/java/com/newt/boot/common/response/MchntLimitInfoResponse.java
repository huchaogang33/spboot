package com.newt.boot.common.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class MchntLimitInfoResponse implements Serializable {

    private static final long serialVersionUID = -1595359068085809153L;

    //减免额度
    /**
     * 月手续费补贴额度
     */
    private String monthChargeLimit;

    /**
     * 本月剩余补贴额度
     */
    private String monthSubsidyLimit;

    /**
     * 减免金额总计
     */
    private String deductionAmount;

    /**
     * 存款升档差距（万元）
     */

    private  String depositGap;

    private String feeCapsAmt;
    /**
     * 是否全产品  刷卡及扫码  true 全产品 /false 否
     */
    private  boolean everyProFlag;

    /**
     * 刷卡手续费补贴额度
     */
    private String payCardChargeLimit;

    /**
     * 刷卡剩余补贴额度
     */
    private String payCardSubsidyLimit;

    /**
     * 扫码手续费补贴额度
     */
    private String scanCodeChargeLimit;

    /**
     * 扫码剩余补贴额度
     */
    private String scanCodeSubsidyLimit;

    ///////////////////////////////////////////////

    /**
     * 商户日累计额度
     */
    private BigDecimal dayTotalAmt;

    /**
     * 商户日累计限额
     */
    private BigDecimal dayLimitAmt;

    /**
     * 商户月累计额度
     */
    private BigDecimal monthTotalAmt;

    /**
     * 商户月累计限额
     */
    private BigDecimal monthLimitAmt;

    /**
     * 单笔借记限额
     */
    private BigDecimal singleDebitLimitAmt;

    /**
     * 单日可用借记额度
     */
    private BigDecimal dayDebitTotalAmt;

    /**
     * 单日借记限额
     */
    private BigDecimal dayDebitLimitAmt;

    /**
     * 单月可用借记额度
     */
    private BigDecimal monthDebitTotalAmt;

    /**
     * 单月借记限额
     */
    private BigDecimal monthDebitLimitAmt;

    /**
     * 单笔贷记额度
     */
    private BigDecimal singleCreditLimitAmt;

    /**
     * 单日可用贷记额度
     */
    private BigDecimal dayCreditTotalAmt;

    /**
     * 单日贷记限额
     */
    private BigDecimal dayCreditLimitAmt;

    /**
     * 单月可用贷记额度
     */
    private BigDecimal monthCreditTotalAmt;

    /**
     * 单月贷记限额
     */
    private BigDecimal monthCreditLimitAmt;

    /**
     * 单笔退款借记限额
     */
    private BigDecimal singleRefundDebitLimitAmt;

    /**
     * 单笔退款贷记限额
     */
    private BigDecimal singleRefundCreditLimitAmt;

    /**
     * 单日可用退款额度
     */
    private BigDecimal dayRefundTotalAmt;

    /**
     * 单日退款限额
     */
    private BigDecimal dayRefundLimitAmt;

    /**
     * 单日可用退款借记额度
     */
    private BigDecimal dayRefundDebitTotalAmt;

    /**
     * 单日退款借记限额
     */
    private BigDecimal dayRefundDebitLimitAmt;

    /**
     * 单日可用退款贷记额度
     */
    private BigDecimal dayRefundCreditTotalAmt;

    /**
     * 单日退款贷记限额
     */
    private BigDecimal dayRefundCreditLimitAmt;

    public BigDecimal getDayTotalAmt() {
        return dayTotalAmt;
    }

    public void setDayTotalAmt(BigDecimal dayTotalAmt) {
        this.dayTotalAmt = dayTotalAmt;
    }

    public BigDecimal getDayLimitAmt() {
        return dayLimitAmt;
    }

    public void setDayLimitAmt(BigDecimal dayLimitAmt) {
        this.dayLimitAmt = dayLimitAmt;
    }

    public BigDecimal getMonthTotalAmt() {
        return monthTotalAmt;
    }

    public void setMonthTotalAmt(BigDecimal monthTotalAmt) {
        this.monthTotalAmt = monthTotalAmt;
    }

    public BigDecimal getMonthLimitAmt() {
        return monthLimitAmt;
    }

    public void setMonthLimitAmt(BigDecimal monthLimitAmt) {
        this.monthLimitAmt = monthLimitAmt;
    }

    public BigDecimal getSingleDebitLimitAmt() {
        return singleDebitLimitAmt;
    }

    public void setSingleDebitLimitAmt(BigDecimal singleDebitLimitAmt) {
        this.singleDebitLimitAmt = singleDebitLimitAmt;
    }

    public BigDecimal getDayDebitTotalAmt() {
        return dayDebitTotalAmt;
    }

    public void setDayDebitTotalAmt(BigDecimal dayDebitTotalAmt) {
        this.dayDebitTotalAmt = dayDebitTotalAmt;
    }

    public BigDecimal getDayDebitLimitAmt() {
        return dayDebitLimitAmt;
    }

    public void setDayDebitLimitAmt(BigDecimal dayDebitLimitAmt) {
        this.dayDebitLimitAmt = dayDebitLimitAmt;
    }

    public BigDecimal getMonthDebitTotalAmt() {
        return monthDebitTotalAmt;
    }

    public void setMonthDebitTotalAmt(BigDecimal monthDebitTotalAmt) {
        this.monthDebitTotalAmt = monthDebitTotalAmt;
    }

    public BigDecimal getMonthDebitLimitAmt() {
        return monthDebitLimitAmt;
    }

    public void setMonthDebitLimitAmt(BigDecimal monthDebitLimitAmt) {
        this.monthDebitLimitAmt = monthDebitLimitAmt;
    }

    public BigDecimal getSingleCreditLimitAmt() {
        return singleCreditLimitAmt;
    }

    public void setSingleCreditLimitAmt(BigDecimal singleCreditLimitAmt) {
        this.singleCreditLimitAmt = singleCreditLimitAmt;
    }

    public BigDecimal getDayCreditTotalAmt() {
        return dayCreditTotalAmt;
    }

    public void setDayCreditTotalAmt(BigDecimal dayCreditTotalAmt) {
        this.dayCreditTotalAmt = dayCreditTotalAmt;
    }

    public BigDecimal getDayCreditLimitAmt() {
        return dayCreditLimitAmt;
    }

    public void setDayCreditLimitAmt(BigDecimal dayCreditLimitAmt) {
        this.dayCreditLimitAmt = dayCreditLimitAmt;
    }

    public BigDecimal getMonthCreditTotalAmt() {
        return monthCreditTotalAmt;
    }

    public void setMonthCreditTotalAmt(BigDecimal monthCreditTotalAmt) {
        this.monthCreditTotalAmt = monthCreditTotalAmt;
    }

    public BigDecimal getMonthCreditLimitAmt() {
        return monthCreditLimitAmt;
    }

    public void setMonthCreditLimitAmt(BigDecimal monthCreditLimitAmt) {
        this.monthCreditLimitAmt = monthCreditLimitAmt;
    }

    public BigDecimal getSingleRefundDebitLimitAmt() {
        return singleRefundDebitLimitAmt;
    }

    public void setSingleRefundDebitLimitAmt(BigDecimal singleRefundDebitLimitAmt) {
        this.singleRefundDebitLimitAmt = singleRefundDebitLimitAmt;
    }

    public BigDecimal getSingleRefundCreditLimitAmt() {
        return singleRefundCreditLimitAmt;
    }

    public void setSingleRefundCreditLimitAmt(BigDecimal singleRefundCreditLimitAmt) {
        this.singleRefundCreditLimitAmt = singleRefundCreditLimitAmt;
    }

    public BigDecimal getDayRefundTotalAmt() {
        return dayRefundTotalAmt;
    }

    public void setDayRefundTotalAmt(BigDecimal dayRefundTotalAmt) {
        this.dayRefundTotalAmt = dayRefundTotalAmt;
    }

    public BigDecimal getDayRefundLimitAmt() {
        return dayRefundLimitAmt;
    }

    public void setDayRefundLimitAmt(BigDecimal dayRefundLimitAmt) {
        this.dayRefundLimitAmt = dayRefundLimitAmt;
    }

    public BigDecimal getDayRefundDebitTotalAmt() {
        return dayRefundDebitTotalAmt;
    }

    public void setDayRefundDebitTotalAmt(BigDecimal dayRefundDebitTotalAmt) {
        this.dayRefundDebitTotalAmt = dayRefundDebitTotalAmt;
    }

    public BigDecimal getDayRefundDebitLimitAmt() {
        return dayRefundDebitLimitAmt;
    }

    public void setDayRefundDebitLimitAmt(BigDecimal dayRefundDebitLimitAmt) {
        this.dayRefundDebitLimitAmt = dayRefundDebitLimitAmt;
    }

    public BigDecimal getDayRefundCreditTotalAmt() {
        return dayRefundCreditTotalAmt;
    }

    public void setDayRefundCreditTotalAmt(BigDecimal dayRefundCreditTotalAmt) {
        this.dayRefundCreditTotalAmt = dayRefundCreditTotalAmt;
    }

    public BigDecimal getDayRefundCreditLimitAmt() {
        return dayRefundCreditLimitAmt;
    }

    public void setDayRefundCreditLimitAmt(BigDecimal dayRefundCreditLimitAmt) {
        this.dayRefundCreditLimitAmt = dayRefundCreditLimitAmt;
    }

    public String getMonthChargeLimit() {
        return monthChargeLimit;
    }

    public void setMonthChargeLimit(String monthChargeLimit) {
        this.monthChargeLimit = monthChargeLimit;
    }

    public String getMonthSubsidyLimit() {
        return monthSubsidyLimit;
    }

    public void setMonthSubsidyLimit(String monthSubsidyLimit) {
        this.monthSubsidyLimit = monthSubsidyLimit;
    }

    public String getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(String deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public String getDepositGap() {
        return depositGap;
    }

    public void setDepositGap(String depositGap) {
        this.depositGap = depositGap;
    }

    public boolean isEveryProFlag() {
        return everyProFlag;
    }

    public void setEveryProFlag(boolean everyProFlag) {
        this.everyProFlag = everyProFlag;
    }

    public String getPayCardChargeLimit() {
        return payCardChargeLimit;
    }

    public void setPayCardChargeLimit(String payCardChargeLimit) {
        this.payCardChargeLimit = payCardChargeLimit;
    }

    public String getPayCardSubsidyLimit() {
        return payCardSubsidyLimit;
    }

    public void setPayCardSubsidyLimit(String payCardSubsidyLimit) {
        this.payCardSubsidyLimit = payCardSubsidyLimit;
    }

    public String getScanCodeChargeLimit() {
        return scanCodeChargeLimit;
    }

    public void setScanCodeChargeLimit(String scanCodeChargeLimit) {
        this.scanCodeChargeLimit = scanCodeChargeLimit;
    }

    public String getScanCodeSubsidyLimit() {
        return scanCodeSubsidyLimit;
    }

    public void setScanCodeSubsidyLimit(String scanCodeSubsidyLimit) {
        this.scanCodeSubsidyLimit = scanCodeSubsidyLimit;
    }

    public String getFeeCapsAmt() {
        return feeCapsAmt;
    }

    public void setFeeCapsAmt(String feeCapsAmt) {
        this.feeCapsAmt = feeCapsAmt;
    }
}
