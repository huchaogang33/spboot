/*
package com.newt.boot.start.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.io.PrintWriter;

*/
/**
 * sftp连接池自动配置
 *
 * @author 薛凌康
 *//*

@Configuration
@ConditionalOnClass(SftpPool.class)
@EnableConfigurationProperties(SftpClientProperties.class)
public class SftpClientAutoConfiguration {
	
	@Autowired
	private Environment env;
	
	private static final Logger logger = LoggerFactory.getLogger(LogDefine.SERVICE_DETAIL);
    
	@Bean
    @ConditionalOnMissingBean
    public ISftpClient sftpClient(SftpClientProperties sftpClientProperties) {
        if (sftpClientProperties.isMultiple()) {
            MultipleSftpClient multipleSftpClient = new MultipleSftpClient();
            sftpClientProperties.getClients().forEach((name, properties) -> {
                SftpFactory sftpFactory = createSftpFactory(properties);
                SftpPoolConfig sftpPoolConfig = createSftpPoolConfig(properties);
                SftpAbandonedConfig sftpAbandonedConfig = createSftpAbandonedConfig(properties);
                SftpPool sftpPool = new SftpPool(sftpFactory, sftpPoolConfig, sftpAbandonedConfig);
                ISftpClient sftpClient = new SftpClient(sftpPool);
                multipleSftpClient.put(name, sftpClient);
            });
            return multipleSftpClient;
        }
        SftpFactory sftpFactory = createSftpFactory(sftpClientProperties);
        SftpPoolConfig sftpPoolConfig = createSftpPoolConfig(sftpClientProperties);
        SftpAbandonedConfig sftpAbandonedConfig = createSftpAbandonedConfig(sftpClientProperties);
        SftpPool sftpPool = new SftpPool(sftpFactory, sftpPoolConfig, sftpAbandonedConfig);
        return new SftpClient(sftpPool);
    }

    public SftpFactory createSftpFactory(SftpClientProperties properties) {
       */
/* return new SftpFactory.Builder()
                .host(properties.getHost())
                .port(properties.getPort())
                .username(properties.getUsername())
                .password(properties.getPassword())
                .build();*//*

    	String publicKey = env.getProperty("sftp-client.config.decrypt.key");
    	try {
			String decryptPass = ConfigTools.decrypt(publicKey,properties.getPassword());
			SftpFactory sftpFactory = new SftpFactory.Builder().host(properties.getHost()).port(properties.getPort()).username(properties.getUsername()).password(decryptPass).build();
			return sftpFactory ;
		} catch (Exception e) {
			logger.error("com.newland.receipt.mchs.config.SftpClientAutoConfiguration.createSftpFactory初始化失败,请检查!",e);
		}
    	return null ;
    }

    public SftpPoolConfig createSftpPoolConfig(SftpClientProperties properties) {
        SftpClientProperties.Pool pool = properties.getPool();
        return new SftpPoolConfig.Builder()
                .maxTotal(pool.getMaxTotal())
                .maxIdle(pool.getMaxIdle())
                .minIdle(pool.getMinIdle())
                .lifo(pool.isLifo())
                .fairness(pool.isFairness())
                .maxWaitMillis(pool.getMaxWaitMillis())
                .minEvictableIdleTimeMillis(pool.getMinEvictableIdleTimeMillis())
                .evictorShutdownTimeoutMillis(pool.getEvictorShutdownTimeoutMillis())
                .softMinEvictableIdleTimeMillis(pool.getSoftMinEvictableIdleTimeMillis())
                .numTestsPerEvictionRun(pool.getNumTestsPerEvictionRun())
                .evictionPolicy(null)
                .evictionPolicyClassName(DefaultEvictionPolicy.class.getName())
                .testOnCreate(pool.isTestOnCreate())
                .testOnBorrow(pool.isTestOnBorrow())
                .testOnReturn(pool.isTestOnReturn())
                .testWhileIdle(pool.isTestWhileIdle())
                .timeBetweenEvictionRunsMillis(pool.getTimeBetweenEvictionRunsMillis())
                .blockWhenExhausted(pool.isBlockWhenExhausted())
                .jmxEnabled(pool.isJmxEnabled())
                .jmxNamePrefix(pool.getJmxNamePrefix())
                .jmxNameBase(pool.getJmxNameBase())
                .build();
    }

    public SftpAbandonedConfig createSftpAbandonedConfig(SftpClientProperties properties) {
        SftpClientProperties.Abandoned abandoned = properties.getAbandoned();
        return new SftpAbandonedConfig.Builder()
                .removeAbandonedOnBorrow(abandoned.isRemoveAbandonedOnBorrow())
                .removeAbandonedOnMaintenance(abandoned.isRemoveAbandonedOnMaintenance())
                .removeAbandonedTimeout(abandoned.getRemoveAbandonedTimeout())
                .logAbandoned(abandoned.isLogAbandoned())
                .requireFullStackTrace(abandoned.isRequireFullStackTrace())
                .logWriter(new PrintWriter(System.out))
                .useUsageTracking(abandoned.isUseUsageTracking())
                .build();
    }
}
*/
