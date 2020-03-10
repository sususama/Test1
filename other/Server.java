package edu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket poster=new DatagramSocket(9999);
        //创建接收包
        DatagramPacket packet=new DatagramPacket(new byte[1024],1024);
        System.out.println("等待接收数据包");
        poster.receive(packet);//接收==复制
        // receive也是一个阻塞的方法
        System.out.println("数据接收成功");
//        byte[] temp=packet.getData();//取出数据
//        int length=packet.getLength();//长度
        int port=packet.getPort();//端口
//        int dasd=packet.getOffset();//偏移值
//        System.out.println(dasd);
//        String str=new String(temp,0,length);
//        System.out.println(str);
//        String ip=packet.getAddress().getCanonicalHostName();
//        System.out.println(ip+"\n"+port+"\n"+length+"\n"+temp);
        String str="你好！";
        DatagramPacket p=new DatagramPacket(str.getBytes(),
                str.getBytes().length,
                packet.getAddress(),
                port);
        poster.send(p);
    }
}
