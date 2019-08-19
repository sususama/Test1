package eud.xatu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> stus=new ArrayList<>();
        stus.add(new Student(21,"M","zhangsan"));
        stus.add(new Student(22,"W","lisi"));

        request.setAttribute("stus",stus);
        request.getRequestDispatcher("/fff").forward(request,response);
    }
}
