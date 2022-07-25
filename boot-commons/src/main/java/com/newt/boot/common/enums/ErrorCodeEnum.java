package com.newt.boot.common.enums;

public enum ErrorCodeEnum {

    //00XXXX 技术错误码
    SUCCESS("000000", "处理成功"),
    SYSTEM_ERROR("000001", "系统错误"),
    SYSTEM_BUSY("000002","系统繁忙"),
    INFO_VERIFY_FAILED("000003", "信息校验未通过"),
    VALIDATE_CODE_INCORRECT("000004", "验证码信息不正确"),
    VALIDATE_CODE_EXPIRED("000005", "验证码信息已过期"),
    NOT_AUTHORIZED("000006", "登录过期，请重新登录"),//返回此code  会弹出退出登录按钮
    ACCOUNT_NOT_EXISTED("000007", "账号不存在"),
    ACCOUNT_LOCKED("000008", "账号已被锁定"),
    FILE_UPLOAD_FAILED("000009", "文件上传失败"),
    INFORMATION_EXPIRED("000010", "信息已过期"),
    TOKEN_NOT_EXIT("000011","token不存在"),
    FILE_UPLOAD_FAILED_NULL("000012", "文件上传为空"),
    ACCOUNT_STOP("000013", "账户已停用"),
    USER_STATUS_FAIL("000014", "当前用户状态非法"),
    PARAMS_NOT_REFUND("000015", "缺失参数"),
    USER_NOT_AUTH_LOGIN("000016","当前用户无权登录"),
    //短信策略响应码
    //SMS_POLICY_SUCCESS("000000", "短信策略通过"),
    SMS_POLICY_SMSMOBILECOUNT("000017", "当前手机号今日发送短信次数过多!"),
    SMS_POLICY_SMS_TIME_SPACING("000018", "请勿频繁请求，再次获取请间隔60秒!"),
    INSERT_USER_ERROR("000019","新增用户失败"),
    DEL_USER_ERROR("000020","删除用户失败"),
    UPD_USER_ERROR("000021","修改用户失败"),
    FLLOW_LIMIT_ERROR("000022","当前服务使用人数较多，系统繁忙，请稍后刷新重试！"),
    RESP_NINE_VERIFY("000023","九要素信息校验未通过"),
    //10XXXX 业务错误码
    USER_NOT_FOUND("101001", "收银员信息不存在"),
    CASHIER_NOT_FOUND("101002", "收银员信息不存在"),
    CASHIER_MERCHANT_NOT_MATCHED("100103", "收银员信息与商户不匹配"),
    CASHIER_IS_TOO_MANY("100104", "当前收银员数量已达最大值"),
    OLD_TX_PASSWORD_INCORRECT("101005", "旧交易密码不正确"),
    VALIDATE_PWD_ERROR("101006", "密码错误"),
    PHONE_NOT_FUND("101007","手机号为空"),
    PHONE_CODE_NOT_FUND("101008","手机号验证码为空"),
    PHONE_CODE_EXIT("101009","手机号已存在"),
    PHONE_NUM_NOT_EXIT("101010","手机号不存在"),
    PHONE_UPD_ERROR("101011","修改手机号失败"),

    FAULT_NOT_FOUND("102001", "故障信息不存在"),

    TERMINAL_NOT_FOUND("103001", "终端信息不存在"),
    DEVICE_NOT_FOUND("103002", "设备信息不存在"),
    DEVICE_STATUS_EXCEPTION("103003", "设备已绑定"),
    QRCODE_APPLY_FAILED("103004", "申请二维码异常"),
    TERMINAL_STATUS_ERR("103005", "终端状态异常"),
    DEVICE_STATUS_ERR("103006", "设备状态异常"),
    DEVICE_ACTION_ERROR("103007","设备出入库信息不存在"),
    DEVICE_ACTION_STATUS_ERROR("103008","当前设备未出库，无法激活，请联系业务人员！"),
    DEVICE_NOT_SUBMIT("103009","当前设备已注销,不能故障上报!"),
    DEVICE_IN_BIND("103010","当前设备已被绑定，请勿重复操作！"),
    MERCHANT_NOT_FOUND("104001", "商户信息不存在"),
    MERCHANT_NOT_NORMAL("104002", "商户状态不满足手机号变更的条件"),
    MERCHANT_SIGN_INFO_NOT_FUND("104003","商户法人信息不存在"),
    REMOVE_QRCODE_OWNER_ERROR("104004","当前二维码不可解绑！"),
    MCHNT_ACCT_NOT_FUND("104005","商户结算账号信息不存在"),
    MCHNT_CURR_SECTION_NOT_FUND("104006","区间数据不存在"),
    MCHNT_PRI_LIMIT_ERROR("104007","预测限额异常"),
    MCHNT_SELECT_SURPLUS_ERROR("104008","查询商户余额失败"),

