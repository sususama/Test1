package exa;
class  TTT1 implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class 加入 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new TTT1());
        t.start();//当join后，其余线程等待被join线程执行完毕
        t.join(); //join阻塞自己，又叫线程的合并
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
