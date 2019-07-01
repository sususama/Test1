package edu;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

public class Test2 {
    private Calendar calender=null;
    @Before
    public void  test1t(){
        calender= Calendar.getInstance();
    }
    @Test
    public void test2(){
        System.out.println(calender.getTime());
    }
    @Test
    public void test3(){
        //去年份
        int year=calender.get(Calendar.YEAR);
        //取月
        int month=calender.get(Calendar.MONTH);
        //去日
        int day=calender.get(Calendar.DAY_OF_MONTH);
        //取时
        int hour=calender.get(Calendar.HOUR);
        //取星期几
        int weedday=calender.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
    }
    @Test
    public void test4(){
        //当前时间增加一年
        calender.add(Calendar.YEAR,1);
        //去年份
        int year=calender.get(Calendar.YEAR);
        //取月
        int month=calender.get(Calendar.MONTH);
        //去日
        int day=calender.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+1+"月"+day+"日");
    }
    @Test
    public void test5(){
        calender.set(2014,2,1);
        calender.add(Calendar.DAY_OF_MONTH,-1);
        int day=calender.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);
    }
}
