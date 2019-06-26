package Collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List s=new ArrayList();
        s.add(233);
        s.add(23);
        s.add(33);
        s.add(203);
        s.add(273);
        System.out.println(s);
        Collections.sort(s);
        System.out.println(s);
        s=new ArrayList();
        s.add(new Student(1000,"zhangsan",'M'));
        s.add(new Student(1066,"lisi",'M'));
        s.add(new Student(1006,"wangmazi",'M'));
        System.out.println(s);
        class Rule implements Comparator{


            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  Student&&o2 instanceof Student){
                    Student s1=(Student)o1;
                    Student s2=(Student)o2;
                    if(s1.getCode()>s2.getCode())return 1;
                    if(s1.getCode()<s2.getCode())return -1;//第一个比第二个大返回1
                    return 0;
                }throw new RuntimeException("必须是Student类型");

            }
        }
        Collections.sort(s,new Rule());
        System.out.println(s);

    }
}
