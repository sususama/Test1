package edu.xatu.config;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class MainConfig {
//    @Bean
//    public DataSource dataSource(JdbcProperties prop){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(prop.getDriverClassName());
//        dataSource.setUrl(prop.getUrl());
//        dataSource.setUsername(prop.getUsername());
//        dataSource.setPassword(prop.getPassword());
//        return dataSource;
//    }
}
