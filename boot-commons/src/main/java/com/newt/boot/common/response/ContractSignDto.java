package com.newt.boot.common.response;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/9/22
 */
public class ContractSignDto {

    /** 主键id */
    private Integer id;

    /** 商户名称 */
    private String mchntName;

    /** 签署人证件号码 */
    private String sgntrprsnidentno;
    private String ContrNo;//合同号
    private String PrjNo;//项目号
    /** 合同名称 */
    private String contrnm;

    /** 合同状态 */
    private String contrst;

    /** 签署人名称 */
    private String sgntrprsnnm;

    /** 签署人证件类型编码 */
    private String sgntrprsnidenttpencd;

    /** 签约状态 */
    private String sgntrst;

    /** 签约时间 */
    private String sgntrtm;

    /** 本地存储路径 */
    private String contractLocalPath;

    private String signPrincipalMchnt;

    private String signResult;

    private String delFlag;

    private String templatePath;

    /**是否签约 10 需签约 ，20 无需签约且审核中 ,30无需签约审核通过 ,40需要绑卡*/
    private  String isSign;

    /**
     * 商户结算模式
     */
    private String mchntSettleModel;

    public String getMchntSettleModel() {
        return mchntSettleModel;
    }

    public void setMchntSettleModel(String mchntSettleModel) {
        this.mchntSettleModel = mchntSettleModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMchntName() {
        return mchntName;
    }

    public void setMchntName(String mchntName) {
        this.mchntName = mchntName;
    }

    public String getSgntrprsnidentno() {
        return sgntrprsnidentno;
    }

    public void setSgntrprsnidentno(String sgntrprsnidentno) {
        this.sgntrprsnidentno = sgntrprsnidentno;
    }

    public String getContrNo() {
        return ContrNo;
    }

    public void setContrNo(String contrNo) {
        ContrNo = contrNo;
    }

    public String getPrjNo() {
        return PrjNo;
    }

    public void setPrjNo(String prjNo) {
        PrjNo = prjNo;
    }

    public String getContrnm() {
        return contrnm;
    }

    public void setContrnm(String contrnm) {
        this.contrnm = contrnm;
    }

    public String getContrst() {
        return contrst;
    }

    public void setContrst(String contrst) {
        this.contrst = contrst;
    }

    public String getSgntrprsnnm() {
        return sgntrprsnnm;
    }

    public void setSgntrprsnnm(String sgntrprsnnm) {
        this.sgntrprsnnm = sgntrprsnnm;
    }

    public String getSgntrprsnidenttpencd() {
        return sgntrprsnidenttpencd;
    }

    public void setSgntrprsnidenttpencd(String sgntrprsnidenttpencd) {
        this.sgntrprsnidenttpencd = sgntrprsnidenttpencd;
    }

    public String getSgntrst() {
        return sgntrst;
    }

    public void setSgntrst(String sgntrst) {
        this.sgntrst = sgntrst;
    }

    public String getSgntrtm() {
        return sgntrtm;
    }

    public void setSgntrtm(String sgntrtm) {
        this.sgntrtm = sgntrtm;
    }

    public String getContractLocalPath() {
        return contractLocalPath;
    }

    public void setContractLocalPath(String contractLocalPath) {
        this.contractLocalPath = contractLocalPath;
    }

    public String getSignPrincipalMchnt() {
        return signPrincipalMchnt;
    }

    public void setSignPrincipalMchnt(String signPrincipalMchnt) {
        this.signPrincipalMchnt = signPrincipalMchnt;
    }

    public String getSignResult() {
        return signResult;
    }

    public void setSignResult(String signResult) {
        this.signResult = signResult;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }
}
