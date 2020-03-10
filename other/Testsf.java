package edua;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("Hello");
        c.add("World");
        c.add("!");
        c.add(26);
        Iterator iter =c.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        c=new HashSet();//随机输出，无序
        c.add("Hello");
        c.add("World");
        c.add("!");
        c.add(26);
        iter =c.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        c=new TreeSet();//有序，可以制定规则，规定输出顺序
        c.add("Hello");
        c.add("World");
        c.add("!");
        iter =c.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());

        }

        c=new LinkedList();
        c.add("Hello");
        c.add("World");
        c.add("!");
        c.add(26);
        iter =c.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
