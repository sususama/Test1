package edu.com;

public class 吃包子的 extends Thread {
    private 包子笼 p=null;
    private String name=null;
    public 吃包子的(包子笼 p, String name){
        this.p=p;
        this.name=name;
    }


    public void run(){
        try {
            while (true) {
//                p.eat(this.name);
                    synchronized (p) {
                        if (this.p.pack <= 0) {
                            p.notifyAll();
                            p.wait();
                        } else
                        System.out.println(this.name + "吃第" + this.p.pack + "个包子");
                        this.p.pack--;
                    }
                    Thread.sleep(1);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
