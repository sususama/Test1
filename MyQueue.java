package edu.xatu;

public class MyQueue<E> extends MyArrayList<E> {
    private static final int DEFAULT_CAPACITY =10;
    private E[] theArray;
    private int front;
    private int back;
    private int currentSize;
    //入队   从back的下标开始进入
    public boolean enqueue(E x){
        if (back==DEFAULT_CAPACITY){
            back=0;
        }
        back++;
        theArray[back]=x;
        currentSize++;
        return true;
    }
    //初始化列表
    public MyQueue(){
        theArray= (E[]) new Object[DEFAULT_CAPACITY];
        front=0;
        currentSize=0;
        back=0;
    }
    public E dequeue(){
        if (front==DEFAULT_CAPACITY){
            front=0;
        }
        E d=theArray[front];
        front--;
        currentSize--;
        return d;
    }
    public int size(){
        return currentSize;
    }
}
