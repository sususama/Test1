package edu.xatu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("application.xml");
//        User u=(User) factory.getBean("user");
        UserServlet userServlet= (UserServlet) factory.getBean("userServlet");
        userServlet.findUser();
//        System.out.println(u);
    }
}
