package edu.xatu;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Setter
@Controller//一般放在web层
public class UserServlet {
//    @Autowired//自动注入
//    @Qualifier("ser")
    @Resource(name="ser")//这个和上面两个效果相同
    private UserService userService;
    public void findUser(){
        System.out.println("spring工厂的示例");
        System.out.println(userService.findUser());
    }
}
