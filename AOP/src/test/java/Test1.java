import edu.xatu.ChannelService;
import edu.config.SpringConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class Test1 {
    @Resource
    private DataSource ds=null;
    @Resource
    private ChannelService cs=null;
/*    @Before
    public void intit(){
        factory=new AnnotationConfigApplicationContext(SpringConfig.class);
    }*/
    @org.junit.Test
    public void test1(){

    }
    @org.junit.Test
    public void test2(){

    }

}
