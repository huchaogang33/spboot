package com.newt.boot.common.utils;

import java.util.HashMap;
import java.util.Map;

public class BusinessContainer {

    public final static String KEY_USER_INFO = "CommonGlobalData";

    /**
     * 业务类型 - 银联线下业务
     */
    public final static String BUSI_CD_01 = "01";
    /**
     * 业务类型 - 微信业务
     */
    public final static String BUSI_CD_02 = "02";
    /**
     * 业务类型 - 支付宝业务
     */
    public final static String BUSI_CD_03 = "03";
    /**
     * 业务类型 - 分期业务
     */
    public final static String BUSI_CD_04 = "04";
    /**
     * 业务类型 - 积分业务
     */
    public final static String BUSI_CD_05 = "05";
    /**
     * 业务类型 - 银联小微业务
     */
    public final static String BUSI_CD_06 = "06";
    /**
     * 业务类型 - 网联业务
     */
    public final static String BUSI_CD_07 = "07";
    /**
     * 业务类型 - 银联特色-助农业务
     */
    public final static String BUSI_CD_11 = "11";
    /**
     * 业务类型 - 银联线上业务
     */
    public final static String BUSI_CD_21 = "21";
    /**
     * 业务类型 - 银联二维码业务
     */
    public final static String BUSI_CD_31 = "31";

    /**
     * 界面发起的操作类型-新增
     */
    public final static String Page_OptFlag_Add = "add";
    /**
     * 界面发起的操作类型-修改
     */
    public final static String Page_OptFlag_Update = "upd";
    /**
     * 界面发起的操作类型-注销
     */
    public final static String Page_OptFlag_Cancel = "cancel";
    /**
     * 界面发起的操作类型-查看详情
     */
    public final static String Page_OptFlag_View = "view";
    /**
     * 界面发起的操作类型-删除
     */
    public final static String Page_OptFlag_Delete = "del";

    /**
     * 助农业务mcc
     */
    public final static String MCC_6051 = "6051"; //

    /**
     * 数据用途 - 渠道
     */
    public final static String USAGE_TYPE_01 = "01";
    /**
     * 数据用途 - 服务商
     */
    public final static String USAGE_TYPE_02 = "02";
    /**
     * 数据用途 - 运营机构
     */
    public final static String USAGE_TYPE_03 = "03";
    /**
     * 数据用途 - 商户
     */
    public final static String USAGE_TYPE_04 = "04";
    /**
     * 数据用途 - 代理商
     */
    public final static String USAGE_TYPE_05 = "05";
    /**
     * 数据用途 - 终端
     */
    public final static String USAGE_TYPE_06 = "06"; //
    /**
     * 异常标识
     */
    public final static String ERROR = "ERROR";
    /**
     * 成功标识
     */
    public final static String SUCCESS = "00";
    /**
     * 成功标识
     */
    public final static String BSPS_SUCCESS = "00000000";
    public final static String BSPS_SUCCESS_INTER = "000000";
    public final static String AJAX_SUCCESS = "200";
    public final static String AJAX_ERROR = "500";
    /**
     * 核心返回-验证结果正常标识
     */
    public final static String AUTH_RESULT = "Y";
    /**
     * 核心返回-账户状态可用标识
     */
    public final static String AUTH_STATUS_NOMAL = "S";
    /**
     * 自动生成一级代码
     */
    public final static String COMM_PARAM_CODE = "COMM_PARAM_CODE";
    /**
     * 数据字典POSP参数一级key
     */
    public final static String dataDict_POSP_KEY = "POSP";
    /**
     * 数据字典SWTS参数一级key
     */
    public final static String dataDict_SWTS_KEY = "SWTS";
    /**
     * 数据字典TPPS参数一级key
     */
    public final static String dataDict_TPPS_KEY = "TPPS";
    /**
     * 数据字典TPPS参数一级key
     */
    public final static String dataDict_USERLIMITTYPE_KEY = "USER_LIMIT_TYPE";

    /**
     * 数据字典ChannelId参数一级KEY
     */
    public final static String dataDict_ChannelId_KEY = "ChannelId";
    /**
     * 数据字典ChannelId参数默认值
     */
    public final static String dataDict_ChannelId_DFT = "20";

