package edu;

public class Finds {
    public boolean Find(int target, int [][] array) {
        //每一行都按照从左到右递增的顺序排序
        // 每一列都按照从上到下递增的顺序排序
        int right=0,lower=array[0].length-1;
        while (lower>=0&&right<array.length){
            if (array[right][lower]==target){
                return true;
            }else
            if (target<array[right][lower]){
                lower--;
            }else
            if (target>array[right][lower]){
                right++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
