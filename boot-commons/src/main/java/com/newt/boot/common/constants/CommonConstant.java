package com.newt.boot.common.constants;

public class CommonConstant {

    public static final String JWT_LOGIN = "login";

    public static final String JWT_DEVICE_ID = "deviceId";

    public static final String DEFAULT_SALT = "666666";

    public static final String X_AUTH_TOKEN = "x-auth-token";

    public static final String X_AUTH_DEVICE = "x-auth-device";

    //app商户签署合同异常标识
    public static final String MCHNT_CONTRACT_ERROR_FLAG = "appConError";

    /**
     * 成功标识
     */
    public final static String BSPS_SUCCESS = "00000000";

    /**
     * 多法人机构下默认机构号
     */
    public static final String DEFAULT_INST_ID = "000";

    //Token的时效参数，为避免缓存相关问题，建议后续改成某一区间的随机数
    public static final int PubKey_Expire_Interval = 5 * 60;
    public static final int Token_Expire_Interval = 24 * 60 * 60;
    public static final int Token_Refresh_Interval = 2 * 60 * 60;
    public static final int Validate_Expire_Interval = 5 * 60;


    /**
     * 短信验证码key前缀
     */
    public static final String SMS_VALIDATE_PREFIX = "smsValidate:";
    /**
     * 资源映射路径 前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    public static final int MAX_CASHIER_NUM = 1000;

    public static final String YES = "Y";    /* 正常/启用/有效 */
    public static final String NO = "N";     /* 异常/停用/无效 */

    //默认值
    public static final String LimitDefultValue = "--";

    /**
     * 图片文件白名单
     */
    public final static String WHITE_IMAGE_SUFFIX = "jpg,jpeg,png,bmp";


    public final static String DEFAULT_USER_ID = "2c91808a7a186455017a18bcd7ff0009";


    /**
     * 内部交易码
     */

    /* 内部交易码-消费退货 */
    public static final String QR_ORDER_REFUND_TXN_NUM ="P04MC004";
    /* 内部交易码-条码消费(被扫) */
    public static final String QR_CONSUME_TXN_NUM ="P01MC006";
    /* 动态二维码*/
    public static final String QR_GEN_CODE_TXN_NUM ="T00MC020";
    /*订单状态查询*/
    public static final String QR_ORDER_STATUS_TXN_NUM ="T00MC008";
    /*退款状态查询*/
    public static final String QR_REFUND_STATUS_TXN_NUM ="T00MC009";
    /*商户聚合码*/
    public static final String QR_CODE_APPLY_TXN_NUM ="T00BM009";
    /*图片文件上传下载*/
    public static  final String QR_IMAGE_FILE_UP_DOWNLOAD="T00BM001";

    //企业开户
    public static  final String CONPANY_TAX_NUM="CA3001";
    //签合同
    public static  final String CONTRACT_TAX_NUM="CA3203";

    //


    //批量服务-退款交易码

    //银联二维码-退货
    public static  final String REFUND_QR_TXN_NUM="P04CS312";
    //银联模式-收单系统-微信退款
    public static  final String REFUND_WECAT_TXN_NUM="P04CS021";
    //银联模式-收单系统-支付宝退款（支付宝条码被扫）
    public static  final String REFUND_ALIPAY_TXN_NUM="P04CS031";
    //P04CS012   银联受理-退货
    public static  final String REFUND_YL_TXN_NUM="P04CS012";

    //消费撤销
    public static final  String CONSUMER_REFUND_TXN_NUM="P03CS012";


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
    
    public final static String TRACE_ID = "traceId";
    
    public final static String DICT_TYPE = "nine_elememt_verify";
    
    public final static String DICT_LABEL = "open_flag";
    
    public final static String DICT_FLAG = "N";

}
