package com.newt.boot.common.response;

import java.math.BigDecimal;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/6
 */
public class MchntAccSumDto {

    /**
     * 交易日期
     */
    private String transDate;

    /**
     * 是否收支两线
     */
    private String incomeExpensesIs;

    /**
     * 是否收支
     */
    private String isAccountType;

    /**
     * 内部商户号
     */
    private String mchntNo;

    /**
     * 交易金额
     */
    private String transAmt;


    /**
     * 商户入账净额
     */
    private BigDecimal mchntNetAmt=new BigDecimal(0);


    /**
     * 累计退货金额
     */
   // private BigDecimal totalRefundAmt=new BigDecimal(0);
    private String totalRefundAmt;


    /**
     * 实收商户手续费
     */
    //private BigDecimal mchntActualFee=new BigDecimal(0);
    private String mchntActualFee;


    /**
     * 商户净额清算日期
     */
    private String netSettleDate;


    /**
     * 结算总额
     * @return
     */

    private BigDecimal netSettleAmt=new BigDecimal(0);

    /**
     * 差错金额
     * @return
     */
    private  BigDecimal failAmt=new BigDecimal(0);

    /**营销费用*/
    private BigDecimal marketExpAmt=new BigDecimal(0);

    /**单日差错营销结算金额*/
    private BigDecimal errorMarketAmt=new BigDecimal(0);

    /**单日差错支出结算金额*/
    private BigDecimal errorExpendAmt=new BigDecimal(0);

    /**单日营销结算总金额*/
    private BigDecimal marketAmt=new BigDecimal(0);

    /**单日支出结算总金额*/
    private BigDecimal totalExpendAmt=new BigDecimal(0);


    public BigDecimal getErrorMarketAmt() {
        return errorMarketAmt;
    }

    public void setErrorMarketAmt(BigDecimal errorMarketAmt) {
        this.errorMarketAmt = errorMarketAmt;
    }

    public BigDecimal getErrorExpendAmt() {
        return errorExpendAmt;
    }

    public void setErrorExpendAmt(BigDecimal errorExpendAmt) {
        this.errorExpendAmt = errorExpendAmt;
    }

    public BigDecimal getMarketAmt() {
        return marketAmt;
    }

    public void setMarketAmt(BigDecimal marketAmt) {
        this.marketAmt = marketAmt;
    }

    public BigDecimal getTotalExpendAmt() {
        return totalExpendAmt;
    }

    public void setTotalExpendAmt(BigDecimal totalExpendAmt) {
        this.totalExpendAmt = totalExpendAmt;
    }

    public BigDecimal getMarketExpAmt() {
        return marketExpAmt;
    }

    public void setMarketExpAmt(BigDecimal marketExpAmt) {
        this.marketExpAmt = marketExpAmt;
    }

    public BigDecimal getNetSettleAmt() {
        return netSettleAmt;
    }

    public void setNetSettleAmt(BigDecimal netSettleAmt) {
        this.netSettleAmt = netSettleAmt;
    }

    public BigDecimal getFailAmt() {
        return failAmt;
    }

    public void setFailAmt(BigDecimal failAmt) {
        this.failAmt = failAmt;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getIncomeExpensesIs() {
        return incomeExpensesIs;
    }

    public void setIncomeExpensesIs(String incomeExpensesIs) {
        this.incomeExpensesIs = incomeExpensesIs;
    }

    public String getIsAccountType() {
        return isAccountType;
    }

    public void setIsAccountType(String isAccountType) {
        this.isAccountType = isAccountType;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public BigDecimal getMchntNetAmt() {
        return mchntNetAmt;
    }

    public void setMchntNetAmt(BigDecimal mchntNetAmt) {
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
