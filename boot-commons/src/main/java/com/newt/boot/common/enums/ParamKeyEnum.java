package com.newt.boot.common.enums;

/***
 * 
 * @author 新大陆
 * @desc 描述：接口间Map参数参加Key枚举
 */
public enum ParamKeyEnum implements BaseEnum {
	

    /**合同信息相关*/
	signOrgId("商户所属签约机构"),
	mchntNo("商户号"),
	signOrgName("甲方（收单机构）"),
	mchntName("乙方（特约商户）"),
	protocolNo("协议书编号"),
	bankNameAndAccountNo("商户的开户银行名称及账号"),
	installNum("装机台数"),
	cashPledge("押金"),
	businessLicenseName("特约商户营业执照名称"),
	foreignManageName("特约商户对外经营名称"),
	addressPosCode("特约商户地址及邮政编码"),
	companyRegNoOfNuture("工商注册号及经营性质"),
	busiScopeContent("主营业务内容"),
	mcc("MCC"),
	principal("负责人"),
	job("职务"),
	phone("电话"),
	fax("传真"),
	instLinkMan("装机联系人"),
	instLinkManPhone("装机联系手机"),
	termPhone("受理终端接入电话号码"),
	SpecialMchntCode("特约商户代码"),
	signature1("收单机构签署及公章(甲方)"),
	signature2("特约商户签署及公章(乙方)"),
	signature1Date("收单机构签署及公章(甲方)日期"),
	signature2Date("特约商户签署及公章(乙方)日期"),

    ;

    private String desc;

    private ParamKeyEnum(String desc) {
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
