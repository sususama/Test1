package edu.com;

public class 做包子的 extends Thread{
   private 包子笼 p=null;
   private String name=null;
   public 做包子的(包子笼 p,String name){
       this.p=p;
       this.name=name;
   }
   public void run(){
       while (true){
           try {
               synchronized (p) {
                   if (p.pack <= 0) {
                       p.pack = 100;
                       System.out.println(this.name + "做好了" + p.pack + "个包子");
                   } else {
                       p.notifyAll();
                       p.wait();
                   }
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
}
