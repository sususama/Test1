package 异常;

import java.util.Scanner;

class OnlyOneException extends RuntimeException{
    OnlyOneException(){super("只有一个参数");}
}
class NoOprandException extends RuntimeException{
    NoOprandException(){super("没有参数");}
}
public class Application {
    static class ru{
       private String i;
     public void shuru(){
         System.out.println("请输入一个数");
         Scanner in=new Scanner(System.in);
         i=in.next();
        }
        public Integer chu(){
         int a=0;
            try {
                a = Integer.parseInt(i);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
         return a;
        }
    }
    static void he()throws OnlyOneException,NoOprandException{
        ru a=new ru();
        ru b=new ru();
        a.shuru();
        b.shuru();
        if (a==null||b==null){
            throw new OnlyOneException();
        }else if (a==null&&b==null){
            throw new NoOprandException();
        }
        Integer i=a.chu()+b.chu();
        System.out.println("两数和为"+i);
    }
    public static void main(String[] args) {
        he();
    }
}
