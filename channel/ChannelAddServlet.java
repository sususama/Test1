package edu.xalead.cms.web.servlet;

import edu.xalead.cms.entity.Channel;
import edu.xalead.cms.service.ChannelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChannelAddServlet",urlPatterns = "/backend/channeladd")
public class ChannelAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cname=request.getParameter("cname");
        String description=request.getParameter("description");

        Channel channel=new Channel();
        channel.setCname(cname);
        channel.setDescription(description);

        ChannelServiceImpl channelServiceImpl =new ChannelServiceImpl();
        channelServiceImpl.addChannel(channel);
        //转到成功页面
        request.getRequestDispatcher("/backend/channel/success.jsp").forward(request,response);
    }

}
