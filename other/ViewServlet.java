package eud.xatu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ViewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> stus =(List<Student>)request.getAttribute("stus");
        PrintWriter pw =response.getWriter();
        pw.println("<table border='1'>");
        for (Student s:stus){
            pw.println("<tr>");
            pw.println("<td>");
            pw.println(s.getSex());
            pw.println("</td>");
            pw.println("<td>");
            pw.println(s.getName());
            pw.println("</td>");
            pw.println("<td>");
            pw.println(s.getAge());
            pw.println("</td>");
        }
        pw.println("</table>");
    }
}
