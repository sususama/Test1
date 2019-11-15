package edu.xatu;

import lombok.Data;

@Data
public class UserDao {
    private String url;
    private String driverClass;
    private String username;
    private String password;
    public User findUser(){
//        User u = new User(1000,"张三",22,"男");
        User u=null;
        return u;
    }
}
