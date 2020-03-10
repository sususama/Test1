package 异常;

import java.util.Scanner;
class MyException1 extends RuntimeException{
    MyException1(){super("数组越界");}
}
public class Test2 {
    static void show1(String [] a)throws MyException1{
        Scanner in=new Scanner(System.in);
        for (int i=0;i<=6;i++){
            if (i>=a.length){
                throw new MyException1();
            }
            a[i]=in.next();
        }
    }
    public static void main(String[] args) {
        String [] a=new String[5];
        show1(a);
    }
}
