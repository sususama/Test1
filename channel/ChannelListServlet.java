package edu.xalead.cms.web.servlet;

import edu.xalead.cms.entity.Channel;
import edu.xalead.cms.service.ChannelServiceImpl;
import edu.xalead.cms.vo.pageVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ChannelListServlet",urlPatterns = "/backend/channelList")
public class ChannelListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pageVo<Channel> vo = new pageVo<>();
        vo.setOffset((Integer)request.getAttribute("offset"));
        vo.setPagesize((Integer)request.getAttribute("pagesize"));
        ChannelServiceImpl channelServiceImpl = new ChannelServiceImpl();
        //查询频道总记录数
        int count = channelServiceImpl.findChannelCount();
        vo.setCount(count);
        //查询当前页的所有频道
        List<Channel> channels = channelServiceImpl.findPageChannel(vo.getOffset(),vo.getPagesize());//返回所有频道
        vo.setDatas(channels);
        //把频道列表放入request
        request.setAttribute("vo",vo);
        //转发频道列表页
        request.getRequestDispatcher("/backend/channel/list.jsp").forward(request,response);
    }
}
