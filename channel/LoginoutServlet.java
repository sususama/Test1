package edu.xalead.cms.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginoutServlet",urlPatterns = "/backend/loginout")
public class LoginoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //删除令牌属性
        request.getSession().removeAttribute("user");
        //转发到登陆页面
        request.getRequestDispatcher("/backend/login.jsp").forward(request,response);
    }
}
