package com.newt.boot.common.enums;

/**
 * Created with IntelliJ IDEA.
 *           if("BANK".equals(m.getSignInstType())){
 *                Organization organization = organizationsService.getOrgByCode(m.getSignInstId(),instId);
 *                if(Common.isNotBlank(organization)){
 *                    m.setRemark1(organization.getOrgName());
 *                }
 *            }else if("AGENT".equals(m.getSignInstType())){
 *                AgentInfo agentInfo = agentInfoService.findOneByAgentCode(m.getSignInstId(),instId);
 *                if(Common.isNotBlank(agentInfo)){
 *                    m.setRemark1(agentInfo.getAgentName());
 *                }
 *            }
 * @author: Zan YanHai.
 * @CreatedTime: 2021/8/5 17:30
 * @Description: 2021/8/5 17:30
 */
public enum SignInstTypeEnum {

    BANK("BANK","银行"),
    AGENT("AGENT","代理商"),
    ;

    private String type;
    private String desc;

    SignInstTypeEnum(String type, String desc) {
        this.type = type;
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
}
