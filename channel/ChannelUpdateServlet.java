package edu.xalead.cms.web.servlet;

import edu.xalead.cms.entity.Channel;
import edu.xalead.cms.service.ChannelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChannelUpdateServlet",urlPatterns = "/backend/channelUpdate")
public class ChannelUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先取出频道id
        int cid = Integer.parseInt(request.getParameter("cid"));
        String cname = request.getParameter("cname");
        String description = request.getParameter("description");
        //先查询出，我们要更新的对象
        ChannelServiceImpl channelServiceImpl = new ChannelServiceImpl();
        Channel channel = channelServiceImpl.findChannelByid(cid);
        //判断提交频道名称和我们查询到的频道名称是否不相等
        if(cname != null && !cname.equals(channel.getCname())){
            //不相等，则更新
            channel.setCname(cname);
        }
        //判断提交频道描述和我们查询到的频道名称是否不相等
        if(description != null && !description.equals(channel.getDescription())){
            //不相等，则更新
            channel.setDescription(description);
        }
        //更新
        channelServiceImpl.updateChannel(channel);
        //转到成功页面
        request.getRequestDispatcher("/backend/channel/success.jsp")
                .forward(request,response);
    }

}
