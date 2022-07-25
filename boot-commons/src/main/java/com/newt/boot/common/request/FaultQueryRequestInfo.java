package com.newt.boot.common.request;

import java.io.Serializable;

public class FaultQueryRequestInfo implements Serializable {

    private static final long serialVersionUID = 9179951807246246115L;

    private String qcType;

    private String qcStatus;

    private String keyWord;

    private String rptYear;

    private String rptMonth;

    public String getQcType() {
        return qcType;
    }

    public void setQcType(String qcType) {
        this.qcType = qcType;
    }

    public String getQcStatus() {
        return qcStatus;
    }

    public void setQcStatus(String qcStatus) {
        this.qcStatus = qcStatus;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getRptYear() {
        return rptYear;
    }

    public void setRptYear(String rptYear) {
        this.rptYear = rptYear;
    }

    public String getRptMonth() {
        return rptMonth;
    }

    public void setRptMonth(String rptMonth) {
        this.rptMonth = rptMonth;
    }
}
