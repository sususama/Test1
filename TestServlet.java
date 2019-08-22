package eud.xatu;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
    public void service(HttpServletRequest request,HttpServletResponse response)  {
        try {
            //取出请求方法
            String method = request.getMethod();
            //取出请求路径
            String url =request.getRequestURL().toString();
            //取出协议及其版本
            String protocol =request.getProtocol();
            //取出请求头中的内容
            String host_head = request.getHeader("host");
            String accept_head =request.getHeader("accept");
            String userAgent_head =request.getHeader("user-agent");

            // 取查询字符串中的数据
            String name =request.getParameter("name");
            String sex =request.getParameter("sex");
            System.out.println("name:"+name+"\nsex:"+sex);
            System.out.println("host："+host_head+"\n accept:"+accept_head+"\n user-agent"+userAgent_head);
            System.out.println(method+" "+ url+" "+protocol);
            response.getWriter().println("Hello World!");
            System.out.println();
        } catch (java.lang.Exception exception) {
            exception.printStackTrace();
        }
    }
}
