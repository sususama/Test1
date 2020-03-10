package exa;
class TH1 extends Thread{
    TH1(){
        super.setName("让步线程");
    }
    @Override
    public void run() {
        while (true){
            Thread.yield();//当前线程让步
            System.out.println(this.getName());
        }
    }
}
class TH2 implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName());//得到当前线程currentThread
        }
    }
}
public class 让步 {
    public static void main(String[] args) {
        TH1 t1=new TH1();
        TH2 t2=new TH2();
        t1.start();
        Thread th=new Thread(t2);
        th.start();

    }
    //yield()让步

}
