package edu.xatu;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Setter
@Service("ser")//放在service层上
public class UserService {
    @Autowired
    private UserDao userDao=null ;

    public User findUser(){
        return userDao.findUser();
    }
}
