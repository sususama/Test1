package edu;

import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet s=new TreeSet();
        s.add(23);
        s.add(20);
        s.add(21);
        s.add(22);
        s.add(2455);
        Iterator iter=s.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        s=new TreeSet();
        s.add(new Student(2444,"张三",'M'));
        s.add(new Student(2443,"李四",'W'));
        s.add(new Student(1992,"王麻子",'M'));
        iter=s.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
//map映射集合   可以理解为哈希表