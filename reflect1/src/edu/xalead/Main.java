package edu.xalead;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        String className="java.util.Date";

        try {
            Class c=Class.forName(className);
            System.out.println(c.getName());
            //拿属性
            Field[] fs=c.getDeclaredFields();
            for (Field f:fs){
                System.out.println(f.getName()+":"+f.getType().getName());
            }
            //构造方法
            Constructor [] ccs =c.getConstructors();
            for (Constructor cc :ccs){
                System.out.println(cc.getParameterCount());
            }
            //硬编码  前期绑定
//            Date d = new Date();
            //后期绑定
            Object o=ccs[2].newInstance();
            System.out.println(o);
            //拿方法
            Method [] methods =c.getMethods();
            for (Method m :methods){
                System.out.println("方法名"+m.getName()+":"+m.getReturnType().getName());
                if ("setYear".equals(m.getName())){
                    m.invoke(o,4);
                    System.out.println("定义时间"+o);
                }
                //拿到方法的参数
                Parameter[] ps=m.getParameters();
                for (Parameter p:ps){
                    System.out.println("        "+p.getName()+":"+p.getType().getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
