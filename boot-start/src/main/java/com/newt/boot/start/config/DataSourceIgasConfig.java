/*
package com.newt.boot.start.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = DataSourceIgasConfig.PACKAGE, sqlSessionFactoryRef = "igasSqlSessionFactory")
public class DataSourceIgasConfig {

    static final String PACKAGE = "com.newland.receipt.mchs.dal.mapper.igas";
    static final String MAPPER_LOCATION = "classpath*:mapper/igas/*.xml";
    

    @Bean(name = "igasDataSource", initMethod = "init", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.datasource.druid.igas")
    public DataSource igasDataSource(){
    	DruidDataSource ds = DruidDataSourceBuilder.create().build();
        return ds;
    }

    @Bean(name = "igasTransactionManager")
    public DataSourceTransactionManager igasTransactionManager() {
        return new DataSourceTransactionManager(igasDataSource());
    }

    @Bean(name = "igasSqlSessionFactory")
    public SqlSessionFactory igasSqlSessionFactory(@Qualifier("igasDataSource") DataSource igasDataSource)
            throws Exception {
        final MybatisSqlSessionFactoryBean sessionFactory = new MybatisSqlSessionFactoryBean();
        sessionFactory.setDataSource(igasDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(DataSourceIgasConfig.MAPPER_LOCATION));

        return sessionFactory.getObject();
    }
}
*/
