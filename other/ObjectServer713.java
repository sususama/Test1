package net.server;

import net.Student;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
class Service implements Runnable{
    private InputStream input=null;
    private OutputStream output=null;
    private ObjectOutputStream objout=null;
    private PrintWriter pw=null;//写字符串必须使用PrintWriter
    private Socket s=null;
    public Service(Socket s) {
        this.s=s;
    }
    @Override
    public void run() {
            try {
                input=s.getInputStream();
                output=s.getOutputStream();
                objout=new ObjectOutputStream(output);
                //发一个整数
                objout.writeInt(23);
                //发一个浮点数
                objout.writeDouble(23.2);
                //发一个字符串
                Student ss=new Student(2333,"张三");
                objout.writeObject(ss);
                pw=new PrintWriter(output);
                pw.println("Hello World!");
                pw.flush();
                objout.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
public class ObjectServer {
    public static void main(String[] args) {
        ServerSocket server=null;
        Socket s=null;
//        InputStream input=null;
//        OutputStream output=null;
//        ObjectOutputStream objout=null;
//        PrintWriter pw=null;//写字符串必须使用PrintWriter
        try {
            server=new ServerSocket(8888);
            System.out.println("监听客户连接。。。。");
            while (true) {
                s=server.accept();//监听，阻塞连接
                System.out.println("已成功连接[远程主机："
                        +s.getLocalAddress()+//getInetAddress()
                        "端口："+s.getPort()+"]");
                new Thread(new Service(s)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}