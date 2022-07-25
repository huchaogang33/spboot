package com.newt.boot.common.response;


import com.newt.boot.common.enums.ErrorCodeEnum;
import com.newt.boot.common.request.BaseRequest;

public class BaseResponseBuilder {

    public static BaseResponse success(BaseRequest request, String data) {
        BaseResponse response = new BaseResponse(request);
        response.setSuccess("Y");
        response.setRespCode(ErrorCodeEnum.SUCCESS.getCode());
        response.setRespMsg(ErrorCodeEnum.SUCCESS.getDesc());
        response.setBusinessInfo(data);
        return response;
    }

    public static BaseResponse fail(BaseRequest request, ErrorCodeEnum errorCodeEnum) {
        BaseResponse response = new BaseResponse(request);
        response.setSuccess("N");
        response.setRespCode(errorCodeEnum.getCode());
        response.setRespMsg(errorCodeEnum.getDesc());
        return response;
    }

    public static BaseResponse failMsg(BaseRequest request,String errCode,String errMsg) {
        BaseResponse response = new BaseResponse(request);
        response.setSuccess("N");
        response.setRespCode(errCode);
        response.setRespMsg(errMsg);
        return response;
    }

    public static BaseResponse build(BaseRequest request, MchsResponse mchsResponse){
        BaseResponse response = new BaseResponse(request);
        response.setSuccess(mchsResponse.isSuccess() ? "Y" : "N");
        response.setRespCode(mchsResponse.getMsgCode());
        response.setRespMsg(mchsResponse.getMsgDesc());
        return response;
    }
    
    public static BaseResponse success(BaseRequest request,ErrorCodeEnum errorCodeEnum,String data) {
        BaseResponse response = new BaseResponse(request);
        response.setSuccess("Y");
        response.setRespCode(errorCodeEnum.getCode());
        response.setRespMsg(errorCodeEnum.getDesc());
        response.setBusinessInfo(data);
        return response;
    }

}

