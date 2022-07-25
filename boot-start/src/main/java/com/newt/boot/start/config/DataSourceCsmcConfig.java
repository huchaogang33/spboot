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
@MapperScan(basePackages = DataSourceCsmcConfig.PACKAGE, sqlSessionFactoryRef = "csmcSqlSessionFactory")
public class DataSourceCsmcConfig {

    static final String PACKAGE = "com.newland.receipt.mchs.dal.mapper.csmc";
    static final String MAPPER_LOCATION = "classpath*:mapper/csmc/*.xml";

    
    @Bean(name = "csmcDataSource", initMethod = "init", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.datasource.druid.csmc")
    public DataSource csmcDataSource(){
    	DruidDataSource ds = DruidDataSourceBuilder.create().build();
        return ds;
    }

    @Bean(name = "csmcTransactionManager")
    public DataSourceTransactionManager csmcTransactionManager() {
        return new DataSourceTransactionManager(csmcDataSource());
    }

    @Bean(name = "csmcSqlSessionFactory")
    public SqlSessionFactory csmcSqlSessionFactory(@Qualifier("csmcDataSource") DataSource csmcDataSource)
            throws Exception {
        final MybatisSqlSessionFactoryBean sessionFactory = new MybatisSqlSessionFactoryBean();
        sessionFactory.setDataSource(csmcDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(DataSourceCsmcConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
*/
