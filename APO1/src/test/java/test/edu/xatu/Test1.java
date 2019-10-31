package test.edu.xatu;

import edu.xatu.config.Condig;
import edu.xatu.service.ChannelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Condig.class})
public class Test1 {
    @Resource
    private ChannelService channelService;

    @Test
    public void Test1(){
        channelService.zhuangZhang();
    }
}
