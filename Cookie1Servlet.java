package edu.xatu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie1Servlet",urlPatterns = "/cookie1")
public class Cookie1Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cs =request.getCookies();
        for (Cookie c:cs){
            System.out.println(c.getName()+":"+c.getValue());
        }
    }
}
