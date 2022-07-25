package com.newt.boot.common.response;

import java.io.Serializable;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/8/3
 *
 */
public class MchntAcctInfoDto implements Serializable {


    /**
     * 商户结算模式
     */
    private String mchntSettleMode;

    /**
     * 商户号
     */
    private String mchntNo;

    /**
     * 基础产品代码
     */
    private String baseProdCode;

    /**
     * 结算账户开户名
     */
    private String settleAcctName;
    /**
     * 资金类型
     */
    private String fundType;

    /**
     * 结算方式
     */
    private String settleType;

    /**
     * 结算周期
     */
    private Long settleCycle;

    /**
     * 结算账号
     */
    private String settleAcctNo;

    /**
     * 结算账户类型
     */
    private String settleAcctType;

    /**
     * 结算账户开户行名称
     */
    private String acctOpenBankName;
    /**
     * 结算账户开户行行号
     */
    private String acctOpenBankNo;


    /**
     * 影像类型
     */
    private String imageType;

    /**
     * 影像序号
     */
    private Long imageIndex;

    /**
     * 本地存储路径
     */
    private String imageLocalPath;

    /**开户时间*/
    private String acctOpenTime;

    /**true 支持修改  false不支持*/
    private boolean isModify;

    public boolean isModify() {
        return isModify;
    }

    public void setModify(boolean modify) {
        isModify = modify;
    }

    public String getAcctOpenTime() {
        return acctOpenTime;
    }

    public void setAcctOpenTime(String acctOpenTime) {
        this.acctOpenTime = acctOpenTime;
    }


    public String getAcctOpenBankNo() {
        return acctOpenBankNo;
    }

    public void setAcctOpenBankNo(String acctOpenBankNo) {
        this.acctOpenBankNo = acctOpenBankNo;
    }

    public String getSettleAcctName() {
        return settleAcctName;
    }

    public void setSettleAcctName(String settleAcctName) {
        this.settleAcctName = settleAcctName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Long getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(Long imageIndex) {
        this.imageIndex = imageIndex;
    }

    public String getImageLocalPath() {
        return imageLocalPath;
    }

    public void setImageLocalPath(String imageLocalPath) {
        this.imageLocalPath = imageLocalPath;
    }

    public String getMchntSettleMode() {
        return mchntSettleMode;
    }

    public void setMchntSettleMode(String mchntSettleMode) {
        this.mchntSettleMode = mchntSettleMode;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getBaseProdCode() {
        return baseProdCode;
    }

    public void setBaseProdCode(String baseProdCode) {
        this.baseProdCode = baseProdCode;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public Long getSettleCycle() {
        return settleCycle;
    }

    public void setSettleCycle(Long settleCycle) {
        this.settleCycle = settleCycle;
    }

    public String getSettleAcctNo() {
        return settleAcctNo;
    }

    public void setSettleAcctNo(String settleAcctNo) {
        this.settleAcctNo = settleAcctNo;
    }

    public String getSettleAcctType() {
        return settleAcctType;
    }

    public void setSettleAcctType(String settleAcctType) {
        this.settleAcctType = settleAcctType;
    }

    public String getAcctOpenBankName() {
        return acctOpenBankName;
    }

    public void setAcctOpenBankName(String acctOpenBankName) {
        this.acctOpenBankName = acctOpenBankName;
    }
}
