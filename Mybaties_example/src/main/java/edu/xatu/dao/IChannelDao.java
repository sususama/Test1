package edu.xatu.dao;

import edu.xatu.Channel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IChannelDao {
    @Insert("insert into t_channel(cid,cname,description) values(#{cid},#{cname},#{description});")
    public void addChannel(Channel channel);
    @Select("select * from t_channel;")
    public List<Channel> findAll();
    @Delete("select * from t_channel where cid=#{id};")
    public void delChannel(int id);
    @Select("select * from t_channel where cid=#{id};")
    public Channel findByCid(int id);
}
