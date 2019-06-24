package edu;

import org.junit.Test;

import java.io.*;
import java.util.Date;

public class TestIO{
    /*
    * 测试文件输出流
    * */
        @Test
        public void test1() throws Exception {
            FileOutputStream fout=new FileOutputStream("C:\\集合2/asd.txt");
            byte[]b={0,0,0,20};
            fout.write(b[0]);
            fout.write(b[1]);
            fout.write(b[2]);
            fout.write(b[3]);
            fout.close();
        }
    /*
     * 测试文件输入流
     * */
    @Test
    public void test2() throws Exception {
        FileInputStream fin=new FileInputStream("C:\\集合2/asd.txt");
        byte[]b=new byte[20];
        b[0]=(byte)fin.read();
        b[1]=(byte)fin.read();
        b[2]=(byte)fin.read();
        b[3]=(byte)fin.read();
        System.out.println(b[3]);
        fin.close();//释放资源流

    }
    @Test
    public void test3() throws IOException {
        OutputStream fout=new FileOutputStream("C:\\集合2/asd.txt");
        String mesh="Hello World !你好世界！";
        byte[] ss=mesh.getBytes();
        for (byte s:ss){
            fout.write(s);
        }
        fout.close();
    }
    @Test
    public void test4() throws IOException {
        FileInputStream fin=new FileInputStream("C:\\集合2/asd.txt");
        byte[] t=new byte[fin.available()];
        int b;
        int i=0;
        while ((b=fin.read())!=-1){
            t[i]=(byte) b;
            i++;
        }
        String mesg=new String(t);
        System.out.println(mesg);
        fin.close();//释放
    }
    /*
    *对象流 Obj
      * */
    @Test
    public void test5() throws IOException {
        OutputStream fout=new FileOutputStream("C:\\集合2/asd.txt");
        ObjectOutputStream objout=new ObjectOutputStream(fout);
//        objout.write(2);
        objout.writeInt(2098);
        objout.writeBytes("Hello World!");
        objout.flush();
        objout.close();
    }
    @Test
    public void test6() throws IOException {
        InputStream fin= new FileInputStream("C:\\集合2/asd.txt");
        ObjectInputStream objin=new ObjectInputStream(fin);
        int t=objin.readInt();
        System.out.println(t);
        objin.close();
    }
    @Test
    public void test7() throws IOException {
        OutputStream fout=new FileOutputStream("C:\\集合2/asd.txt");
        ObjectOutputStream objout=new ObjectOutputStream(fout);
        Date d=new Date();
        objout.writeObject(d);
        Student s=new Student(2000,"张三");
        objout.writeObject(s);
        objout.flush();
        objout.close();
    }
    @Test
    public void test8() throws Exception {
        InputStream fin= new FileInputStream("C:\\集合2/asd.txt");
        ObjectInputStream objin=new ObjectInputStream(fin);
        Date d= (Date) objin.readObject();
        System.out.println(d);
        Student s= (Student) objin.readObject();
        System.out.println(s);
        objin.close();
    }

    @Test
    public void test9() throws IOException {
//        OutputStream fout=new FileOutputStream("C:\\集合2/asd.txt");
//        BufferedOutputStream bout=new BufferedOutputStream(fout);//许多高级流自带流
//        ObjectOutputStream objout=new ObjectOutputStream(bout);
        ObjectOutputStream objout=new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("C:\\集合2/asd.txt")
                )
        );
//        bout.close();//有缓存为什么快
        Date d=new Date();
        objout.writeObject(d);
        Student s=new Student(2000,"张三");
        objout.writeObject(s);
        objout.flush();
        objout.close();
    }
    @Test
    public void test10() throws Exception {
        ObjectInputStream objin=new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("C:\\集合2/asd.txt")
                )
        );
        Date d= (Date) objin.readObject();
        System.out.println(d);
        Student s= (Student) objin.readObject();
        System.out.println(s);
        objin.close();
    }
}