    /**
     * 终端品牌编号前缀
     */
    public final static String BrandCd_PREFIX = "BR";
    /**
     * 终端型号编号前缀
     */
    public final static String ModelCd_PREFIX = "MD";
    /**
     * 机具编号前缀
     */
    public final static String MachiCd_PREFIX = "TM";
    /**
     * 设备编号前缀
     */
    public final static String DeviceNo_PREFIX = "DE";
    /**
     * 工单编号前缀
     */
    public final static String WorkSheet_PREFIX = "WS";
    /**
     * 商圈编号前缀
     */
    public final static String CircleCd_PREFIX = "CI";
    /**
     * 行业编码前缀
     */
    public final static String IndusCd_PREFIX = "IN";
    /**
     * 巡检任务前缀
     */
    public final static String InspectTask_PREFIX = "XJ";
    /**
     * 终端公司编码前缀
     */
    public final static String CompanyCd_PREFIX = "TMTC";
    /**
     * 终端公司人员编码前缀
     */
    public final static String PersonCd_PREFIX = "TMTS";
    /**
     * 终端公司编码前缀
     */
    public final static String LevelsCd_PREFIX = "TMTL";
    /**
     * 代理商编码前缀
     */
    public final static String AgentCd_PREFIX = "AG";
    /**
     * 服务商商编码前缀
     */
    public final static String WpsmCd_PREFIX = "WP";
    /**
     * 分期产品代码前缀
     */
    public final static String SegPROroNo_PREFIX = "PROI";
    /**
     * 分期产品代码前缀
     */
    public final static String FeeCd_PREFIX = "FEES";
    /**
     * 结算账户代码前缀
     */
    public final static String settleCd_PREFIX = "SA";
    /**
     * 门店信息代码前缀
     */
    public final static String storeCd_PREFIX = "ST";
    /**
     * 手续费优惠规则编码前缀
     */
    public final static String specialFee_PREFIX = "DF";
    /**
     * 网联内部编码前缀
     */
    public final static String NuccInnerCd_PREFIX = "N";
    /**
     * 银联二维码内部编码前缀
     */
    public final static String UpqrInnerCd_PREFIX = "U";
    /**
     * 缩略图文件名前缀
     */
    public final static String Thumbnail_PREFIX = "thumbnail_";
    /**
     * 拓展经理导入批次前缀
     */
    public final static String MANAGER_BATCH = "AGMB";
    /**
     * 平台商户编码前缀
     */
    public final static String PlatMchntNo_PREFIX = "PM";
    /**
     * 商户等级编码前缀
     */
    public final static String MchntLevelInfo_PREFIX = "ML";
    /**
     * 间联终端信息编码前缀
     */
    public final static String TermInfo_PREFIX = "TI";

    /**
     * 数据状态 - 非正式
     */
    public final static String data_sta_00 = "00";
    /**
     * 数据状态 - 正式
     */
    public final static String data_sta_01 = "01";
    /**
     * 数据状态 - 停用
     */
    public final static String data_sta_02 = "02";
    /**
     * 数据状态 - 已注销
     */
    public final static String data_sta_03 = "03";
    /**
     * 审核状态 - 新增-审批流程中
     */
    public final static String check_sta_01 = "01";

    /**
     * 审核状态 - 新增-审批通过
     */
    public final static String check_sta_02 = "02";

    /**
     * 审核状态 - 新增-审批拒绝
     */
    public final static String check_sta_03 = "03";

    /**
     * 审核状态 - 注销-审批流程中
     */
    public final static String check_sta_11 = "11";

    /**
     * 审核状态 - 注销-审批通过
     */
    public final static String check_sta_12 = "12";

    /**
     * 审核状态 - 注销-审批拒绝
     */
    public final static String check_sta_13 = "13";


    /**
     * 审核状态 - 停用-审批流程中
     */
    public final static String check_sta_21 = "21";

    /**
     * 审核状态 - 停用-审批通过
     */
    public final static String check_sta_22 = "22";

    /**
     * 审核状态 - 停用-审批拒绝
     */
    public final static String check_sta_23 = "23";


    /**
     * 审核状态 - 启用-审批流程中
     */
    public final static String check_sta_31 = "31";

    /**
     * 审核状态 - 启用-审批通过
     */
    public final static String check_sta_32 = "32";

    /**
     * 审核状态 - 启用-审批拒绝
     */
    public final static String check_sta_33 = "33";

    /**
     * 审核状态 - 修改-审批流程中
     */
    public final static String check_sta_41 = "41";

    /**
     * 审核状态 - 修改-审批通过
     */
    public final static String check_sta_42 = "42";

    /**
     * 审核状态 - 修改-审批拒绝
     */
    public final static String check_sta_43 = "43";

