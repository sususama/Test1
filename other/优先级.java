package exa;

import sun.awt.windows.ThemeReader;

class TS implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class 优先级 {
    public static void main(String[] args) {
        Thread t1=new Thread(new TS(),"A线程");
        Thread t2=new Thread(new TS(),"B线程");
        Thread t3=new Thread(new TS(),"C线程");
        t1.setPriority(Thread.MAX_PRIORITY);//优先级等级为 1-10
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
