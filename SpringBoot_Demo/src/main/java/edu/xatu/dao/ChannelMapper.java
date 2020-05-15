package edu.xatu.dao;

import edu.xatu.entity.Channel;
import tk.mybatis.mapper.common.Mapper;

//@Repository  //将其实例化
public interface ChannelMapper extends Mapper<Channel> {
//    @Insert("inset into t_channel(cid,cname,description) value (#{cid},#{cname},#{description}) ")
//    public void addChannel(Channel c);
}
