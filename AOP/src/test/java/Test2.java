import edu.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class Test2 {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test1(){
        String sql="insert into t_channel(cid,cname,description)" +
                "value (222,'教育','教育')";
        jdbcTemplate.execute(sql);
    }
    @Test
    public void test2(){
        String sql="insert into t_channel(cid,cname,description)" +
                "value (?,?,?)";
        jdbcTemplate.update(sql,23,"科学","科学");
    }
    @Test
    public void test3(){
        String sql="update t_channel set cname = ? ,description = ? where  cid= ? ";
        jdbcTemplate.update(sql,"农业","农业",222);
    }
    @Test
    public void test4(){
        String sql="delete from t_channel where cid= ? ";
        jdbcTemplate.update(sql,222);
    }
    @Test
    public void test5(){
        String sql="select * from t_channel";
       List<Channel> list= jdbcTemplate.query(sql, new RowMapper<Channel>() {
            @Override
            public Channel mapRow(ResultSet resultSet, int i) throws SQLException {
                Channel c=new Channel();
                c.setCid(resultSet.getInt("cid"));
                c.setCname(resultSet.getString("cname"));
                c.setDescription(resultSet.getString("description"));
                return c;
            }
        });
        System.out.println(list);
    }
}
