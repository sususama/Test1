package edu.xatu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "ListDataServlet",urlPatterns = "/list")
public class ListDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1001,"张三","W",new Address("西安","北京")));
        students.add(new Student(1002,"李四","W",new Address("西安","天津")));
        students.add(new Student(1003,"王五","M",new Address("天津","北京")));
        request.setAttribute("list",students);
        //创建set集合
        Set<Student> studentss=new HashSet<>();
        studentss.add(new Student(1001,"张三","W",new Address("西安","北京")));
        studentss.add(new Student(1002,"李四","W",new Address("西安","天津")));
        studentss.add(new Student(1003,"王五","M",new Address("天津","北京")));
        request.setAttribute("set",studentss.toArray());
        //用map集合访问
        Map<String,Student> map=new HashMap();
        map.put("2222",new Student(1001,"张三","W",new Address("西安","北京")));
        map.put("2223",new Student(1002,"李四","W",new Address("西安","天津")));
        map.put("2224",new Student(1003,"王五","M",new Address("天津","北京")));
        request.setAttribute("map",map);
        request.getRequestDispatcher("/index2.jsp").forward(request,response);
    }
}