    /**
     * 支付宝一级编号前缀
     */
    public final static String zhifubao1_PREFIX = "ZF1";
    /**
     * 支付宝二级编号编码前缀
     */
    public final static String zhifubao2_PREFIX = "ZS2";
    /**
     * 微信一级编号前缀
     */
    public final static String weixin1_PREFIX = "WF1";
    /**
     * 微信二级编号编码前缀
     */
    public final static String weixin2_PREFIX = "WS2";

    /**
     * 收单行银联机构代码(3位)
     */
    public final static String mngOrgCode = "551";

    /** 代理机构状态 */
    /**
     * 代理机构状态 00-非正式
     */
    public final static String agentStatus_00 = "00"; // 00-非正式
    /**
     * 代理机构状态 01-正式
     */
    public final static String agentStatus_01 = "01"; // 01-正式
    /**
     * 代理机构状态 02-停用
     */
    public final static String agentStatus_02 = "02"; // 02-停用
    /**
     * 代理机构状态 03-已注销
     */
    public final static String agentStatus_03 = "03"; // 03-已注销

    /**
     * 正常 or 新增未提交审批
     */
    public final static String status_00 = "00"; // 正常 or 新增未提交审批
    /**
     * 审批流程中
     */
    public final static String status_01 = "01"; // 审批流程中
    /**
     * 审批通过
     */
    public final static String status_02 = "02"; // 审批通过
    /**
     * 审批拒绝
     */
    public final static String status_03 = "03"; // 审批拒绝
    /**
     * 注销
     */
    public final static String status_99 = "99"; // 注销
    /**
     * h5商户录入未提交审批
     */
    public final static String status_98 = "98"; // h5商户录入未提交审批

    /**
     * 修改 - 待提交审批
     */
    public final static String status_40 = "40"; // 修改 - 待提交审批
    /**
     * 修改 - 审批流程中
     */
    public final static String status_41 = "41"; // 修改 - 审批流程中
    /**
     * 修改 - 审批通过
     */
    public final static String status_42 = "42"; // 修改 - 审批通过
    /**
     * 修改 - 审批拒绝
     */
    public final static String status_43 = "43"; // 修改 - 审批拒绝

    /**
     * 注销 - 待提交审批
     */
    public final static String status_10 = "10"; // 注销 - 待提交审批
    /**
     * 注销 - 审批流程中
     */
    public final static String status_11 = "11"; // 注销 - 审批流程中
    /**
     * 注销 - 审批通过
     */
    public final static String status_12 = "12"; // 注销 - 审批通过
    /**
     * 注销 - 审批拒绝
     */
    public final static String status_13 = "13"; // 注销 - 审批拒绝

    /**
     * 停用 - 待提交审批
     */
    public final static String status_20 = "20"; // 停用 - 待提交审批
    /**
     * 停用 - 审批流程中
     */
    public final static String status_21 = "21"; // 停用 - 审批流程中
    /**
     * 停用 - 审批通过
     */
    public final static String status_22 = "22"; // 停用 - 审批通过
    /**
     * 停用- 审批拒绝
     */
    public final static String status_23 = "23"; // 停用- 审批拒绝

    /**
     * 启用 - 待提交审批
     */
    public final static String status_30 = "30"; // 启用 - 待提交审批
    /**
     * 启用 - 审批流程中
     */
    public final static String status_31 = "31"; // 启用 - 审批流程中
    /**
     * 启用 - 审批通过
     */
    public final static String status_32 = "32"; // 启用 - 审批通过
    /**
     * 启用- 审批拒绝
     */
    public final static String status_33 = "33"; // 启用- 审批拒绝

    /**
     * 微信进件报备中
     */
    public final static String status_50 = "50"; // 微信进件报备中
    /**
     * 银联线下非标商户报备中
     */
    public final static String status_51 = "51"; // 银联线下非标商户报备中
    /**
     * 微信进件报备失败
     */
    public final static String status_52 = "52"; // 微信进件报备失败
    /**
     * 微信进件及银联线下非标报备中
     */
    public final static String status_53 = "53"; // 微信进件及银联线下非标报备中
    /**
     * 银联线下非标报备失败
     */
    public final static String status_54 = "54"; // 银联线下非标报备失败
    /**
     * 微信进件及银联线下非标报备失败
     */
    public final static String status_55 = "55"; // 微信进件及银联线下非标报备失败
    /**
     * 微信进件报备成功
     */
    public final static String status_56 = "56"; // 微信进件报备成功
    /**
     * 银联线下非标商户报备成功
     */
    public final static String status_57 = "57"; // 银联线下非标商户报备成功
    /**
     * 微信进件及银联线下非标报备成功
     */
    public final static String status_58 = "58"; // 微信进件及银联线下非标报备成功
    /**
     * 微信进件报备成功，银联线下非标报备中
     */
    public final static String status_60 = "60"; // 微信进件报备成功，银联线下非标报备中
    /**
     * 微信进件报备中，银联线下非标报备成功
     */
    public final static String status_61 = "61"; // 微信进件报备中，银联线下非标报备成功
    /**
     * 微信进件报备失败，银联线下非标报备中
     */
    public final static String status_62 = "62"; // 微信进件报备失败，银联线下非标报备中
    /**
     * 微信进件报备中，银联线下非标报备失败
     */
    public final static String status_63 = "63"; // 微信进件报备中，银联线下非标报备失败
    /**
     * 微信进件报备成功，银联线下非标报备失败
     */
    public final static String status_64 = "64"; // 微信进件报备成功，银联线下非标报备失败
    /**
     * 微信进件报备失败，银联线下非标报备成功
     */
    public final static String status_65 = "65"; // 微信进件报备失败，银联线下非标报备成功

