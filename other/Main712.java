package edu.xatu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Flower [] a=new Flower[5];
        Method method =new Method();
        Interface inc=new Interface();
        Scanner in=new Scanner(System.in);
//        for (int i=0;i<5;i++){
//            System.out.println("请依次输入花的名称，价格，数量");
//            Flower x=new Flower(in.next(),in.nextInt(),in.nextInt());
//            a[i]=x;
//        }
        /*
        * 为了方便测试，我直接给赋值
        */
        a[0]=(new Flower("菊花",27,35));
        a[1]=(new Flower("兰花",25,37));
        a[2]=(new Flower("梅花",22,67));
        a[3]=(new Flower("紫罗兰",35,62));
        a[4]=(new Flower("风信子",56,23));
        while (true) {
            System.out.println("\t\t\t\t\t\t****************************************");
            System.out.println("\t\t\t\t\t\t请输入需要选择的功能");
            System.out.println("\t\t\t\t\t\t1:统计并输出鲜花的总价格,平均价格,最高价和最低价");
            System.out.println("\t\t\t\t\t\t2:按照价格降序排序并输出");
            System.out.println("\t\t\t\t\t\t3:统计高于平均价格和低于平均价格的鲜花数量");
            System.out.println("\t\t\t\t\t\t4:输入鲜花名称查询商品的价格和数量");
            System.out.println("\t\t\t\t\t\t****************************************");
            int i=in.nextInt();
            if (i==1)
                method.calculation(a);
            else if (i==2)
                method.sort(a);
            else if (i==3)
                method.statistics(a);
            else if (i==4)
                method.query(a);
            System.out.println("\t\t\t\t****************************************");
            System.out.println("\t\t\t\t继续使用菜单请输入0");
            System.out.println("\t\t\t\t****************************************");
            i=in.nextInt();
            if (i!=0)
                break;
        }
    }
}