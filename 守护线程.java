package exa;
class TSS implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class 守护线程 {
    public static void main(String[] args) {
        Thread t1=new Thread(new TSS());
        t1.setDaemon(true);//谁启动它，它守护谁
        t1.start();//被守护线程结束后，守护线程也会结束
//        t1.stop();//不安全
//        t1.suspend();//悬挂
//        t1.resume();
        for (int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"第"+i+"次");
        }
    }
}
