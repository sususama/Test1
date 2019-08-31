package edu.xatu;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ViewServlet",urlPatterns = "/view")
public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先要拿到ServletContext
        ServletContext servletContext = request.getServletContext();
        //先取出离线集
        ArrayList<ArrayList<String>> table = (ArrayList<ArrayList<String>>)servletContext.getAttribute("table");
        //渲染成表格输出
        //取输出字符流
        PrintWriter pw = response.getWriter();
        pw.println("<table border='1'>");
        pw.println("<th>");
        pw.println("empno");
        pw.println("</th>");
        pw.println("<th>");
        pw.println("ename");
        pw.println("</th>");
        pw.println("<th>");
        pw.println("job");
        pw.println("</th>");
        pw.println("<th>");
        pw.println("mgr");
        pw.println("</th>");
        pw.println("<th>");
        pw.println("hiredate");
        pw.println("</th>");
        pw.println("<th>");
        pw.println("salary");
        pw.println("</th>");
        pw.println("<th>");
        pw.println("comm");
        pw.println("</th>");
        pw.println("<th>");
        pw.println("deptno");
        pw.println("</th>");
        for(int i=0;i<table.size();i++){
            pw.println("<tr>");
            ArrayList<String> row = table.get(i);
            for(int j = 0 ; j < row.size() ; j++){
                pw.println("<td>");
                pw.println(row.get(j));
                pw.println("</td>");
            }
            pw.println("</tr>");
        }
        pw.println("</table>");
    }
}
