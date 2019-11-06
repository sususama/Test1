package deu.xatu.feign;

import deu.xatu.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service",fallback = UserServiceFeignFallback.class)
public interface UserServiceFeign {
    @GetMapping("/user_service/findUserById/{uid}")
    public User findUserById(@PathVariable("uid") Integer uid);
}
