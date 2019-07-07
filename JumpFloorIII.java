package edu;

public class JumpFloorIII {
    public static int JumpFloorII(int target) {
        if(target==1)return 1;
        else return 2*JumpFloorII(target-1);
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(2));
    }
}