    /**
     * 非正式商户
     */
    public final static String impStatus_00 = "00"; // 非正式商户
    /**
     * 正式商户
     */
    public final static String impStatus_01 = "01"; // 正式商户
    /**
     * 停用商户
     */
    public final static String impStatus_02 = "02"; // 停用商户
    /**
     * 已注销商户
     */
    public final static String impStatus_03 = "03"; // 已注销商户
    /**
     * 联网核查存在风险
     */
    public final static String impStatus_04 = "04"; // 联网核查存在风险
    /**
     * 作废可删除
     */
    public final static String impStatus_99 = "99"; // 联网核查异常

    /**
     * 商户费率-本行借记卡
     */
    public final static String manaBtFlag_01 = "01";// 本行借记卡
    /**
     * 商户费率-本行贷记卡
     */
    public final static String manaBtFlag_02 = "02";// 本行贷记卡
    /**
     * 商户费率-他行借记卡
     */
    public final static String manaBtFlag_11 = "11";// 他行借记卡
    /**
     * 商户费率-他行贷记卡
     */
    public final static String manaBtFlag_12 = "12";// 他行贷记卡

    /**
     * 商户卡种交易权限-本行借记卡
     */
    public final static String cardType_01 = "01"; // 本行借记卡
    /**
     * 商户卡种交易权限-本行贷记卡
     */
    public final static String cardType_02 = "02"; // 本行贷记卡
    /**
     * 商户卡种交易权限-他行借记卡
     */
    public final static String cardType_11 = "11"; // 他行借记卡
    /**
     * 商户卡种交易权限-他行贷记卡
     */
    public final static String cardType_12 = "12"; // 他行贷记卡

    /**
     * 结算周期T+0的费率
     */
    public final static String manaBtFlag_10 = "10";// 结算周期T+0的费率
    /**
     * 分期费率
     */
    public final static String manaBtFlag_20 = "20";// 分期费率
    /**
     * 积分费率
     */
    public final static String manaBtFlag_30 = "30";// 积分费率
    /**
     * 移动支付类费率
     */
    public final static String manaBtFlag_40 = "40";// 移动支付类费率
    /**
     * 网联类费率
     */
    public final static String manaBtFlag_70 = "70";// 网联类费率

    /**
     * 终端签到状态
     */
    public final static String termsignsta = "0";

    /**
     * 0 – 统一费率
     */
    public final static String feeType_0 = "0"; // 0 – 统一费率
    /**
     * 1 – MCC（微信时，自动屏蔽）
     */
    public final static String feeType_1 = "1"; // 1 – MCC（微信时，自动屏蔽）
    /**
     * 2 – 特色费率
     */
    public final static String feeType_2 = "2"; // 2 – 特色费率
    /**
     * 3 – 周期
     */
    public final static String feeType_3 = "3"; // 3 – 周期（暂不支持）

    public final static String succeed = "succeed";
    public final static String failed = "failed";

    public final static String mer_return_null = "没有找到商户信息";

    /**
     * 世界末日
     */
    public final static String doomsday = "99991231";

    // -------------------- 修改标示（logle）码值 --------------------
    /**
     * 费率修改标示：0-初始状态
     */
    public final static String logle_00 = "00";
    /**
     * 费率修改标示：1-临时可拆 20170912含义改成不可用
     */
    public final static String logle_01 = "01";
    /**
     * 费率修改标示：2-正式历史
     */
    public final static String logle_02 = "02";
    /**
     * 费率修改标示：3-正式可拆
     */
    public final static String logle_03 = "03";
    /**
     * 费率修改标示：4-停用标记
     */
    public final static String logle_04 = "04";

