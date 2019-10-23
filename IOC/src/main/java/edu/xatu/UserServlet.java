package edu.xatu;

import lombok.Setter;

@Setter
public class UserServlet {
    private UserService userService;
    public void findUser(){
        System.out.println("spring工厂的示例");
        System.out.println(userService.findUser());
    }
}
