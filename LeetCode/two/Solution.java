package LeetCode.two;

public class Solution {
    public static void main(String[] args) {
        int[] nums={ 1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int total=0;
        //算出总和
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            int temp=0,temp1=0;
            for (int j=0;j<i;j++){
                if (j==0){
                    temp=0;
                }
                temp+=nums[j];
            }
            temp1=total-temp-nums[i];
            if (temp==temp1){
                return i;
            }
        }
        return -1;
    }
}
