package edu.tag;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Mytag extends BodyTagSupport {

    @Override
    public int doStartTag() throws JspException {

        //先要拿到ServletContext
        ServletContext servletContext = this.pageContext.getRequest().getServletContext();
        //先取出离线集
        ArrayList<ArrayList<String>> table = (ArrayList<ArrayList<String>>)servletContext.getAttribute("table");
        //渲染成表格输出
        //取输出字符流

        PrintWriter pw = null;
        try {
            pw = this.pageContext.getResponse().getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                System.out.println();
            }
            pw.println("</tr>");
        }
        pw.println("</table>");
        return BodyTagSupport.SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return super.doEndTag();
    }

    @Override
    public int doAfterBody() throws JspException {
        return super.doAfterBody();
    }
}
