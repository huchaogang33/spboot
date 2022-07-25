/*
package com.newt.boot.start.config;

import java.net.InetAddress;
import java.util.Date;
import java.util.List;

import com.newt.boot.common.constants.LogDefine;
import com.newt.boot.common.utils.DateUtils;
import com.newt.boot.service.utils.RedissonLockUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.redisson.api.RLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;


*/
/**
 * @Title:  ProduceRunner.java
 * @Package com.newland.receipt.mchs.config
 * @Description:    定义接口限流令牌生成公用类
 * @author: Qiguowen
 * @date:   2022年4月7日 下午4:34:21
 * @Copyright:
 *//*

@Component
public class ProduceRunner implements ApplicationRunner{
	private static final Logger logger = LoggerFactory.getLogger(LogDefine.SERVICE_DETAIL);

	@Autowired
	private StringRedisTemplate redisTemplate;
	@Autowired
	private ILimitFlowTokenInfoService limitFlowTokenInfoService;

	@Autowired
	private Environment env;
	*/
/**
	 * <p>Title: run</p>
	 * <p>Description: </p>
	 * @param args
	 * @throws Exception
	 * @see org.springframework.boot.ApplicationRunner#run(org.springframework.boot.ApplicationArguments)
	 *//*

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String[] sourceArgs = args.getSourceArgs();
		for (String source : sourceArgs) {
			logger.info(source+"  ");
		}
		//获取启动端口
		addTokenBucket();
	}

	private void addTokenBucket() {
		//设置key 最后把key删除掉 然后redisList是否有值
		//锁不处理完,不让key出来
		RLock lock = RedissonLockUtil.lock("addTokenBucket");
		try {
			LimitFlowTokenInfo limitFlowTokenInfo = new LimitFlowTokenInfo();
			limitFlowTokenInfo.setInitAddFlag("N");
			List<LimitFlowTokenInfo> selectLimitFlowTokenInfoList = limitFlowTokenInfoService
					.selectLimitFlowTokenInfoList(limitFlowTokenInfo);
			ListOperations<String, String> opsForList = redisTemplate.opsForList();
			if (CollectionUtils.isNotEmpty(selectLimitFlowTokenInfoList)) {
				// 循环添加token
				for (LimitFlowTokenInfo limitFlowTokenInfo2 : selectLimitFlowTokenInfoList) {
					String tokenBucketKey = limitFlowTokenInfo2.getTokenBucketKey();
					String tokenBucketSize = limitFlowTokenInfo2.getTokenBucketSize();
					if (StringUtils.isNotEmpty(tokenBucketSize)) {
						Long tokensize = Long.valueOf(tokenBucketSize);
						for (int i = 0; i < tokensize; i++) {
							long currentTimeMillis = System.currentTimeMillis();
							logger.info("添加令牌---线程: " + Thread.currentThread().getName() + ",执行时间:"
									+ currentTimeMillis);
							opsForList.leftPush(tokenBucketKey, DateUtil.parseDateToStr(DateUtils.FULL_SEQ_FORMAT,
									new Date(currentTimeMillis)));
						}
						limitFlowTokenInfo2.setInitAddFlag("Y");
						limitFlowTokenInfoService.updateLimitFlowTokenInfo(limitFlowTokenInfo2);
					}
				}
			}
		}finally{
			lock.unlock();
		}
	}
}
*/
