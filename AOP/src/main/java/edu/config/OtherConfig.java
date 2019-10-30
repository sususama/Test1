package edu.config;

import com.alibaba.druid.pool.DruidDataSource;
import edu.xatu.ChannelService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
//@Configuration
@PropertySource("classpath:jdbcConfig.properties")
public class OtherConfig {
    @Value("${jdbc.driverClass}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Bean("channelService")
    public ChannelService createChannelService(DataSource dataSource){

        ChannelService cs = new ChannelService();
        cs.setDataSource(dataSource);
        return cs;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean("dataSource")
    @Scope("prototype")
    public DruidDataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl(url);
        ds.setDriverClassName(driverClass);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
