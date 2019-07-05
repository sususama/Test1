package edu.com;

public class Test吃包子 {
    public static void main(String[] args) {
        包子笼 p=new 包子笼();
        做包子的 m=new 做包子的(p,"王大厨");
        吃包子的 c1=new 吃包子的(p,"张三");
        吃包子的 c2=new 吃包子的(p,"李四");
        c1.start();
//        c2.start();
//        m.start();
    }
}