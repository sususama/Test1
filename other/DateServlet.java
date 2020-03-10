package edu.xatu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DateServlet",urlPatterns = "/date")
public class DateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("a","Hello");
        request.setAttribute("b",123);
        request.setAttribute("c",true);

        request.getSession().setAttribute("a","World");
        request.getSession().setAttribute("b",456);
        request.getSession().setAttribute("c",false);

        request.getServletContext().setAttribute("a","!");
        request.getServletContext().setAttribute("b",789);
        request.getServletContext().setAttribute("c",23.23);
        //转发到index.jsp
        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
