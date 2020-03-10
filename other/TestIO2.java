package edu;

import org.junit.Test;

import java.io.*;

public class TestIO2 {
    @Test
    public void test1() throws IOException {
        FileInputStream fin=new FileInputStream("C:\\集合2/asd.txt");
        int a;
        while ((a=fin.read())!=-1){
            System.out.print((char) a);//不好读，有问题
        }
        fin.close();
    }
    @Test
    public void test2() throws IOException {
        FileWriter w=new FileWriter("C:\\集合2/asd.txt");
//        w.write('A');
//        w.write("张三");

        w.close();
    }
    @Test
    public void test3() throws IOException {
        FileReader fr=new FileReader("C:\\集合2/asd.txt");
        int a;
        while ((a=fr.read())!=-1){
            System.out.print((char) a);
        }
        fr.close();
    }
    @Test
    public void test4() throws Exception {
        BufferedWriter bw=new BufferedWriter(
                new FileWriter("C:\\集合2/asd.txt")
        );
//        FileReader fr=new FileReader("C:\\集合2/asd.txt");
        bw.write("你好中国！");
        bw.flush();
        bw.close();
    }
    @Test
    public void test5() throws IOException {
        BufferedReader bw= new BufferedReader(//读字符串用Buffered
                new FileReader("C:\\集合2/asd.txt")
        ); // 因为有readLine，读取方便

        String mesg=bw.readLine();
        System.out.println(mesg);
        bw.close();
    }
    @Test
    public void test6() throws Exception{
    InputStreamReader ir=new InputStreamReader(System.in);//从键盘读取字节
    BufferedReader br=new BufferedReader(ir);
    String mesg=br.readLine();
        System.out.println(mesg);
    }
    @Test
    public void test7() throws IOException {
        OutputStreamWriter w=new OutputStreamWriter(System.out);
        BufferedWriter bw=new BufferedWriter(w);
        bw.write("中国");
        bw.flush();
        System.out.println("\n");
        System.out.println(bw);
    }
    @Test
    public void test8() throws Exception {
        PrintStream s=new PrintStream("C:\\集合2/asd.txt");
        s.println("Hellon World!");
        System.out.println();
        s.flush();
        s.close();
    }
    @Test
    public void test9() throws Exception {
        PrintWriter s= new PrintWriter("C:\\集合2/asd.txt");
        s.println(20+"\nHellon World!\n"+'W'+23453245.54);
        System.out.println();
        s.flush();
        s.close();
    }
    @Test
    public void test10() throws Exception {
        File f=new File("C:\\集合2/a.txt");
        if(f.exists()){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
            System.out.println(f.mkdir());
        }

    }
    @Test
    public void test11() throws Exception {
        File f=new File("C:\\集合2/aa.txt");
        if(f.exists()){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
            System.out.println(f.createNewFile());
        }
    }
    @Test
    public void test12() throws Exception {
        File f=new File("C:\\集合2/aa.txt");
        if (f.isDirectory()){
            System.out.println("["+f.getName()+"]");
        }else {
            System.out.println(f.getName());
        }

    }
    private void writeBlank(int level){
        for (int i=0;i<level;i++){
            System.out.println("  ");
        }
    }
    private void listFile(File[] fs,int leve){
        for (File f:fs){
            writeBlank(leve);
            if (f.isDirectory()){
                System.out.println("["+f.getName()+"]");
                File[]ff=f.listFiles();
                if(ff!=null&&ff.length>0){
                    listFile(ff,++leve);
                }
            }else {
                System.out.println(f.getName());
            }
        }
    }

}
