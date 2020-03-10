package edu.xatu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Session2Servlet",urlPatterns = "/session2")
public class Session2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =request.getSession();
        response.getWriter().println(request.getAttribute("goods1"));
        response.getWriter().println(request.getAttribute("goods2"));
        response.getWriter().println(session.getAttribute("goods2"));
        response.getWriter().println(session.getAttribute("goods1"));
    }
}
