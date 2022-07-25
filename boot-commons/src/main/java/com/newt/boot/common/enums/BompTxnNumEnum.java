package com.newt.boot.common.enums;

/**
 * bomp 模块交易码
 */
public enum BompTxnNumEnum {
    baseProdInfoListQuery("M00BM001", "基础产品列表查询"),
    prodInfoListQurey("M00BM002", "标准产品列表查询"),
    prodInfoQuery("M00BM003", "产品详细信息查询"),
    mchntInfoListQuery("M00BM004", "商户信息列表查询"),
    mchntBaseInfoQuery("M00BM005", "商户基本信息查询"),
    mchntSignInfoQuery("M00BM006", "商户签约信息查询"),
    mchntSettleInfoQuery("M00BM007", "商户结算信息查询"),
    mchntImageInfoQuery("M00BM008", "商户影像信息查询"),
    mchntProdListQuery("M00BM009", "商户产品列表查询"),
    mchntProdInfoQuery("M00BM010", "商户产品信息查询"),
    mchntBaseInfoManage("M00BM011", "商户基本信息管理"),
    mchntSignInfoManage("M00BM012", "商户签约信息管理"),
    mchntSettleInfoManage("M00BM013", "商户结算信息管理"),
    mchntImageInfoManage("M00BM014", "商户影像信息管理"),
    mchntProdInfoManage("M00BM015", "商户产品信息管理"),
    imageFileUpDownload("T00BM001", "图片文件上传下载"),
    feeTemplateListQuery("M00BM016", "费率模板列表查询"),
    industryInfoQuery("M00BM017", "行业类别查询"),
    unionAreaInfoQuery("M00BM018", "银联地区代码查询"),
    unionRiskMchntQuery("M00BM019", "银联风险商户查询"),
    instInfoListQuery("M00BM020", "机构列表查询"),
    mchntStatusManage("M00BM021", "商户状态管理"),
    channelInfoListQuery("M00BM022", "支付通道列表查询"),
    agentMchntListQuery("M00BM023", "代理机构列表查询"),
    platMchntListQuery("M00BM024", "平台商户列表查询"),
    groupMchntListQuery("M00BM025", "集团商户列表查询"),
    mchntLevelListQuery("M00BM026", "商户等级列表查询"),
    mchntAreaListQuery("M00BM027", "商圈列表信息查询"),
    managerInfoListQuery("M00BM028", "拓展经理列表查询"),
    regionInfoQuery("M00BM029", "行政区划代码查询"),
    mchntWithdrawManage("M00BM030", "商户提现费率管理"),
    onlineVerification("T00BM002", "联网核查"),
    creditReportQuery("T00BM003", "征信查询"),
    instMchntRegister("T00BM004", "第三方机构商户进件"),
    wechatRealNameApply("T00BM005", "微信商户实名认证申请"),
    wechatRealNameApplyCancel("T00BM006", "微信商户实名认证申请撤销"),
    wechatRealNameAuditQuery("T00BM007", "微信实名认证申请审核结果查询"),
    wechatRiskMchntQuery("T00BM008", "微信风险商户违规查询"),
    mchntQrCodeApply("T00BM009", "生成商户收款聚合码"),
    mchntQrCodeBatchApply("T00BM010", "批量生成商户收款聚合码"),
    mchntQrCodeQuery("T00BM011", "商户收款聚合码查询"),
    mchntQrCodeManage("M00BM031", "商户收款聚合码管理"),
    acctRealNameAuth("T00BM012", "账户实名认证"),
    ocrService("T00BM013", "OCR识别"),
    industryGroupInfoQuery("M00BM032", "行业组别查询"),
    settleAccountSign("T00BM014", "结算账户核心签约"),
    alipayActivityApplyQuery("T00BM015", "支付宝特殊费率申请商户列表查询"),
    alipayActivityApply("T00BM016", "支付宝特殊费率申请"),
    alipayActivityApplyView("T00BM017", "支付宝特殊费率申请查看"),
    instMchntQuery("T00BM018", "第三方机构商户入驻查询"),
    aliPayRiskMchntQueryQuery("T00BM019", "支付宝风险商户违规查询"),
    mchntEntryDispatch("T00BM020", "商户入驻派单通知"),
    mchntBatchImport("M00BM033", "间联商户批量导入接口"),
    mchntBatchExport("M00BM034", "间联商户批量导出数据查询接口"),
    paramQuery("M00BM035", "系统参数查询"),
    mchntD0Query("M00BM036", "商户是否能开通D0及提现查询"),
    manualAdjustment("P01BM001", "手工调账"),
    manualPayment("P01BM002", "手工挂账"),
    mompPayment("P01BM003", "营销打款"),
    mchntInspectNotice("T00BM021", "发送商户巡检通知"),
    mchntInspectTaskListQuery("M00BM037", "商户巡检任务列表查询"),
    needInspectMchntListQuery("M00BM038", "新建商户巡检任务商户列表查询"),
    inspectTaskDetailListQuery("M00BM039", "巡检任务详情列表查询"),
    mchntInspectInfoQuery("M00BM040", "商户巡检信息详情查询"),
    mchntInspectInfoManager("M00BM041", "商户巡检信息管理"),
    mchntInspectListQuery("M00BM042", "商户巡检记录查询"),
    reloadCache("M00BM043", "刷新缓存"),
    mposInstListQuery("M00BM044", "查询母POS机构列表"),
    registerTerm("M00BM045", "注册终端设备"),
    generatorTermValidCode("T00BM022", "生成终端装机验证码"),
    alipayActivityApplyConfirm("T00BM023", "支付宝特殊费率申请确认"),
    subscribeTransMonitorInfo("M00BM046", "交易监控取数"),
    termAndQrcodeNumQuery("M00BM047", "商户终端及二维码数量查询"),
    platMchntWechatInfoQuery("M00BM048", "平台商户微信进件信息查询"),
    keySynchronise("M00BM049", "密钥同步"),
    mchntFeeListQuery("M00BM050", "商户费率列表查询"),
    manualAccoutingStatusQuery("T00BM024", "手工调账或挂账状态查询"),
    batchservice("00960000000000", "商户入账结果明细查询"),
    bankNameCodeQuery("M00BM051", "查询人行行名行号信息");

    private String type;
    private String desc;

    BompTxnNumEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
