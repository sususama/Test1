package eud.xatu;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Send {
    public static void main(String[] args) throws IOException {
        Socket s=null;
        s=new Socket("127.0.0.1",8080);
        PrintWriter pw=new PrintWriter(s.getOutputStream());
        pw.println("POST /ddd HTTP/1.1");
        pw.println("Host: localhost:8080");
        pw.println("User-Agent: insomnia/6.6.2");
        pw.println("Content-Type: application/x-www-form-urlencoded");
        pw.println("Accept: */*");
        pw.println("Content-Length: 26");
        pw.println();
        pw.println();
        pw.println("name=lisi&sex=M&age=20");
    }
}
