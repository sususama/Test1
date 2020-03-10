package edu.xatu;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

//    protected String[] getServletMappings() {
//        return new String[]{"*.action"};
//    }
    /*
    * Restfull风格的配置
    * */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
