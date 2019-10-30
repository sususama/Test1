package edu.xatu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");
        MyThing myThing = (MyThing) factory.getBean("myThing");
        myThing.lvyou();
    }
}
