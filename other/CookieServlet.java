package edu.xatu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookieServlet",urlPatterns = "/cookie")
public class CookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //cookie是服务器写到客户端的一小段文本
        Cookie c1 = new Cookie("name", "zhangsan");
        Cookie c2 =new Cookie("sex","M");
        Cookie c3 =new Cookie("number","1212");
        c1.setComment("this is a user name");
        c1.setMaxAge(60);//cookie存在的时长
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
//        response.setHeader("set-cookie","name=zhangsan");
    }
}