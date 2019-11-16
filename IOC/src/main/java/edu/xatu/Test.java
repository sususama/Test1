package edu.xatu;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");
        UserServlet servlet = (UserServlet) factory.getBean("userServlet");
        UserServlet servlet1=(UserServlet)factory.getBean("userServlet");
        User user=(User)factory.getBean("user");
        System.out.println(servlet==servlet1);
        System.out.println(user);
        servlet.findUser();
    }
}
