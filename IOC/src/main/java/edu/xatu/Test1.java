package edu.xatu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("application.xml");
        User u=factory.getBean(User.class);
        System.out.println(u);
    }
}
