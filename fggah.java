package edu;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();//A 65  Z 90
        System.out.println(a);

        if((a.substring(0, 1).toCharArray()[0]>='A'&&a.substring(0, 1).toCharArray()[0]<='Z')){
            System.out.println("字符串长度为"+a.length());
            System.out.println("将全部转换为大写"+a.toUpperCase());
        }else {
            System.out.println("第一个字母不是大写！");
        }
    }
}
