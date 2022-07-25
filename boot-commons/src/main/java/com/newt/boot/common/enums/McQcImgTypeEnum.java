package com.newt.boot.common.enums;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Zan YanHai.
 * @CreatedTime: 2021/7/12 10:10
 * @Description: 2021/7/12 10:10
 */
public enum McQcImgTypeEnum {

    RPT_PC("上报图片"),
    DEAL_PC("处理图片"),
    ;

    McQcImgTypeEnum(String msg) {
        this.msg = msg;
    }

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
