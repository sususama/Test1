import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    @Test
    public void test1() {
        System.out.println("Hello");
    }
    @Test
    public  void test2(){
        Date d=new Date();
        System.out.println(d);
    }
    @Test
    //得到date的毫秒数
    public  void test3(){
        Date d=new Date();
        System.out.println(d.getTime());
    }
    @Test
    //得到当前的毫秒数
    public  void test4(){
        System.out.println(System.currentTimeMillis());
    }

    private void circle1(){
        for(int i=0;i<100000;i++){
            System.out.println(i);
        }
    }
    @Test
    /*计算代码的性能
     *  *
    * */
    public  void test5(){
        long start=System.currentTimeMillis();
        circle1();
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println(time);

    }
    @Test
    /*格式化时间
    * */
    public void test6(){
        Date d=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss ms");
        String cur=df.format(d);
        System.out.println(cur);
        try {
            Date dd=df.parse("2018年05月19日 08:56:39 5639");
            System.out.println(dd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
