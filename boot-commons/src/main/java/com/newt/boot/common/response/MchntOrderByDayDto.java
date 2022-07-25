package com.newt.boot.common.response;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/4
 */
public class MchntOrderByDayDto {


    /**
     * 交易额
     */
    private BigDecimal dayOrderTotalAmt=new BigDecimal(0);


    /**
     * 交易笔数
     */
    private Integer orderCount=0;

    /**
     * 业务产品代码
     */
    private String bizProdCode;


    /**
     * 不同产品 - 交易额
     */
    private BigDecimal proCodeAmt=new BigDecimal(0);

    /**
     * 日期
     */
    private String txnDate;

    /**
     * 占比率
     */
    private String ratio;

    /**
     * 业务产品代码 分组统计
     */
    private Map<String, List<MchntOrderByDayDto>> groupPro;
    private List<MchntOrderByDayDto> listGroupPro;


    public List<MchntOrderByDayDto> getListGroupPro() {
        return listGroupPro;
    }

    public void setListGroupPro(List<MchntOrderByDayDto> listGroupPro) {
        this.listGroupPro = listGroupPro;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public Map<String, List<MchntOrderByDayDto>> getGroupPro() {
        return groupPro;
    }

    public void setGroupPro(Map<String, List<MchntOrderByDayDto>> groupPro) {
        this.groupPro = groupPro;
    }

    public BigDecimal getDayOrderTotalAmt() {
        return dayOrderTotalAmt;
    }

    public void setDayOrderTotalAmt(BigDecimal dayOrderTotalAmt) {
        this.dayOrderTotalAmt = dayOrderTotalAmt;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public String getBizProdCode() {
        return bizProdCode;
    }

    public void setBizProdCode(String bizProdCode) {
        this.bizProdCode = bizProdCode;
    }

    public BigDecimal getProCodeAmt() {
        return proCodeAmt;
    }

    public void setProCodeAmt(BigDecimal proCodeAmt) {
        this.proCodeAmt = proCodeAmt;
    }
}
