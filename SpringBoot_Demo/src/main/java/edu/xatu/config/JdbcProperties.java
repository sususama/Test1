package edu.xatu.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String password;
    private String username;
}
