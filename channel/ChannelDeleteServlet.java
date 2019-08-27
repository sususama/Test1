package edu.xalead.cms.web.servlet;

import edu.xalead.cms.service.ChannelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChannelDeleteServlet",urlPatterns = "/backend/channelDelete")
public class ChannelDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*//取出要删除的频道的id
        int cid=Integer.parseInt(request.getParameter("cid"));
        //创建ChannelService对象，调用根据频道id删除的方法
        ChannelServiceImpl service=new ChannelServiceImpl();
        service.deleteBycid(cid);*/
        //转到成功页面
        String [] cids=request.getParameterValues("cid");
        if (cids!=null&&cids.length>0) {
            ChannelServiceImpl service = new ChannelServiceImpl();
            for (String cid : cids) {
                service.deleteBycid(Integer.parseInt(cid));
            }
        }
        request.getRequestDispatcher("/backend/channel/success.jsp").forward(request,response);
    }
}
