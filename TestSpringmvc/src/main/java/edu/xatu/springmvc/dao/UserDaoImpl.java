package edu.xatu.springmvc.dao;

import edu.xatu.springmvc.entity.Channel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository//Dao层用它实例化
public class UserDaoImpl implements UserDao{
    @Resource
    private JdbcTemplate jdbcTemplate;


    public void addChannel(Channel c) {
        String sql = "insert into t_channel values(?,?,?)";
        jdbcTemplate.update(sql,c.getCid(),c.getCname(),c.getDescription());
    }
}
