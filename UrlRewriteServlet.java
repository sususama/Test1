package eud.xatu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UrlRewriteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<News> newes=News.news;
        PrintWriter pw =response.getWriter();
        pw.println("<table border='1'>");
        for (News s:newes){
            pw.println("<tr>");
            pw.println("<td>");
            pw.println(s.getId());
            pw.println("</td>");
            pw.println("<td>");
            pw.println("<a hear='/detail?id="+s.getId()+"'>"+s.getTitle()+"</a>");
            pw.println("</td>");
        }
        pw.println("</table>");
    }
}