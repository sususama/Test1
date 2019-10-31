package edu.xatu.service;

import edu.xatu.dao.ChannelDao;
import edu.xatu.entity.Accout;
import edu.xatu.entity.Channel;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Service("channelSercice")
public class ChannelServiceImpl implements ChannelService {
    @Resource
    private DataSource dataSource;

    @Resource
    private ChannelDao channelDao;
    public void addChannel(Channel channel) {
        channelDao.addChannel(channel);
    }

    public void zhuangZhang() {
        //默认的事务定义
        TransactionDefinition definition = new DefaultTransactionDefinition();
        //实例化事务管理器
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);


        String account1 = "张三";
        String account2 = "李四";

        Accout a1 = channelDao.findByAccountName(account1);

        Accout a2 = channelDao.findByAccountName(account2);

        //转帐
        a1.setMoney(a1.getMoney() - 1000);//张三帐号的存款减1000
        a2.setMoney(a2.getMoney() + 1000);//李四帐号的存款加1000
        //开启事务,开启事务时，要指定事务的定义
        TransactionStatus transactionStatus = null;

        try {
            transactionStatus = transactionManager.getTransaction(definition);
            //转帐实际是两个更新操作
            channelDao.updateAccount(a1);//更新张三的帐户
//            if(1==1){
//                throw new RuntimeException("异常！");
//            }
            channelDao.updateAccount(a2);//更新李四的帐户
            //提交
            transactionManager.commit(transactionStatus);
        } catch (RuntimeException e) {
            e.printStackTrace();
            transactionManager.rollback(transactionStatus);
        }
    }

    public void 购买设备(){
        TransactionDefinition definition = new DefaultTransactionDefinition();
        //实例化事务管理器
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);

    }
}
