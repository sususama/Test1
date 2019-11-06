package deu.xatu.feign;

import deu.xatu.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFeignFallback implements UserServiceFeign {
    @Override
    public User findUserById(Integer uid) {
        User u=new User();
        u.setUsername("对不起，访问太忙！请稍后再试...");
        return u;
    }
}
