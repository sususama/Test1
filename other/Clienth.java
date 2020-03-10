package edu;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("127.0.0.1",8888);//连接
        InputStream in=s.getInputStream();
        OutputStream out=s.getOutputStream();
        BufferedReader br=new BufferedReader(
                new InputStreamReader(in)
        );
        String str=br.readLine();
        System.out.println(str);
    }
}
