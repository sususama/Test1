package edu;

import java.util.ArrayList;

public class lianbiaonixushuchu {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> a=new ArrayList<>();
        if (listNode.next!=null){
            this.printListFromTailToHead(listNode.next);
            a.add(listNode.num);
        }
        return a;
    }
    public static void main(String[] args) {

    }
}
