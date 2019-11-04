package edu.xatu.dao;

import edu.xatu.entity.Accout;
import edu.xatu.entity.Channel;

public interface ChannelDao {
    public void addChannel(Channel channel);

    /**
     * 根据帐号名查询帐号
     * @param accountName
     * @return
     */
    public Accout findByAccountName(String accountName);

    /**
     * 修改帐号
     * @param account
     */
    public void updateAccount(Accout account);
}
