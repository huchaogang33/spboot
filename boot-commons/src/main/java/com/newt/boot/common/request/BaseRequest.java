package com.newt.boot.common.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 请求报文格式
 */
public class BaseRequest implements Serializable {
    private static final long serialVersionUID = 7358301411419537122L;

    /**
     * 版本号
     */
    @NotBlank(message = "版本号version不能为空")
    private String version;

    /**
     * 算法
     */
    @NotBlank(message = "算法signAlgorithm不能为空")
    private String signAlgorithm;

    /**
     * 设备编号
     */
    @NotBlank(message = "设备编号deviceId不能为空")
    private String deviceId;

    /**
     * 终端类型
     */
    @NotBlank(message = "终端类型terminalType不能为空")
    private String terminalType;

    /**
     * 来源方流水号
     */
    @NotBlank(message = "来源方流水号srcSerialNo不能为空")
    private String srcSerialNo;

    /**
     * 时间戳
     */
    @NotNull(message = "时间戳timestamp不能为空")
    private long timestamp;

    /**
     * 安全域
     */
    private String secretKey;

    /**
     * 请求信息签名
     */
    private String signature;

    /**
     * 业务信息
     */
    @NotBlank(message = "业务参数域businessInfo不能为空")
    private String businessInfo;


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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSrcSerialNo() {
        return srcSerialNo;
    }

    public void setSrcSerialNo(String srcSerialNo) {
        this.srcSerialNo = srcSerialNo;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
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
        return "BaseRequest{" +
                "version='" + version + '\'' +
                ", signAlgorithm='" + signAlgorithm + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", terminalType='" + terminalType + '\'' +
                ", srcSerialNo='" + srcSerialNo + '\'' +
                ", timestamp=" + timestamp +
                ", secretKey='" + secretKey + '\'' +
                ", signature='" + signature + '\'' +
                ", businessInfo='" + businessInfo + '\'' +
                '}';
    }
}
