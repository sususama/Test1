package edu;

public class 包子笼 {
    public int pack=100;
    public synchronized void eat(String name){
        System.out.println(name + "吃第" + this.pack + "个包子");
        this.pack--;
    }
}
