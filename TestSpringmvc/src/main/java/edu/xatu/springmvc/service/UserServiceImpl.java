package edu.xatu.springmvc.service;

import edu.xatu.springmvc.dao.UserDao;
import edu.xatu.springmvc.entity.Channel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource//再工厂中拿出他
    private UserDao userDao;
    @Transactional//给下面这个方法事务，比如开启，关闭，回滚等等
    public void addUser(Channel c) {
        userDao.addChannel(c);
    }
}
