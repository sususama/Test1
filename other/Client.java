package edu.udp;

import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket poster=null;
        poster=new DatagramSocket(8888);//准备好邮局
        String mesg="你好！";
        //准备邮包
        DatagramPacket packet=new DatagramPacket(mesg.getBytes(),//转为字节
                                                    mesg.getBytes().length,//发送长度
                                                    InetAddress.getByName("127.0.0.1"),//对方的ip
                                                        9999);//对方的端口
        //邮局发邮包
        poster.send(packet);
    }
}
