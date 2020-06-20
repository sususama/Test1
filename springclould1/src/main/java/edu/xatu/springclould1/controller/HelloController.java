package edu.xatu.springclould1.controller;

import edu.xatu.springclould1.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("findUser")
    public User findUser(){
        User u= new User();
        u.setId(111);
        u.setPassword("123456");
        u.setUsername("root");
        return u;
    }
}
