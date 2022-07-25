package com.newt.boot.common.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/4
 */
public class MchntOrderAmtTotalDto implements Serializable {


     /**
     * 商户号
     */
    private String mchntNo;

    /**
     * 日交易额
     */
    private BigDecimal  dayOrderTotalAmt=new BigDecimal(0);

    /**
     * 日笔数
     */
    private Integer dayOrderCount=0;


    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public BigDecimal getDayOrderTotalAmt() {
        return dayOrderTotalAmt;
    }

    public void setDayOrderTotalAmt(BigDecimal dayOrderTotalAmt) {
        this.dayOrderTotalAmt = dayOrderTotalAmt;
    }

    public Integer getDayOrderCount() {
        return dayOrderCount;
    }

    public void setDayOrderCount(Integer dayOrderCount) {
        this.dayOrderCount = dayOrderCount;
    }
}
