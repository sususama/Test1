package edu;
import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put("abc",new Student(23323,"张三",'男'));
        m.put("bbc",new Student(23231,"李四",'女'));
//        System.out.println(m.get("abc"));
        System.out.println(m.entrySet());
        Set s=m.entrySet();
        Iterator iter=s.iterator();
        while (iter.hasNext()){
            Map.Entry entry=(Map.Entry)iter.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        Collection c=m.values();
        Iterator it=c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Set ss=m.keySet();
        iter =ss.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}//collections
/*
* arrays
*
* */
