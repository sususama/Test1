package edu;
class T extends Thread{//创建一个线程
    //继承线程类Thread
    private Integer  i=null;
    public  T(Integer i){
        this.i=i;
    }
    public void run(){//创建新线程的一个主函数
        for (;;){
            System.out.println(i++);
        }
    }
}
public class Text {

    public static void main(String[] args) {
        //线程就是在同一个进程中进行不同的程序
        //线程和进程使用的是同一个空间
        //进程中创建线程
        //线程由另一个线程的启动
        //几乎所有的线程是由其他的线程启动（主线程）
        Integer i=0;//包装类保存的是地址    ，所以使用包装类
        T t=new T(i);
        //管理线程类需要靠Thread
        T t1=new T(i);
//        t.run();
//        t1.run();//不能用run执行任务
        t.start();
        t1.start();
    }
}