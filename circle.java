package 异常;

import java.util.Scanner;
class MyException extends RuntimeException{
    MyException(){super("半径必须大于0");}
}
public class circle {
    static void shows(int r)throws MyException{
        double mianji;
        if (r<=0){
            throw new MyException();
        }
        mianji=3.14*r*r;
        System.out.println("面积为:"+mianji);
    }
    public static void main(String[] args) {
        int r;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入半径");
        r=in.nextInt();
        try {
            shows(r);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
