package edu.xatu;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("sss")
public class Ser {
    @Resource
    private Person person;
    public void chuanyifu(){
        System.out.println("穿衣服");
    }
    public void xishu(){
        System.out.println("洗漱");
    }
    public void chifan(){
        System.out.println("吃饭");
    }
}
