package com.newt.boot.common.enums;

/**
 * 界面传入controller操作类型
 * 
 */
public enum PageOptFlagEnum {
	/** 新增 */
	OPT_FLAG_ADD("add","I","新增"),
	/** 修改 */
	OPT_FLAG_UPDATE("upd","U","修改"),
	/** 停用 */
	OPT_FLAG_STOP("stop","D","停用"),
	/** 启用 */
	OPT_FLAG_USE("use","E","启用"),
	/** 注销 */
	OPT_FLAG_CANCEL("cancel","C","注销"),
	/** 查看 */
	OPT_FLAG_VIEW("view","V","查看"),
	/** 查看正式表 */
	OPT_FLAG_VIEWR("viewR","N","查看正式表"),
	/** 上传 */
	OPT_FLAG_UPLOAD("upload","H","导入"),
	/** 商户开通提现 */
	OPT_FLAG_CASH("cash","B","开通提现"),
	/** 删除 */
	OPT_FLAG_DELETE("del","L","删除"),
	/** 审核 */
	OPT_FLAG_CHECK("chk","A","审核"),
    /** 审核详情 */
    OPT_FLAG_CHECK_VIEW("chkView","CV","审核详情"),

	/** 审核通过 */
	OPT_FLAG_PASS("pass","P","01","审核通过"),
	/** 审核退回 */
	OPT_FLAG_REJECT("back","R","02","审核退回")
    ;

	private String type;
	/**此字段与临时表biz_opr以及BizOprEnum对应*/
	private String bizOpr;
	/**此字段与管理接口中checkstatus对应*/
	private String bompCheckStatus;
    private String desc;

    PageOptFlagEnum(String type, String bizOpr, String desc) {
        this.type = type;
		this.bizOpr = bizOpr;
        this.desc = desc;
    }

	PageOptFlagEnum(String type, String bizOpr, String bompCheckStatus, String desc) {
		this.type = type;
		this.bizOpr = bizOpr;
		this.bompCheckStatus = bompCheckStatus;
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

	public String getBizOpr() {
		return bizOpr;
	}

	public void setBizOpr(String bizOpr) {
		this.bizOpr = bizOpr;
	}

	public String getBompCheckStatus() {
		return bompCheckStatus;
	}

	public void setBompCheckStatus(String bompCheckStatus) {
		this.bompCheckStatus = bompCheckStatus;
	}
}
