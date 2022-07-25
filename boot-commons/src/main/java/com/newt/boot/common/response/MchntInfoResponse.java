package com.newt.boot.common.response;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class MchntInfoResponse implements Serializable {
    private static final long serialVersionUID = 3607136198302184472L;

    private MchntBaseInfoDto baseInfo;

    private MchntSignInfoDto signInfo;

    private MchntRefundConfigDto refundConfig;

    private List<MchntImageInfoDto> imageInfoMap;

    private Map<String,List<MchntFeeInfoDto>> feeInfoMap;

    public MchntRefundConfigDto getRefundConfig() {
        return refundConfig;
    }

    public void setRefundConfig(MchntRefundConfigDto refundConfig) {
        this.refundConfig = refundConfig;
    }

    public MchntBaseInfoDto getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(MchntBaseInfoDto baseInfo) {
        this.baseInfo = baseInfo;
    }

    public MchntSignInfoDto getSignInfo() {
        return signInfo;
    }

    public void setSignInfo(MchntSignInfoDto signInfo) {
        this.signInfo = signInfo;
    }

    public List<MchntImageInfoDto> getImageInfoMap() {
        return imageInfoMap;
    }

    public void setImageInfoMap(List<MchntImageInfoDto> imageInfoMap) {
        this.imageInfoMap = imageInfoMap;
    }

    public Map<String, List<MchntFeeInfoDto>> getFeeInfoMap() {
        return feeInfoMap;
    }

    public void setFeeInfoMap(Map<String, List<MchntFeeInfoDto>> feeInfoMap) {
        this.feeInfoMap = feeInfoMap;
    }
}
