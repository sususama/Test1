package deu.xatu.controller;


import deu.xatu.entity.User;
import deu.xatu.feign.UserServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


//@EnableDiscoveryClient
@RestController
public class UserInvokController {
    @Resource
    private UserServiceFeign userServiceFeign;
//    @Resource
//    private RestTemplate restTemplate;
//    @Resource
//    private DiscoveryClient discoveryClient;
    @GetMapping("findUserById/{uid}")
//    @HystrixCommand(fallbackMethod = "findUserById")
    public User findUserById(@PathVariable("uid") Integer uid){
//        List<ServiceInstance> user_service=discoveryClient.getInstances("user_service");
//        ServiceInstance instance = user_service.get(0);
//        String url="http://"+instance.getHost()+":"+instance.getPort()+"/findUserById?uid="+uid;
////        远程请求查询user对象
//        return restTemplate.
//                getForObject
//                        (url, String.class);
        return userServiceFeign.findUserById(uid);
    }
//    public User fall( Integer uid){
//        return "抱歉，服务暂时不可用!";
//    }
}
