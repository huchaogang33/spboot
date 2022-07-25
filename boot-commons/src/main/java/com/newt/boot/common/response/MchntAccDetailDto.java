package com.newt.boot.common.response;

import java.util.List;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/5
 * 资金对账dto
 */
public class MchntAccDetailDto {


    /**
     * 是否为收支两线
     *
     * 1-收支两线
     * 0-非收支两线
     */
    private Integer incomeExpensesIs;


    /**
     * 交易日期
     */
    private String transDate;


    /**
     * 内部商户号/门店号
     */
    private String mchntNo;


    /**
     * 商户结算账户
     */
    private String mchntSettleAccount;

    /**
     * 商户手续费结算账户
     */
    private String mchntFeeAccount;


    /**
     * 支付账号类型
     */
    private String payAcctType;

    /**
     * 交易金额
     */
    private String transAmt;


    /**
     * 商户入账净额
     */
    private String mchntNetAmt;


    /**
     * 累计退货金额
     */
    private String totalRefundAmt;


    /**
     * 实收商户手续费
     */
    private String mchntActualFee;


    /**
     * 列表
     */
    private List<AccDetailDto>accDetails;


    /**
     * 商户净额清算日期
     */
    private String netSettleDate;


    public String getMchntSettleAccount() {
        return mchntSettleAccount;
    }

    public void setMchntSettleAccount(String mchntSettleAccount) {
        this.mchntSettleAccount = mchntSettleAccount;
    }

    public String getMchntFeeAccount() {
        return mchntFeeAccount;
    }

    public void setMchntFeeAccount(String mchntFeeAccount) {
        this.mchntFeeAccount = mchntFeeAccount;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public List<AccDetailDto> getAccDetails() {
        return accDetails;
    }

    public Integer getIncomeExpensesIs() {
        return incomeExpensesIs;
    }

    public void setIncomeExpensesIs(Integer incomeExpensesIs) {
        this.incomeExpensesIs = incomeExpensesIs;
    }

    public void setAccDetails(List<AccDetailDto> accDetails) {
        this.accDetails = accDetails;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getPayAcctType() {
        return payAcctType;
    }

    public void setPayAcctType(String payAcctType) {
        this.payAcctType = payAcctType;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getMchntNetAmt() {
        return mchntNetAmt;
    }

    public void setMchntNetAmt(String mchntNetAmt) {
        this.mchntNetAmt = mchntNetAmt;
    }

    public String getTotalRefundAmt() {
        return totalRefundAmt;
    }

    public void setTotalRefundAmt(String totalRefundAmt) {
        this.totalRefundAmt = totalRefundAmt;
    }

    public String getMchntActualFee() {
        return mchntActualFee;
    }

    public void setMchntActualFee(String mchntActualFee) {
        this.mchntActualFee = mchntActualFee;
    }

    public String getNetSettleDate() {
        return netSettleDate;
    }

    public void setNetSettleDate(String netSettleDate) {
        this.netSettleDate = netSettleDate;
    }
}
