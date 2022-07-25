package com.newt.boot.common.response;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/9/15
 * ocr 返回相应实体
 */
public class OcrResponseDto {

    //图片路径
    private String path;

    /*银行卡字段*/
    public  String tbankNum;//获取银行卡号
    public  String tbankName;//获取银行卡开户行
    public  String tbankOrgCode;//获取银行机构代码
    public  String tbankClass;//获取卡种
    public  String tbankCardName;//获取卡名

    //身份证
    private String idcName;//姓名
    private String idcSex;//性别
    private String idcFolk;//民族
    private String idcBirthday;//出生日期
    private String idcaddress;//地址
    private String idcNum;//号码
    private String idcIssue;//签发机关
    private String idcPeriod;//有效期限


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTbankNum() {
        return tbankNum;
    }

    public void setTbankNum(String tbankNum) {
        this.tbankNum = tbankNum;
    }

    public String getTbankName() {
        return tbankName;
    }

    public void setTbankName(String tbankName) {
        this.tbankName = tbankName;
    }

    public String getTbankOrgCode() {
        return tbankOrgCode;
    }

    public void setTbankOrgCode(String tbankOrgCode) {
        this.tbankOrgCode = tbankOrgCode;
    }

    public String getTbankClass() {
        return tbankClass;
    }

    public void setTbankClass(String tbankClass) {
        this.tbankClass = tbankClass;
    }

    public String getTbankCardName() {
        return tbankCardName;
    }

    public void setTbankCardName(String tbankCardName) {
        this.tbankCardName = tbankCardName;
    }

    public String getIdcName() {
        return idcName;
    }

    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }

    public String getIdcSex() {
        return idcSex;
    }

    public void setIdcSex(String idcSex) {
        this.idcSex = idcSex;
    }

    public String getIdcFolk() {
        return idcFolk;
    }

    public void setIdcFolk(String idcFolk) {
        this.idcFolk = idcFolk;
    }

    public String getIdcBirthday() {
        return idcBirthday;
    }

    public void setIdcBirthday(String idcBirthday) {
        this.idcBirthday = idcBirthday;
    }

    public String getIdcaddress() {
        return idcaddress;
    }

    public void setIdcaddress(String idcaddress) {
        this.idcaddress = idcaddress;
    }

    public String getIdcNum() {
        return idcNum;
    }

    public void setIdcNum(String idcNum) {
        this.idcNum = idcNum;
    }

    public String getIdcIssue() {
        return idcIssue;
    }

    public void setIdcIssue(String idcIssue) {
        this.idcIssue = idcIssue;
    }

    public String getIdcPeriod() {
        return idcPeriod;
    }

    public void setIdcPeriod(String idcPeriod) {
        this.idcPeriod = idcPeriod;
    }
}