    /**
     * 商户进件-网联未进件
     */
    public final static String nrzflag_000 = "000"; // 未进件
    /**
     * 商户进件-网联进件商户首次注册,状态正常
     */
    public final static String nrzflag_A00 = "A00"; // 商户首次注册,状态正常
    /**
     * 商户进件-网联进件商户已解约
     */
    public final static String nrzflag_A01 = "A01"; // 商户已解约
    /**
     * 商户进件-网联进件商户重新签约
     */
    public final static String nrzflag_A02 = "A02"; // 商户重新签约
    /**
     * 商户进件-网联进件商户关停
     */
    public final static String nrzflag_M01 = "M01"; // 商户关停
    /**
     * 商户进件-进件成功
     */
    public final static String rzflag_00 = "00"; // 进件成功
    /**
     * 商户进件-进件失败
     */
    public final static String rzflag_01 = "01"; // 进件失败
    /**
     * 商户进件-进件查询
     */
    public final static String rzflag_02 = "02"; // 进件查询

    public final static String MER_FLAG = "01"; // mer_fee无效费率

    /**
     * 请求成功标识
     */
    public final static String PASS = "0";
    /**
     * 请求失败标识
     */
    public final static String FAIL = "1";

    // -------------------- 结算周期（SC：settleCycle）码值 --------------------
    /**
     * 结算周期：00-T+0
     */
    public final static String SC_00 = "00";
    /**
     * 结算周期：01-T+1
     */
    public final static String SC_01 = "01";
    /**
     * 结算周期：0n-T+n（n <= 9）
     */
    public final static String SC_0n = "0n";
    /**
     * 结算周期：11-周结
     */
    public final static String SC_11 = "11";
    /**
     * 结算周期：12-月结
     */
    public final static String SC_12 = "12";
    /**
     * 结算周期：13-季结
     */
    public final static String SC_13 = "13";
    /**
     * 结算周期：14-年结
     */
    public final static String SC_14 = "14";

    // -------------------- 计算周期（FC：fixCycle）码值 --------------------
    /**
     * 计算周期：10-日结
     */
    public final static String FC_10 = "10";
    /**
     * 计算周期：11-周结
     */
    public final static String FC_11 = "11";
    /**
     * 结算周期：12-月结
     */
    public final static String FC_12 = "12";
    /**
     * 结算周期：13-季结
     */
    public final static String FC_13 = "13";

    // -------------------- 优惠方式（PT：preferType）码值 --------------------
    /**
     * 优惠方式：01-按比例
     */
    public final static String PT_01 = "01";
    /**
     * 优惠方式：02-按固定费率
     */
    public final static String PT_02 = "02";
    /**
     * 优惠方式：03-总笔数封顶
     */
    public final static String PT_03 = "03";
    /**
     * 优惠方式：04-按总交易金额封顶
     */
    public final static String PT_04 = "04";
    /**
     * 优惠方式：05-按总手续费封顶
     */
    public final static String PT_05 = "05";

    /**
     * 银联业务
     **/
    public final static String busi_grp_01 = "01"; // 业务分组01
    /**
     * 移动业务-微信、支付宝
     **/
    public final static String busi_grp_02 = "02"; // 业务分组02
    public final static String busi_grp_03 = "03"; // 业务分组03
    public final static String busi_grp_04 = "04"; // 业务分组04
    /**
     * 网联业务
     **/
    public final static String busi_grp_07 = "07"; // 业务分组03

    /**
     * 商户报备类操作标识-入驻
     */
    public final static String MCHNT_REG_OPR = "0";
    /**
     * 商户报备类操作标识-修改
     */
    public final static String MCHNT_UPD_OPR = "1";
    /**
     * 商户报备类操作标识-查询
     */
    public final static String MCHNT_QRY_OPR = "2";

    /**
     * 商户报备-微信商户查询-当前页码
     */
    public final static String WX_MCHNT_QRY_PAGEINDEX = "1";
    /**
     * 商户报备-微信商户查询-页显示记录数
     */
    public final static String WX_MCHNT_QRY_PAGESIZE = "10";

    /**
     * 版本号
     */
    public final static String BSPS_VERSION = "1.0";

    /**
     * 版本号
     */
    public final static String BOMP_VERSION = "1.0.0";

    /**
     * 版本号
     */
    public final static String MOMP_VERSION = "1.0.0";

    /**
     * IGAS-BSPS模块渠道ID
     */
    public final static String BSPS_CHANL_ID = "BSPS";

