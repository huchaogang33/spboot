package com.newt.boot.common.response;

import java.io.Serializable;

public class SettleAccountDto implements Serializable {
    private static final long serialVersionUID = 329232831809956890L;

    private String fundType;

    private String acctNo;

    private String acctType;

    private String acctName;

    private String acctOpenBankNo;

    private String acctOpenBankName;

    private String settleType;

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctOpenBankNo() {
        return acctOpenBankNo;
    }

    public void setAcctOpenBankNo(String acctOpenBankNo) {
        this.acctOpenBankNo = acctOpenBankNo;
    }

    public String getAcctOpenBankName() {
        return acctOpenBankName;
    }

    public void setAcctOpenBankName(String acctOpenBankName) {
        this.acctOpenBankName = acctOpenBankName;
    }
}
