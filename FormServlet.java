package eud.xatu;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "FormServlet")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String pwd =request.getParameter("pwd");
        String sex=request.getParameter("sex");
        String[] fav=request.getParameterValues("fav");
        String desc=request.getParameter("desc");
        System.out.println("name:"+name+"\npwd:"+pwd+"\nsex:"+sex+"\nfav:"+ Arrays.asList(fav)+"\ndesc:"+desc);
//        response.getWriter().println("<html>");
//        response.getWriter().println("<head>");
//        response.getWriter().println("<title>动态页面</title>");
//        response.getWriter().println("<body>");
//        response.getWriter().println("name:"+name+"\npwd:"+pwd+"\nsex:"+sex+"\nfav:"+ Arrays.asList(fav)+"\ndesc:"+desc);
//        response.getWriter().println("</body>");
//        response.getWriter().println("</head>");
//        response.getWriter().println("</html>");

        BufferedImage img=new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
        Graphics2D g=(Graphics2D) img.getGraphics();
        g.setColor(Color.WHITE);
        g.drawString("Hello world !",50,50);
        ImageIO.write(img,"PNG",response.getOutputStream());
    }

}
