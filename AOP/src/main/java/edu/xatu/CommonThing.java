package edu.xatu;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CommonThing {
    @Pointcut("execution(* edu.xatu.MyThingImp.* ( .. ))")
    private void aa(){}
    @Before("aa()")
    public void chuanyi(){
        System.out.println("穿衣");
    }
    @Before("aa()")
    public void chifan(){
        System.out.println("吃饭");
    }
    @After("aa()")
    public void tuoyi(){
        System.out.println("脱衣");
    }
    @After("aa()")
    public void shuijiao(){
        System.out.println("睡觉");
    }
}
