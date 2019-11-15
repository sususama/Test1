package edu.xatu;

import lombok.Setter;

@Setter
public class UserService {
    private UserDao userDao=null ;

    public User findUser(){
        return userDao.findUser();
    }
}
