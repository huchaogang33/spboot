package com.newt.boot.start.config;


import com.alibaba.druid.filter.config.ConfigTools;
import com.newt.boot.start.properties.RedisConfigProperties;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.ClusterServersConfig;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

/**
 * Redisson配置*/


@Configuration
public class RedissonConfig {

	@Autowired
    private RedisConfigProperties redisConfigProperties;
	
	@Autowired
	private Environment env;

    /**
     * redission   可重入锁
     * @return
     * @throws Exception
     */
	@Bean
    public RedissonClient redissonClient() throws Exception {
        //redisson版本是3.5，集群的ip前面要加上“redis://”，不然会报错，3.2版本可不加
     /*   List<String> clusterNodes = new ArrayList<>();
        for (int i = 0; i < redisConfigProperties.getCluster().getNodes().size(); i++) {
            clusterNodes.add("redis://" + redisConfigProperties.getCluster().getNodes().get(i));
        }*/
        Config config = new Config();
        //添加集群地址
        //ClusterServersConfig clusterServersConfig = config.useClusterServers().addNodeAddress(clusterNodes.toArray(new String[clusterNodes.size()]));
        //设置密码
      //  String publicKey = env.getProperty("spring.redis.config.decrypt.key");
        //解密密码并加到到配置中
      //  String decryptPass = ConfigTools.decrypt(publicKey,redisConfigProperties.getPassword());
      //  clusterServersConfig.setPassword(decryptPass);
        //clusterServersConfig.setTimeout(Integer.valueOf(env.getProperty("spring.redis.timeout")));
        config.useSingleServer().setAddress("redis://192.168.50.191:6379").setPassword(null).setTimeout(6000);
        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }
}
