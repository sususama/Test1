package edu.xatu.springmvc.exception;

public class MyException extends RuntimeException{
    public MyException(){
        System.out.println("我们自己的异常");
    }
    public MyException(String s){
        System.out.println(s);
    }
}
