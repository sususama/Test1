package edu.xatu;

import java.util.Scanner;

public class Method {
    private double ag;
    Scanner in=new Scanner(System.in);
    public void calculation(Flower[] a){
        int total=0,max=0,min=a[0].getPrice();
        double average=0.0;
        for (int i=0;i<5;i++){
            average+=a[i].getPrice();
            total+=(a[i].getNumber()*a[i].getPrice());
            if (max<a[i].getPrice()) {
                max = a[i].getPrice();
            }else
            if (min>a[i].getPrice()) {
                min = a[i].getPrice();
            }
        }
        average=average/5;
        this.ag=average;
        System.out.println("它的总价格："+total+"平均价格："+average+"最高价："+max+"最低价："+min);
    }//统计价格
    public void sort(Flower[] a){
        int leng=a.length-1;
        for(int i =0;i<leng;i++) {
            for(int j=0;j<leng-i;j++) {
                if (a[j].getPrice()<a[j+1].getPrice()) {
                    Flower x = null;
                    x=a[j];
                    a[j]=a[j+1];
                    a[j+1]=x;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }//排序
    public void statistics(Flower[] a){
        int high=0,low=0;
        for (int i=0;i<a.length;i++){
            if (a[i].getPrice()<this.ag)
                low+=a[i].getNumber();
            if (a[i].getPrice()>this.ag)
                high+=a[i].getNumber();
        }
        System.out.println("高于平均价格的数量："+high+"低于平均价格的数量："+low);
    }//统计数量
    public void query(Flower[] a){
        System.out.println("请输入要查询的花的名字");
        String name=in.nextLine();
        for (int i=0;i<a.length;i++){
            if (a[i].getName().equals(name))
                System.out.println("它的价格为："+a[i].getPrice()+"它的数量为："+a[i].getNumber());
        }
    }//查询
}