    /**
     * IGAS-MCMP模块渠道ID
     */
    public final static String MCMP_CHANL_ID = "MCMP";

    /**
     * IGAS-BSPS模块源系统ID
     */
    public final static String BSPS_SRC_SYS_ID = "BSPS";

    /**
     * IGAS-BOMP模块源系统ID
     */
    public final static String MCMP_SRC_SYS_ID = "BOMP";

    /**
     * IGAS源系统ID
     */
    public final static String IGAS_SRC_SYS_ID = "IGAS";

    /**
     * MOMP源系统ID
     */
    public final static String MOMP_SRC_SYS_ID = "MOMP";

    /**
     * IGAS默认业务类型
     */
    public final static String IGAS_DEFAULT_BIZ_TYPE = "00";

    /**
     * MOMP默认业务类型
     */
    public final static String MOMP_DEFAULT_BIZ_TYPE = "00";

    /**
     * AppServer参数列表，一级主键
     */
    public final static String APPSERVER_PRIMARYKEY = "AppServer";

    /**
     * IGAS服务类型主键
     */
    public final static String IGAS_SERVER_TYPE_PRIMARYKEY = "IGAS_SERVER_TYPE";

    /**
     * 二维码物料支持支付方式服务类型主键
     */
    public final static String QRCODE_PAYMETHOD_PRIMARYKEY = "qrcode_paymethod";

    /**
     * 消息推送服务类型主键
     */
    public final static String MESSAGE_PUSH_PARAM = "message_push_param";

    /**
     * 商户二维码中心logo图片服务类型主键
     */
    public final static String LOGO_URL_PATH_PARAM = "LOGO_URL_PATH_PARAM";

    /**
     * 商户二维码模板图片服务类型主键
     */
    public final static String QRCODE_TEMPLATE_PARAM = "QRCODE_TEMPLATE_PARAM";

    /**
     * ecp每页记录数参数名
     */
    public final static String ECP_DEFAULTROWS_PARA_NAME = "rows";
    /**
     * 默认输出记录数
     **/
    public final static String ECP_PAGE_DEFAULTROWS = "15";
    /**
     * 默认输出记录数
     **/
    public final static String ECP_PAGE_MAXROWS = "100";

    /**
     * 是
     */
    public final static String YES = "1";
    /**
     * 否
     */
    public final static String NO = "0";

    /**
     * 直辖市-北京
     */
    public final static String REGION_CODE_BEIJING = "110000";
    /**
     * 直辖市-天津
     */
    public final static String REGION_CODE_TIANJIN = "120000";
    /**
     * 直辖市-上海
     */
    public final static String REGION_CODE_SHANGHAI = "310000";
    /**
     * 直辖市-重庆
     */
    public final static String REGION_CODE_CHONGQING = "500000";
    /**
     * 行政级别-省
     */
    public final static String REGION_LEVEL_PROVINCE = "01";
    /**
     * 行政级别-地市
     */
    public final static String REGION_LEVEL_CITY = "02";
    /**
     * 行政级别-区县
     */
    public final static String REGION_LEVEL_AREA = "03";

    /**
     * 银联
     */
    public final static String MCC_CARD_ORG_FLAG_01 = "01";
    /**
     * 银联二维码
     */
    public final static String MCC_CARD_ORG_FLAG_06 = "06";
    /**
     * 限额管理-参数值分隔符
     */
    public final static String LIMIT_PARAM_VALUE_SPLIT = "|";
    /**
     * 权限-CODE分隔符
     */
    public final static String AUTH_PRIVILEGE_CODE_SPLIT = ":";

    /**
     * 银联二维码管理操作-收款码名称修改
     */
    public final static String UPQRCODE_OPRTYPE_00 = "00";
    /**
     * 银联二维码管理操作-二维码暂停
     */
    public final static String UPQRCODE_OPRTYPE_01 = "01";
    /**
     * 银联二维码管理操作-二维码启用
     */
    public final static String UPQRCODE_OPRTYPE_02 = "02";
    /**
     * 银联二维码管理操作-二维码注销
     */
    public final static String UPQRCODE_OPRTYPE_03 = "03";

