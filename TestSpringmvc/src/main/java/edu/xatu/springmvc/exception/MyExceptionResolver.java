package edu.xatu.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o,
                                         Exception e) {
        e.printStackTrace();
        MyException m=null;
        if (e instanceof MyException){
            m=(MyException) e;
        }else{
            m=new MyException("系统错误,请和管理员联系");
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("",e.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
