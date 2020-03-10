package edu;
class T1 implements Runnable{
    private Integer  i=null;
    public  T1(Integer i){
        this.i=i;
    }
    public void run(){
        for (;;){
            System.out.println(i++);
        }
    }
}
public class Test2 {
    public static void main(String[] args){
        Integer i=0;
        T1 t=new T1(i);
        T1 t1=new T1(i);
        Thread tt=new Thread(t);
        tt.start();
        Thread tt1=new Thread(t1);
        tt1.start();

    }
}