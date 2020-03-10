package eud.xatu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PostFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String name=request.getParameter("name");
            String sex=request.getParameter("sex");
            String[] age=request.getParameterValues("age");
            System.out.println(name+":"+sex+":"+age);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter pw=response.getWriter();
////        pw.println("<html>");
////        pw.println("<head>");
////        pw.println("<meta charset=\'utf-8\'>");
////        pw.println("<title>测试页面</title>");
////        pw.println("<body>");
////        pw.println("<h1>测试123</h1>");
////        pw.println("</body>");
////        pw.println("</head>");
////        pw.println("</html>");

//        //请求转发
//        response.setStatus(302);
//        response.setHeader("location","http://www.sohu.com");
        RequestDispatcher dispatcher=request.getRequestDispatcher("/index.html");
    }
}
