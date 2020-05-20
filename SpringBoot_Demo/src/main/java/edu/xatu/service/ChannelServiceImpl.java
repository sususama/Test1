package edu.xatu.service;

import edu.xatu.dao.ChannelMapper;
import edu.xatu.entity.Channel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Resource
    private ChannelMapper channelMapper;
    @Transactional
    @Override
    public void addChannel(Channel c) {
        channelMapper.insert(c);
    }
}
