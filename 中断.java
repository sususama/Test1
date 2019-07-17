package exa;

import java.util.Scanner;

class TTTT extends Thread{
    @Override
    public void run() {
        try {
            while (true){
                System.out.println(this.isInterrupted());
                if (this.isInterrupted()){
                    break;
                }
                System.out.println(Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class 中断 {
    public static void main(String[] args) {
        TTTT t=new TTTT();
        t.start();
        long tt=System.currentTimeMillis();
        while (System.currentTimeMillis()<tt+1000);
        t.interrupt();
//        Scanner s=new Scanner(System.in);
//        String str=s.nextLine();
//        if (str.equals("中断")){
//            t.interrupt();
//        }
//        t.interrupt();//只是改变布尔值，不停止进程
    }
}
