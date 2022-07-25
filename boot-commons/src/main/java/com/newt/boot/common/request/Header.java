package com.newt.boot.common.request;

import java.io.Serializable;


public class Header implements Serializable{
    private String version;     //版本号
    private String transDate;   //交易日期
    private String transTime;   //交易时间
    private String txnNum;      //交易类型
    private String bizType;     //业务分类
    private String instId;      //机构标识
    private String srcSysId;    //源系统标识
    private String chanlId;     //渠道标识
    private String traceNo;     //交易流水号
    private String session;     //会话标识
    private String signature;   //签名
    private String remark;      //预留域

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getTransDate()
    {
        return transDate;
    }

    public void setTransDate(String transDate)
    {
        this.transDate = transDate;
    }

    public String getTransTime()
    {
        return transTime;
    }

    public void setTransTime(String transTime)
    {
        this.transTime = transTime;
    }

    public String getTxnNum()
    {
        return txnNum;
    }

    public void setTxnNum(String txnNum)
    {
        this.txnNum = txnNum;
    }

    public String getBizType()
    {
        return bizType;
    }

    public void setBizType(String bizType)
    {
        this.bizType = bizType;
    }

    public String getInstId()
    {
        return instId;
    }

    public void setInstId(String instId)
    {
        this.instId = instId;
    }

    public String getSrcSysId()
    {
        return srcSysId;
    }

    public void setSrcSysId(String srcSysId)
    {
        this.srcSysId = srcSysId;
    }

    public String getChanlId()
    {
        return chanlId;
    }

    public void setChanlId(String chanlId)
    {
        this.chanlId = chanlId;
    }

    public String getTraceNo()
    {
        return traceNo;
    }

    public void setTraceNo(String traceNo)
    {
        this.traceNo = traceNo;
    }

    public String getSession()
    {
        return session;
    }

    public void setSession(String session)
    {
        this.session = session;
    }

    public String getSignature()
    {
        return signature;
    }

    public void setSignature(String signature)
    {
        this.signature = signature;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}
