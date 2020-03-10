package edu.udp;

import net.Student;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ObjectClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket poster=new DatagramSocket();
        int a=220;
        double b=244.3;
        Student s=new Student(2001,"张三");
        //转换为字节数组
        ByteArrayOutputStream byout=new ByteArrayOutputStream();//输入字节
        //写到缓存中，只能由它访问
        ObjectOutputStream objout=new ObjectOutputStream(byout);
        objout.writeInt(a);
        objout.writeDouble(b);
        objout.writeObject(s);
        objout.flush();
        byte [] t=byout.toByteArray();//得到字节
        objout.close();
        DatagramPacket packet=new DatagramPacket(t,
                t.length,
                InetAddress.getByName("127.0.0.1"),
                9999);
        poster.send(packet);
    }
}
