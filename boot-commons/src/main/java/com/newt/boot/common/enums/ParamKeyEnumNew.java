package com.newt.boot.common.enums;

/***
 * 
 * @author 新大陆
 * @desc 描述：接口间Map参数参加Key枚举
 */
public enum ParamKeyEnumNew implements BaseEnum {
	
    /**合同信息相关*/
	signOrgName("甲方(收单机构)"),
	mchntName("乙方(特约商户)"),
	foreignManageName("商户对外经营名称/门店名称"),
	mchntFullName("商户全称"),
	mchntNo("商户编号"),
	mchntType("商户类型"),
	idenType("证件类型"),
	idenNo("证件号码"),
	mchntRegAddress("商户注册地址"),
	shopAddress("商户经营地址/门店地址"),
	mcc("商户类别码(MCC)"),
	legalMan("法定代表人/负责人姓名"),
	legalIdenType("法定代表人/负责人证件类型"),
	legalIdenNo("法定代表人/负责人证件号码"),
	mchntLinkMan("商户联系人姓名"),
	mchntLinkEmail("商户预留email邮箱"),
	mchntTel("商户预留固定电话"),
	mchntPhone("商户预留手机号码"),
	mchntSettleModel("商户结算模式"),
	settleAccountNo("收单结算账户账号"),
	settleAccountNm("收单结算账户户名"),
	chargeAccountNo("商户手续费结算账户账号"),
	chargeAccountNm("商户手续费结算账户户名"),
	
	
	
	acceptType("受理种类"),
	
	bhjjTradeAmt("本行借记卡交易金额"),
	bhjjHightAmt("本行借记卡(封顶值)"),
	bhCreditCardAmt("本行信用卡交易金额的"),
	
	thjjTradeAmt("他行借记卡交易金额"),
	thjjHightAmt("他行借记卡(封顶值)"),
	thCreditCardAmt("他行信用卡交易金额"),
	
	webchartPayAmt("微信支付∶按交易金额"),
	aliPayAmt("支付宝支付∶按交易金额"),
	cloudPayAmt("云闪付支付∶按交易金额"),
	
	otherPayAmt("其他"),
	applyBizType("申请业务类型"),
	
	signature1("收单机构 电子印章(甲方)"),
	signature2("特约商户 电子印章(乙方)"),
	//signature1Date("(甲方)日期"),
	//signature2Date("(乙方)日期"),

	signatureDate("(乙方)日期"),
    ;

    private String desc;

    private ParamKeyEnumNew(String desc) {
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