    /**
     * h5进件默认经度
     **/
    public final static String DEFAULT_LONGITUDE = "105.57";
    /**
     * h5进件默认纬度
     **/
    public final static String DEFAULT_LATITUDE = "30.52";
    /**
     * 默认银联地区代码-遂宁
     **/
    public final static String DEFAULT_UNION_AREA = "6620";
    /**
     * h5默认入驻网点机构号-成都分行营业部
     **/
    public final static String DEFAULT_ORGCODE = "129530000003";
    /**
     * h5默认微信支付通道-微信2通道
     **/
    public final static String DEFAULT_WXZF_CHANNEL = "WP00000003";
    /**
     * h5默认支付宝支付通道-支付宝2通道
     **/
    public final static String DEFAULT_ALIP_CHANNEL = "2000000002";
    /**
     * 商户用户平台默认绑定设备标识
     **/
    public final static String BIND_DEV_WEB = "WEB";
    /**
     * 当前页-返回所有记录
     **/
    public final static int PAGEINDEX_FOR_ALL = -1;
    /**
     * 页显示记录数-返回所有记录
     **/
    public final static int PAGESIZE_FOR_ALL = -1;
    /**
     * 标准产品初始编码
     **/
    public final static String STANDARD_PROD_INIT_CODE = "SP";
    /**
     * 标准产品-自定义产品编码
     **/
    public final static String CUSTOM_PROD_CODE = "DF";
    /**
     * 标准产品-自定义产品编码
     **/
    public final static String CUSTOM_PROD_NAME = "自定义产品";

    /**
     * 导入导出参数名
     */
    public final static String SYS_IMPORT_EXPORT_PARAM = "SYS_IMPORT_EXPORT_PARAM";
    public final static int MAX_IMPORT_RECORDS = 100;

    /**
     * 商户配置属性
     */
    public final static String MCHNT_BASE_INFO = "MCHNT_BASE_INFO";

    /**
     * 系统参数名-文件物理地址前缀
     */
    public final static String MCMP_FILE_PATH_PREFIX = "MCMP_FILE_PATH_PREFIX";

    /**
     * 系统参数名-一键启停
     */
    public final static String ONE_KEY_START_STOP_PRARM = "ONE_KEY_START_STOP_PRARM";

    /**
     * 系统参数名-交易分组
     */
    public final static String SYS_TXN_GROUP_PARAM = "SYS_TXN_GROUP_PARAM";

    /**
     * 新增商户初始商户号
     */
    public final static String INIT_MCHNT_NO = "0000000000000";

    /**
     * 第三方-微信
     */
    public final static String THIRD_WX = "01";
    /**
     * 第三方-支付宝
     */
    public final static String THIRD_AL = "02";

    /**
     * 图片文件白名单
     */
    public final static String WHITE_IMAGE_SUFFIX = "jpg,jpeg,png,bmp";

    /**
     * 文件白名单
     */
    public final static String WHITE_FILE_SUFFIX ="jpg,jpeg,png,bmp,xls,xlsx,doc,docx,png,pdf";

    /**
     * 拓展经理签约机构类型-银行
     */
    public final static String MANAGER_SIGN_INST_BANK = "BANK";
    /**
     * 拓展经理签约机构类型-代理机构
     */
    public final static String MANAGER_SIGN_INST_AGENT = "AGENT";

    /**
     * 内管调用系统参数查询接口送的paramType
     */
    public final static String MCMP_TO_BOMP_PARAM_TYPE = "MCHNT_SERVICE";

    /*小微商户等级*/
    public final static String XW_MCHNT_LEVEL = "ML866099";
    public final static String XW_MCHNT_LEVEL_OLD = "99";

    /*系统自动生成默认值*/
    public final static String SYSNUMBER = "系统自动生成";

