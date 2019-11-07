package edu.xatu.controller;

import edu.xatu.entity.User;
import edu.xatu.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/user")
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("findUserById/{uid}")
    public User findUserById(@PathVariable("uid") Integer uid){
        return userService.findUserById(uid);
    }
}

