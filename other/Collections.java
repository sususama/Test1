package 归并排序法;

import java.util.List;

public class Collections {
    public static void sort(List list){
        int l=0;
        int r=list.size()-1;
        devide(list,l,r);
        //归并
    }
    private static void devide(List list, int left, int right){
        int mid=(left+right)/2;
        if (left<right){
            //归
            devide(list,left,mid);
            devide(list,mid+1,right);
            //并
            merge(list,left,mid,mid+1,right);
        }
    }

    private  static void merge(List list, int left, int mid, int i, int right) {
        Object[] temp=new Object[list.size()];
        int index=left;
        int ls=left,le=mid;//左边的起始索引和终止索引
        int rs=i,re=right;//右边的起始索引和终止索引
        //排完一边的所有数组放入临时数组
        while (ls<=le&&rs<=re){
            Comparable o1=(Comparable)list.get(ls);//Comparable是用来排序的，大于返回正数，小于返回负数等于返回0
            Comparable o2=(Comparable)list.get(rs);//Comparable是什么
            if(o1.compareTo(o2) ==  1){
                temp[index]=o1;
                ls++;
            }else {
                temp[index]=o2;
                rs++;
            }
            index++;
        }
        //判断左边是否有剩余
        if (ls<=le){
            for(int j=ls;j<=le;j++){
                temp[index++]=list.get(j);
            }
        }
        if (rs<=re){
            for(int j=rs;j<=re;j++){
                temp[index++]=list.get(j);
            }
        }
        for(int j=left;j<=right;j++){
            list.set(j,temp[j]);
        }
    }
}
