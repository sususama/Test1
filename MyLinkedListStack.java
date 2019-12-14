package edu.xatu;

import java.util.Iterator;

public class MyLinkedListStack<E> implements Iterable<E> {

    private Node<E> topOfStack;
    private static class Node<E>{
        public E data;//存储数据
        public MyLinkedListStack.Node<E> prev;//上一个节点
        public Node(E d, MyLinkedListStack.Node<E> p){
            data=d;
            this.prev=p;
        }
    }
    public boolean pop(E x,Node<E> topOfStack){
        Node<E> newStack=new Node<>(x,topOfStack);
        topOfStack.prev.data=x;
        topOfStack.prev=newStack;
        return true;
    }
    public E push(){
        E oldVal;
        oldVal=this.topOfStack.data;
        this.topOfStack.prev=topOfStack.prev.prev;
        return oldVal;
    }
    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
