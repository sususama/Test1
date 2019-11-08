package edu.xatu.service;

import edu.xatu.dao.UserDao;
import edu.xatu.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User findUserById(int id){
        return userDao.selectByPrimaryKey(id);
    }
}
