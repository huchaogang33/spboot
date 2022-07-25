package com.newt.boot.service.utils;


import com.newt.boot.common.constants.LogDefine;
import com.newt.boot.common.enums.ErrorCodeEnum;
import com.newt.boot.common.enums.MsgScenceIdEnum;
import com.newt.boot.common.request.BaseRequest;
import com.newt.boot.common.response.BaseResponse;
import com.newt.boot.common.response.BaseResponseBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/****
 * 
 * @author 刘子良
 * @desc 短信发送策略 
 * @date 2021-12-20 11:08

	#短信策略配置
	#【短信策略】每个手机号请求短信时间间隔为"60秒"
	sms.policy.SMS_TIME_SPACING = 60
	#【短信策略】每个手机号每天最多只能发20条短信
	sms.policy.SMS_COUNT_PER_MOBILE = 20
 */
@Component
public class SmsPolicyService {
	
	private static final Logger logger = LoggerFactory.getLogger(LogDefine.SERVICE_DETAIL);

	private static final String MOBILE_PROFIX = "SMS_MOBILE_";//短信手机号缓存类型
	private static final String SMSTIME = "SMSTIME_";//短信手机号缓存有效时长
	
	
	@Value("${sms.policy.SMS_TIME_SPACING}")
	private String SMS_TIME_SPACING;//【短信策略】每个手机号请求短信时间间隔为"60秒"
	
	@Value("${sms.policy.SMS_COUNT_PER_MOBILE}")
	private String SMS_COUNT_PER_MOBILE;//【短信策略】每个手机号每天最多只能发20条短信
	
	@Autowired
	private RedissonLockUtil redisson;

	@Value("${receipt.machs.redis.root}")
	private String redisRoot;
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	/**
	 * 短信发送策略
	 * @param request
	 * @return
	 */
	public BaseResponse policy(String mobile, String scensType, BaseRequest request, String changePhone) {
		BaseResponse rest = BaseResponseBuilder.success(request,null);
		
		//================【短信策略】每个手机号每天最多只能发20条短信================//
		if (MsgScenceIdEnum.APP_MCHNT_CHANGE_PHONE.scenceType().equals(scensType)){
			logger.info("换绑手机号");
			mobile=changePhone;
		}
		int SMSMobileCount = Integer.parseInt(SMS_COUNT_PER_MOBILE);
		String mobileCountKey = MOBILE_PROFIX+mobile+scensType;
		int mobileCount = StringUtils.isEmpty(redisson.getValue(this.redisRoot.concat(mobileCountKey))) ? 0 : Integer.parseInt(redisson.getValue(this.redisRoot.concat(mobileCountKey)));
		if(!redisson.exists(this.redisRoot.concat(mobileCountKey))) {//!redisson.exists(mobileCountKey)
			mobileCount = 0;
		}
		if(mobileCount >= SMSMobileCount){
			logger.info("[短信策略]当前手机号:"+mobile+"，今日发送短信次数过多，已超过"+SMSMobileCount+"次");
			return BaseResponseBuilder.fail(request, ErrorCodeEnum.SMS_POLICY_SMSMOBILECOUNT);
		}
		
		//================【短信策略】请求短信时间间隔为“60秒”============//
		String mobileSmsTimeKey = SMSTIME+mobile+scensType;
		Long smsTimeSpacing = Long.parseLong(SMS_TIME_SPACING);//【短信策略】单用户(IP)请求短信时间间隔为“60秒”
		if(!StringUtils.isEmpty(redisson.getValue(this.redisRoot.concat(mobileSmsTimeKey)))){
			logger.info("[短信策略]当前手机号:"+mobile+"，请勿频繁请求，再次获取请间隔"+smsTimeSpacing+"秒");
			return BaseResponseBuilder.fail(request, ErrorCodeEnum.SMS_POLICY_SMS_TIME_SPACING);
		}
		
		//================【短信策略】每个手机号每天最多只能发20条短信====当前为修改缓存中的次数============//

		if(mobileCount == 0){
			mobileCount++;
			redisson.setValue(this.redisRoot.concat(mobileCountKey),mobileCount+"");//1天86400 ,120
			redisson.pexpireAt(this.redisRoot.concat(mobileCountKey),86400);
		}else{
			mobileCount++;
			Long ttl = redisTemplate.getExpire(this.redisRoot.concat(mobileCountKey));
			logger.info("else ->redisson.getExpire(this.redisRoot.concat(mobileCountKey)).intValue():{}",ttl);
			redisson.setValue(this.redisRoot.concat(mobileCountKey),mobileCount+"",ttl.intValue());//redisson.getExpire(this.redisRoot.concat(mobileCountKey)).intValue()
		}

		//================【短信策略】单用户(IP)请求短信时间间隔为“60秒”====当前为修改缓存中的秒数========//
		//设置当前ip再次发送短信时间间隔为60秒
		//redisson.setEx(mobileSmsTimeKey,mobile,smsTimeSpacing, TimeUnit.SECONDS);
		redisson.setValue(this.redisRoot.concat(mobileSmsTimeKey),mobile,smsTimeSpacing.intValue());
		return rest ;
	}
	
}
