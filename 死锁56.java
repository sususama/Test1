package edu;
class TTT extends Thread{
    private Integer p1=null;
    private Integer p2=null;
    private String name=null;
    public TTT(Integer p1,Integer p2,String name){
        this.p1=p1;
        this.p2=p2;
        this.name=name;
    }
    public void run() {
        try {
            if ("张三".equals(this.name)) {
                synchronized (p1) {
                    Thread.sleep(1);
                    synchronized (p2) {
                    }
                }
            }else {
                synchronized (p1){
                    Thread.sleep(1);
                    synchronized (p2){
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class 死锁 {
    public static void main(String[] args) {
        Integer p1=20;
        Integer p2=10;
        TTT t=new TTT(p1,p2,"张三");
        TTT t2=new TTT(p1,p2,"李四");
        t.start();
        t2.start();
        
    }
}
