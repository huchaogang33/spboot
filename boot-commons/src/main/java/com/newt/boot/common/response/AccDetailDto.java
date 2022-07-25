package com.newt.boot.common.response;

import java.math.BigDecimal;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/11/25
 */
public class AccDetailDto {


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
    private BigDecimal transAmt=new BigDecimal(0);


    /**
     * 商户入账净额
     */
    private String mchntNetAmt;


    /**
     * 累计退货金额
     */
    private BigDecimal totalRefundAmt=new BigDecimal(0);


    /**
     * 实收商户手续费
     */
    private BigDecimal mchntActualFee=new BigDecimal(0);


    /**
     * 商户净额清算日期
     */
    private String netSettleDate;

    /**前端区分->正常收入normalIncom,营销收入marketIncom,支出手续费expendIncom*/
    private String isNormalOrExpendOrMarket;

    public String getIsNormalOrExpendOrMarket() {
        return isNormalOrExpendOrMarket;
    }

    public void setIsNormalOrExpendOrMarket(String isNormalOrExpendOrMarket) {
        this.isNormalOrExpendOrMarket = isNormalOrExpendOrMarket;
    }

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

    public Integer getIncomeExpensesIs() {
        return incomeExpensesIs;
    }

    public void setIncomeExpensesIs(Integer incomeExpensesIs) {
        this.incomeExpensesIs = incomeExpensesIs;
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

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public String getMchntNetAmt() {
        return mchntNetAmt;
    }

    public void setMchntNetAmt(String mchntNetAmt) {
        this.mchntNetAmt = mchntNetAmt;
    }

    public BigDecimal getTotalRefundAmt() {
        return totalRefundAmt;
    }

    public void setTotalRefundAmt(BigDecimal totalRefundAmt) {
        this.totalRefundAmt = totalRefundAmt;
    }

    public BigDecimal getMchntActualFee() {
        return mchntActualFee;
    }

    public void setMchntActualFee(BigDecimal mchntActualFee) {
        this.mchntActualFee = mchntActualFee;
    }

    public String getNetSettleDate() {
        return netSettleDate;
    }

    public void setNetSettleDate(String netSettleDate) {
        this.netSettleDate = netSettleDate;
    }
}
