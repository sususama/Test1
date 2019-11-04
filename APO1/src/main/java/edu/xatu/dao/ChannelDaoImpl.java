package edu.xatu.dao;

import edu.xatu.entity.Accout;
import edu.xatu.entity.Channel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ChannelDaoImpl implements ChannelDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    public void addChannel(Channel channel) {
        String sql="insert into t_channel values(?,?,?)";
        jdbcTemplate.update(sql,channel.getCid(),
                channel.getCname(),
                channel.getDescription());
    }

    public Accout findByAccountName(String accountName) {
        String sql = "select * from t_account where accountName = ?";

        return jdbcTemplate.queryForObject(sql, new RowMapper<Accout>() {
            public Accout mapRow(ResultSet resultSet, int i) throws SQLException {
                Accout a = new Accout();
                a.setAccountName(resultSet.getString("accountName"));
                a.setMoney(resultSet.getInt("money"));
                return a;
            }
        },accountName);
    }

    public void updateAccount(Accout account) {
        String sql = "update t_account set money = ? where accountName = ?";
        jdbcTemplate.update(sql,account.getMoney(),account.getAccountName());
    }
}
