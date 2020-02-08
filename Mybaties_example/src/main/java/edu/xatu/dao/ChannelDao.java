package edu.xatu.dao;

import edu.xatu.Channel;

import java.util.List;

public interface ChannelDao {
    public void addChannel(Channel channel);
    public List<Channel> findAll();
    public void delChannel(int id);
    public Channel findByCid(int id);
}
