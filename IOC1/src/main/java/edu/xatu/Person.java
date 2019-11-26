package edu.xatu;

import org.springframework.stereotype.Component;
@Component
public class Person implements PersonInterface {

    public void lvyou(){
        System.out.println("旅游");
    }
    public void shangban(){
        System.out.println("上班");
    }
    public void tanqin(){
        System.out.println("探亲");
    }
}
