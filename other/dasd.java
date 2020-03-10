package edu;

import java.util.HashSet;

public class Text {
    public static void main(String[] args) {
        HashSet t=new HashSet();
        t.add("Hello");
        t.add("Hello");
        t.add("Hello");
        System.out.println(t.size());

        t=new HashSet();
        t.add(new Student(111,"zhangsan",'M'));
        t.add(new Student(111,"zhangsan",'M'));
        t.add(new Student(111,"zhangsan",'M'));
        System.out.println(t.size());

    }
}