    ORDER_NOT_FOUND("105001", "订单信息不存在"),
    ORDER_EXPIRE_TIME("105002", "订单已失效"),
    ORDER_USE_PAYING("105003","用户支付中..."),
    ORDER_FAIL_REREQUEST("105004","交易失败,请重试"),
    ORDER_SUCESS("000000","交易成功"),
    ORDER_NOT_MATCH("105005", "订单信息访问异常"),
    ORDER_NOT_OPEN_CODE("105006","当前功能改造中，请使用其他方式发起交易!"),

    REPAY_ERROR("106001","退款失败"),
    SCAN_QECODE_ERROR("106002","被扫失败"),
    GEN_CODE_ERROR("106003","生成二维码失败"),
    ORDER_STATUS_ERROR("106004","查询订单状态失败"),
    IMAGE_SIZE_ERROR("107001","图片大小超出限制5M请重新提交"),
    
    CONTRACT_SIGN_FAIL("108001","合同签署失败"),
    CONTRACT_SIGN_SUCCESS("00000000","合同签署成功!"),
    CONTRACT_UPLOAD_FAIL("108002","合同上传银行安心签前置失败"),
    CONTRACT_DOWNLOAD_SUCCESS("00000000","合同下载成功!"),
    CONTRACT_DOWNLOAD_FAIL("108003","合同下载失败!"),
    CONTRACT_SAVE_FAIL("108004","合同保存失败!"),
    PERSON_OPENACCOUNT_FAIL("108005","个人开户失败!"),
    ENT_OPENACCOUNT_FAIL("108006","企业开户失败!"),
    CONTRACT_GEN_FAIL("108007","合同生成失败!"),
    CONTRACT_ARGS_LACK("108008","合同数据缺失,请检查!"),
    CONTRACT_AXQ_DOWNLOAD_FAIL("108009","合同下载到行方安心签前置失败!"),
    CONTRACT_AXQ_DOWNLOAD_SUCCESS("108010","合同下载到行方安心签前置成功!"),
    CONTRACT_REDIS_VALUE_ERROR("108011","进件材料已更新，请重新进入查看最新合同后签约！"),
    INCOM_APPLY_RESULT_ERROR("108012","正式提交进件失败！"),
    INCOM_APPLY_BIND_CARD_ERROR("108013","进件材料更新中，您可停留在当前页稍后重试！如有疑问，可咨询客户经理！"),
    INCOM_NO_CARD_AND_SIGN_ERROR("108014","进件材料更新中，请咨询客户经理后重试！"),
    INCOM_NO_LOGIN_OUT("108015","进件材料已更新，请重新登陆后重试！" +
            "如有疑问可联系客户经理"),
    INCOM_BIND_CARD_ERROR("108016","当前商户信息正在更新中，如有疑问请咨询客户经理后重试！"),
    INCOM_CANCEL_MCHNT_INFO("108017","当前商户信息已失效，若有疑问请咨询客户经理"),


    BIND_CARD_FAIL("109001","绑卡失败"),
    OCR_CALL_FAIL("109002","ocr识别异常"),
    NOT_BIND_CARD_EQAL("109003","收支两线不能是同一张卡"),
    PUBLIC_CARD_ER("109004","对公户商户名与开户名不一致"),
    PUBLIC_CARD_MUST("109005","企业或党政机关、事业单位及其他社会团体仅支持对公账户"),
    ACCTTYPE_PRIVATE_IS_MUST("109006","对私账户法人名称与结算账户名需一致"),
    PRIVATE_ACCT_MUST("109007","请选择对私账户"),
    SETTLE_ACC_NOT_EXIT("109008","结算账户卡号不存在"),
    CURRENT_IN_AUDIT_NOT_MODIFY("109009","您已有信息修改正在审核中,暂不支持修改"),
    FAULT_ADD_ERR("110001","上报异常"),//故障上报异常
    BIND_CARD_NOT_IN_SELF("110002","请绑定法人名下或商户主体的账户！"),

    CHECK_MCHNT_ERROR("120001","初始核查任务异常"),
    //外部服务响应码
    RESP_CODE_SUCCESS("00000000","交易成功"),
    RESP_CPDE_TIME_OUT("98","超时"),
    RESP_TRANS_PAYING("ER12MC2T","用户支付中，请确认支付结果"),
    RESP_ORDER_TRANS_PAYING("ER12MC0E","订单处理中"),
    RESP_ORDER_NOT_PAYING("ER12MC2Z","客户未扫码"),


    ;

    private String code;
    private String desc;

    ErrorCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ErrorCodeEnum getEnumByCode(String code){
        for(ErrorCodeEnum enums : ErrorCodeEnum.values()){
            if(enums.getCode().equals(code)){
                return enums;
            }
        }
        return SUCCESS;
    }
}
