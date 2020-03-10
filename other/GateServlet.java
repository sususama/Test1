package edu.xatu;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

//@WebServlet(name = "GateServlet",loadOnStartup = 1)
public class GateServlet extends HttpServlet {
    class CacheThread extends Thread{
        private ServletContext context;
        public CacheThread(ServletContext context){
            this.context = context;
        }
        public void run(){
            while(true){
                Connection conn = null;
                PreparedStatement prst = null;
                ResultSet rs = null;
                ResultSetMetaData meta = null;
                try {
                    conn = DB.getConntect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String sql = "select * from emp";
                try {
                    prst = conn.prepareStatement(sql);
                    rs = prst.executeQuery();
                    meta = rs.getMetaData();
                    //下面把连线集合转为离线集合
                    ArrayList<ArrayList<String>> table = new ArrayList<>();
                    while(rs.next()){
                        ArrayList<String> row = new ArrayList<>();
                        for(int i = 1 ; i <= meta.getColumnCount() ; i++){
                            row.add(rs.getString(i));
                        }
                        table.add(row);
                    }
                    //缓存离线数据
                    context.setAttribute("table",table);
                    //休息一下
                    Thread.sleep(60000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                DB.close(conn);
            }
        }
    }
    @Override
    public void init() throws ServletException {
        new CacheThread(this.getServletContext()).start();
    }
}
