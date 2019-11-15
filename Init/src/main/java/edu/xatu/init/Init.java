package edu.xatu.init;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

/*
* 代替web.xml初始servlet
* */
public class Init implements ServletContainerInitializer {
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        DispatcherServlet servlet=new DispatcherServlet();
        ServletRegistration.Dynamic dynamic=servletContext.addServlet("DispatcherServlet",servlet);
        dynamic.addMapping("*.action");
        dynamic.setInitParameter("contextConfigLocation","classpath:springmvc.xml");
    }
}

