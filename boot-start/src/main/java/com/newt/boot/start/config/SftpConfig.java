/*
package com.newt.boot.start.config;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// ftp配置
@Configuration
@EnableConfigurationProperties(SftpProperties.class)
public class SftpConfig {

	// 工厂
	@Bean
	public SftpFactory sftpFactory(SftpProperties properties) {
		return new SftpFactory(properties);
	}

	// 连接池
	@Bean
	public SftpPool sftpPool(SftpFactory sftpFactory) {
		return new SftpPool(sftpFactory);
	}

	// 辅助类
	@Primary
	@Bean
	public SFTPTemplate sftpTemplate(SftpPool sftpPool) {
		return new SFTPTemplate(sftpPool);
	}
}*/
