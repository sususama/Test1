package test.edu.xatu;

import edu.xatu.Article;
import edu.xatu.Channel;
import edu.xatu.User;
import edu.xatu.dao.ArticleDao;
import edu.xatu.dao.ChannelDao;
import edu.xatu.dao.IChannelDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    @Test
    public void Test1() {
        SqlSession session = null;
        try {
            //读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //创建SQLSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory的工厂
            SqlSessionFactory factory = builder.build(in);
            //
            session = factory.openSession();
            //
            List<Channel> cs = session.selectList("findAll");
            System.out.println(cs);
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行添加
            Channel c = new Channel();
            c.setCid(32111);
            c.setCname("Mybatis");
            c.setDescription("Mybatis");
            int count = session.insert("edu.xatu.Channel.addChannel", c);//edu.xalead.Channel.addChannel查询配置的id
            if (count > 0) {
                System.out.println("添加成功！");
            } else {
                System.out.println("没添加成功！");
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Test
    public void test3() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行添加
            Map m = new HashMap();
            m.put("cid", 32112);
            m.put("cname", "Mybatis");
            m.put("description", "Mybatis");
            int count = session.insert("edu.xatu.Channel.addChannel", m);//edu.xalead.Channel.addChannel查询配置的id
            if (count > 0) {
                System.out.println("添加成功！");
            } else {
                System.out.println("没添加成功！");
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Test
    public void test4() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行添加
            int count = session.delete("edu.xatu.Channel.delChannel", 32112);//edu.xalead.Channel.addChannel查询配置的id
            if (count > 0) {
                System.out.println("删除成功！");
            } else {
                System.out.println("没添加成功！");
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    @Test
    public void test5() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行添加
            Channel cs = session.selectOne("edu.xatu.Channel.findByCid", 32111);//edu.xalead.Channel.addChannel查询配置的id
            System.out.println(cs);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    /*
    * 动态代理
    * */
    @Test
    public void test6() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行添加
            ChannelDao channelDao=session.getMapper(ChannelDao.class);
            Channel cs=channelDao.findByCid(1);
            System.out.println(cs);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * 测试注解的方式查询
    * */
    @Test
    public void test7() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行添加
            IChannelDao ichannelDao=session.getMapper(IChannelDao.class);
//            Channel cs=ichannelDao.findByCid(1);
//            System.out.println(cs);
            List<Channel> channelDao1 =ichannelDao.findAll();
            System.out.println(channelDao1);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * 测试动态sql
    * */
    @Test
    public void test8() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行
            ArticleDao ichannelDao=session.getMapper(ArticleDao.class);
            Article article=new Article();
            article.setAid(233);
            List<Article> ls=ichannelDao.findArticleByTitlerOrAuthorOrSource(article);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * 一对一的关联查询
    * */
    @Test
    public void test9() {
        SqlSession session = null;
        try {
            //1.读取配置文件
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.创建SqlSessionFactory工厂
            SqlSessionFactory factory = builder.build(in);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
            session = factory.openSession();
            //5.执行
            ArticleDao ichannelDao=session.getMapper(ArticleDao.class);
            User u=ichannelDao.findUserById(1);
            for (int i=0;i<10;i++){
                System.out.println();
            }
            System.out.println(u);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
