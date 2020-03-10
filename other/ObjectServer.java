package edu.udp;

import net.Student;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ObjectServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket poster=new DatagramSocket(9999);
        //创建接收包
        DatagramPacket packet=new DatagramPacket(new byte[1024],1024);
        System.out.println("等待接收数据包");
        poster.receive(packet);//接收==复制
        // receive也是一个阻塞的方法
        System.out.println("数据接收成功");
        byte [] date=packet.getData();
        ByteArrayInputStream byin=new ByteArrayInputStream(date);
        ObjectInputStream objin=new ObjectInputStream(byin);
        System.out.println(objin.readInt()+
                "\n"+objin.readDouble()+
                "\n"+(Student)objin.readObject());
    }
}
