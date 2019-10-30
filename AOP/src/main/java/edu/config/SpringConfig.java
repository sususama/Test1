package edu.config;

import com.alibaba.druid.pool.DruidDataSource;
import edu.xatu.ChannelService;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//@Configuration
//@PropertySource("classpath*:jdbcConfig.properties")
@ComponentScan(basePackages = {"edu.xatu"})
@EnableAspectJAutoProxy
@Import(OtherConfig.class)
public class SpringConfig {

}
