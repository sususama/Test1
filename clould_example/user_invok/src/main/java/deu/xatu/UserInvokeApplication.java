package deu.xatu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.FeignClient;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker//熔断配置
//下面这个包括上面三个
@SpringCloudApplication
@FeignClient
public class UserInvokeApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserInvokeApplication.class);
    }
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
