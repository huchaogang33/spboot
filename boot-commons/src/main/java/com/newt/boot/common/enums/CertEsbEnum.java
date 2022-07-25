package com.newt.boot.common.enums;

/**
 * @author Hcg
 * @version 1.0
 * @date 2021/11/9
 * 签署合同行方证件类型 映射
 */
public enum CertEsbEnum {


    /*
     *居民身份证 0* 护照 1* 军人身份证件 2* 工商登记证 3* 税务登记证 4* 股东代码证 5* 社会保障卡 6* 组织机构代码证 7
     * 企业营业执照 8* 法人代码证 9* 武装警察身份证件 A* 港澳居民往来内地通行证 B* 台湾居民来往大陆通行证 C* 户口簿 E
     * 临时居民身份证 F* 警察(警官)证 G* 事业单位法人证书 H* 社会团体登记证书 J* 民办非企业登记证书 K* 外国(地区)企业常驻代表机构登记证 L
     * 政府批文 M* 企业统一社会信用代码 N* 外国居民永久居住证 P* 其他 Z；* 不传时默认为身份证
     **/
/**
 *     BUSINESS_LICENCE_IMAGE("00","营业执照","20500"),
 *     LOAN_CARDNO("11","贷款卡号","24200"),
 *     ORG_CODE("01","机构信用代码证","24800"),
 *     NON_ENTERPRICE("02","民办非企业登记证书","23300"),
 *     ALL_COUNTRAY_ORG_CODE("03","全国组织机构代码证","20600"),
 *     LEGAL_PERSION_CERT("04","事业单位法人证书","22600"),
 *     ABROAD_CONTRACT_CERT("05","境外企业证书","21800"),
 *     TEAM_PERSION_CERT("06","社会团体法人登记证书","23200"),
 *     TRADE_UNION_PERSION_CERT("07","工会法人资格证书","23200"),
 *     GOVERNMENT_APPROVAL("08","政府批文","24100"),
 *     PRE_APPROVAL_CERT("09","预先核准通知书","24300"),
 *     OTHER_APPROVAL_CERT("10","其它批文或证书","24100"),
 *     OTHER("99","其它","99999"),
 */


    BUSINESS_LICENCE_IMAGE("00","营业执照","8","20500"),
    NON_ENTERPRICE("02","民办非企业登记证书","K","23300"),
    ALL_COUNTRAY_ORG_CODE("03","全国组织机构代码证","7","20600"),
    LEGAL_PERSION_CERT("04","事业单位法人证书","H","22600"),
    GOVERNMbindBeforePhoneENT_APPROVAL("08","政府批文","M","24100"),
    TEAM_PERSION_CERT("06","社会团体法人登记证书","J","23200"),
    LOAN_CARDNO("11","贷款卡号","Z","24200"),
    ORG_CODE("01","机构信用代码证","Z","24800"),
    ABROAD_CONTRACT_CERT("05","境外企业证书","Z","21800"),
    TRADE_UNION_PERSION_CERT("07","工会法人资格证书","Z","23200"),
    PRE_APPROVAL_CERT("09","预先核准通知书","Z","24300"),
    OTHER_APPROVAL_CERT("10","其它批文或证书","Z","24100"),
    OTHER("99","其它","Z","99999"),

    ;

    CertEsbEnum(String code, String msg, String bankCode,String bankNum) {
        this.code = code;
        this.msg = msg;
        this.bankCode=bankCode;
        this.bankNum=bankNum;
    }

    private String code;

    //行方映射
    private String bankCode;

    //行方映射
    private String bankNum;


    private String msg;

    public String getBankCode() {
        return bankCode;
    }
    public static CertEsbEnum getCertTypeEnum(String code){
        for(CertEsbEnum certTypeEnum:CertEsbEnum.values()){
            if(certTypeEnum.getCode().equals(code)){
                return certTypeEnum;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }
    public String getBankNum() {
        return bankNum;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
