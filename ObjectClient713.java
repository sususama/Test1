package net.client;
import net.Student;
import java.net.Socket;
import java.io.*;
public class ObjectClient {
    public static void main(String[] args) {
        Socket s=null;
        String ip="127.0.0.1";
        int port=8888;
        OutputStream output=null;
        InputStream input=null;
        ObjectInputStream objin=null;
        BufferedReader br=null;
        try {
            s=new Socket(ip,port);//当new Socket时，服务器必须是监听状态
            input=s.getInputStream();
            output=s.getOutputStream();
            objin= new ObjectInputStream(input);
            br=new BufferedReader(new InputStreamReader(input));
            System.out.println(objin.readInt());
            System.out.println(objin.readDouble());
            Student sa=(Student) objin.readObject();
            System.out.println(sa);
            System.out.println(br.readLine());
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