    /**
     * 导出报表查询时的数据格式转换
     **/
    public final static Map gridExportAllFormatMap = new HashMap() {{
        put("/admin/mcps/Txn/sumTxnQueryList", new HashMap() {{
            put("paySucAmt", "money");
            put("refundAmt", "money");
            put("payNetAmt", "money");
            put("payType", new HashMap() {{
                put("ALIP", "支付宝");
                put("WXZF", "微信");
                put("CARDPAY", "银行卡");
                put("CUPSQR", "银联二维码");
                put("NUCCQR", "网联条码");
            }});

        }});
        put("/admin/mcps/Txn/feeStatisticsQueryList", new HashMap() {{
            put("avgFeeRate", "money");
            put("payType", new HashMap() {{
                put("B012", "银联二维码");
                put("B020", "网联支付宝");
                put("B021", "网联微信");
                put("B010", "银联支付宝");
                put("B011", "银联微信");
                put("B001", "本行卡交易");
            }});
        }});
        put("/admin/mcps/Txn/orderTxnQueryList", new HashMap() {{
            put("transAmt", "money");
            put("payType", new HashMap() {{
                put("ALIP", "支付宝");
                put("WXZF", "微信");
                put("CARDPAY", "银行卡");
                put("CUPSQR", "银联二维码");
                put("NUCCQR", "网联条码");
            }});
            put("txnStatus", new HashMap() {{
                put("0", "请求中");
                put("1", "成功");
                put("2", "本系统拒绝");
                put("3", "超时/未知");
                put("4", "后端系统拒绝");
            }});
        }});
        put("/admin/mcps/Txn/orderNumQueryList", new HashMap() {{
            put("transAmt", "money");
            put("payType", new HashMap() {{
                put("ALIP", "支付宝");
                put("WXZF", "微信");
                put("CARDPAY", "银行卡");
                put("CUPSQR", "银联二维码");
                put("NUCCQR", "网联条码");
            }});
            put("txnStatus", new HashMap() {{
                put("0", "请求中");
                put("1", "成功");
                put("2", "本系统拒绝");
                put("3", "超时/未知");
                put("4", "后端系统拒绝");
            }});
        }});
        put("/admin/mcps/Txn/merClearRstlStatQueryList", new HashMap() {{
            put("settleFlag", new HashMap() {{
                put("I", "初始");
                put("S", "成功");
                put("F", "失败");
            }});
        }});
        put("/admin/mcps/Txn/debitAndCreditDataQueryList", new HashMap() {{
            put("paySucAmt", "money");
            put("debitAmt", "money");
            put("debitAmtRatio", "money");
            put("debitCntRatio", "money");
            put("creditAmt", "money");
            put("creditAmtRatio", "money");
            put("creditCntRatio", "money");
            put("payType", new HashMap() {{
                put("ALIP", "支付宝");
                put("WXZF", "微信");
                put("CARDPAY", "银行卡");
                put("CUPSQR", "银联二维码");
                put("NUCCQR", "网联条码");
            }});
        }});
        put("/admin/mcps/Txn/transDataQueryList", new HashMap() {{
            put("paySucAmt", "money");
            put("refundAmt", "money");
            put("payType", new HashMap() {{
                put("ALIP", "支付宝");
                put("WXZF", "微信");
                put("CARDPAY", "银行卡");
                put("CUPSQR", "银联二维码");
                put("NUCCQR", "网联条码");
            }});
        }});
    }};

    public final static Map pTxnGroupMap = new HashMap() {{
        put("0100", "余额查询");
        put("0101", "银行卡消费类");
        put("0102", "银行卡预授权类");
        put("0103", "电子现金类");
        put("0201", "条码消费类");
        put("0202", "条码预授权");
        put("0301", "分期消费类");
        put("0401", "积分消费类");
        put("0501", "便民缴费类");
        put("0601", "特色业务");
    }};
//   ===============================代理商团队状态 start=================================
    /**
     *  代理商团队状态：正常
     */
    public final static String  AGENT_DEPT_STATUS_OK="0" ;
    /**
     * 代理商团队状态：停用
     */
    public final static String  AGENT_DEPT_STATUS_ISABLE="1" ;
    /**
     *  代理商团队状态：删除
     */
    public final static String  AGENT_DEPT_STATUS_DELETED="2" ;
//   ===============================代理商团队状态 end=================================

//   ===============================代理商机构类型 start=================================

    /**
     * 代理商
     */
    public final static String  AGENT_DEPT_ROLE_TYPE_AGENT="0" ;
    /**
     * 团队
     */
    public final static String  AGENT_DEPT_ROLE_TYPE_TERM="1" ;
//   ===============================代理商机构类型 end=================================

    //   ===============================发送短信场景状态 start=============================
    /**
     * 可用
     */
    public final static String  SEND_MSG_SCENCE_STATUS_Y="Y" ;
    /**
     * 不可用
     */
    public final static String  SEND_MSG_SCENCE_STATUS_N="N" ;
    //   ===============================发送短信场景状态 end=============================


    //   ===============================是否发送短信标志 start=============================
    /**
     * 发送
     */
    public final static String  SMS_FLAG_Y="Y" ;
    /**
     * 不发送
     */
    public final static String  SMS_FLAG_N="N" ;


    //   ===============================是否发送短信标志 end=============================

    // 客户经理默认初始密码
    public static final String DEFAULT_PASS = "11111111";

    // 终端库存 设备购置方式
    public static final String DEVICE_PURCH_TYPE_OWN = "00"; // 自有
    public static final String DEVICE_PURCH_TYPE_RENT = "01"; // 租用
    public static final String DEVICE_PURCH_TYPE_THIRD = "02"; // 第三方所有
}
