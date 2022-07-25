package com.newt.boot.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.newt.boot.common.request.BaseRequest;

import java.io.Serializable;


/**
 * 返回通用对象
 */
public class BaseResponse implements Serializable {

    private static final long serialVersionUID = 3749162154569086357L;
    /**
     * 版本号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String version;

    /**
     * 加密算法
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String signAlgorithm;

    /**
     * 来源方流水号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String srcSerialNo;

    /**
     * 状态
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String success;

    /**
     * 返回码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String respCode;

    /**
     * 返回信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String respMsg;

    /**
     * 返回的签名信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String signature;

    /**
     * 业务信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String businessInfo;

    public BaseResponse() {
    }

    public BaseResponse(BaseRequest request) {
        if(null != request){
            this.version = request.getVersion();
            this.signAlgorithm = request.getSignAlgorithm();
            this.srcSerialNo = request.getSrcSerialNo();
        }
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSignAlgorithm() {
        return signAlgorithm;
    }

    public void setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
    }

    public String getSrcSerialNo() {
        return srcSerialNo;
    }

    public void setSrcSerialNo(String srcSerialNo) {
        this.srcSerialNo = srcSerialNo;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "version='" + version + '\'' +
                ", signAlgorithm='" + signAlgorithm + '\'' +
                ", srcSerialNo='" + srcSerialNo + '\'' +
                ", success='" + success + '\'' +
                ", respCode='" + respCode + '\'' +
                ", respMsg='" + respMsg + '\'' +
                ", signature='" + signature + '\'' +
                ", businessInfo='" + businessInfo + '\'' +
                '}';
    }
}