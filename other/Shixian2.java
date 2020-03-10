package edu;

import java.util.Scanner;

public class Shixian2 implements Students,Teacher {
    private String name;
    private String sex;
    private int age;
    private int monys;
    private int gongzis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
public void shouru(){
        if (this.gongzis-this.monys<2000){
            System.out.println("需要贷款");
        }
}
public void shixian(){
    Scanner in=new Scanner(System.in);
    System.out.println("请输入年龄");
        this.setAge(in.nextInt());
    System.out.println("请输入工资");
        this.setGongzi(in.nextInt());
    System.out.println("请输入学费");
        this.setMony(in.nextInt());
    System.out.println("请输入姓名");
        this.setName(in.next());
    System.out.println("请输入性别");
        this.setSex(in.next());
        this.shouru();
}
public void shuchu(){
    System.out.println("姓名："+this.getName());
    System.out.println("性别："+this.getSex());
    System.out.println("年龄："+this.getAge());
    System.out.println("工资："+this.getGongzi());
    System.out.println("学费："+this.getMony());
}
    @Override
    public void setMony(int i) {
        this.monys=i;
    }

    @Override
    public int getMony() {
        return this.monys;
    }

    @Override
    public void setGongzi(int i) {
        this.gongzis=i;
    }

    @Override
    public int getGongzi() {
        return this.gongzis;
    }
}
