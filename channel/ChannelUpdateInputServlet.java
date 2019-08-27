package edu.xalead.cms.web.servlet;

import edu.xalead.cms.entity.Channel;
import edu.xalead.cms.service.ChannelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChannelUpdateInputServlet",urlPatterns = "/backend/channelUpdateInput")
public class ChannelUpdateInputServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cid=Integer.parseInt(request.getParameter("cid"));
        ChannelServiceImpl channelServiceImpl =new ChannelServiceImpl();
        Channel channel= channelServiceImpl.findChannelByid(cid);
        //把查询到的数据放入attribute中
        request.setAttribute("c",channel);
        request.getRequestDispatcher("/backend/channel/updateinput.jsp").forward(request,response);
    }
}
