package eud.xatu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class EmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST开始执行");
        System.out.println("2234235");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

            //取查询字符串中的集合数据
            String [] names=request.getParameterValues("name");
            System.out.println(Arrays.asList(names));
            //查询字符串在request当中本质是储存为Map集合，用一下方法可取出
            Map<String,String[]> params =request.getParameterMap();
            String[] namePamrams=params.get("name");
            System.out.println(Arrays.asList(namePamrams));

            response.getWriter().println("Hello World!");
        } catch (java.lang.Exception exception) {
            exception.printStackTrace();
        }
    }
}
