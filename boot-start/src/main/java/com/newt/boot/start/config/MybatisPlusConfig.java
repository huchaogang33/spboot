package com.newt.boot.start.config;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
public class MybatisPlusConfig {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Value("${receipt.machs.redis.root}")
    private String redisRoot;

    @Bean
    public IdentifierGenerator identifierGenerator() {
        return new DefaultIdentifierGenerator(this.stringRedisTemplate.opsForValue().increment(this.redisRoot.concat("workId"), 1L) % 32, 0);
    }

    @Bean
    public GlobalConfig globalConfig() {
        GlobalConfig gc = new GlobalConfig();
        gc.setIdentifierGenerator(identifierGenerator());
        return gc;
    }
}
