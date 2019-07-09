package edu;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Xalead {
    public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(8888);//创建端口
        System.out.println("等待连接");
        Socket ss=s.accept();//阻塞
        System.out.println("已经有链接");
        InputStream input=ss.getInputStream();
        OutputStream output=ss.getOutputStream();
        PrintWriter pw=new PrintWriter(output);
        pw.println("你好！");
        System.out.println("成功发送");
        pw.flush();
    }
}
