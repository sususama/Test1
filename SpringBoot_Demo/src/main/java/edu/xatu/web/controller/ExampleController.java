package edu.xatu.web.controller;

import edu.xatu.entity.Channel;
import edu.xatu.entity.User;
import edu.xatu.service.ChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Slf4j
@RestController
@RequestMapping("/aaa")
//@MapperScan("edu.xatu.dao")//生成动态代理
public class ExampleController /*implements WebMvcConfigurer*/ {
//    Logger logger = LoggerFactory.getLogger(ExampleController.class);
    @Resource
    private DataSource dataSource;
    @Resource
    private ChannelService channelService;
    @RequestMapping("/finduser")
    public User findUser(){
        User u=new User();
        u.setCid(111);
        u.setName("zhangsan");
        u.setSex("M");
        log.info("asdasd");
        log.debug("oajhsldkjdlas");
        log.error("XXXXCCCCC");
        return u;
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new Interceptors()).addPathPatterns("/**");
//    }
    @GetMapping("/addChannel")
    public Channel addChannel(Channel c){
        channelService.addChannel(c);
        return c;
    }
}
