package edu.xatu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ObjectServlet",urlPatterns = "/obj")
public class ObjectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student s=new Student(1111,"张三","M",new Address("西安","北京"));
        request.setAttribute("s",s);
        request.getRequestDispatcher("/index1.jsp").forward(request,response);
    }
}
