package com.newt.boot.common.response;


import com.newt.boot.common.enums.ErrorCodeEnum;

public class MchsResponseBuilder {

    public static MchsResponse success(Object data) {
        return success(ErrorCodeEnum.SUCCESS.getDesc(), data);
    }

    public static MchsResponse success(String msg, Object data) {
        MchsResponse response = new MchsResponse(data);

        response.setSuccess(true);
        response.setMsgCode(ErrorCodeEnum.SUCCESS.getCode());
        response.setMsgDesc(msg);

        return response;
    }

    public static MchsResponse fail(ErrorCodeEnum errorCodeEnum, String errMsg) {
        return fail(errorCodeEnum, errMsg, null);
    }

    public static MchsResponse fail(ErrorCodeEnum errorCodeEnum, String errMsg, Object data) {
        MchsResponse response = new MchsResponse(data);

        response.setSuccess(false);
        response.setMsgCode(errorCodeEnum.getCode());
        response.setMsgDesc(errMsg);

        return response;
    }

    public static MchsResponse fail(String errCode, String errMsg) {
        MchsResponse response = new MchsResponse(null);

        response.setSuccess(false);
        response.setMsgCode(errCode);
        response.setMsgDesc(errMsg);

        return response;
    }
}

