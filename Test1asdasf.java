package edu;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char c[]=new char[s.length()];
        System.out.println("字符串长度为:"+s.length());
        for(int i=0;i<s.length();i++){
            char cc=s.charAt(i);
            c[s.length()-1-i]=cc;
        }
        System.out.print("将字符串反转输出:");
        for (int i=0;i<s.length();i++){
            System.out.print(c[i]);
        }
    }
}
