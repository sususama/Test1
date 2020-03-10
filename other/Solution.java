package LeetCode.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int [][] aa={{1,3},{2,6},{8,10},{15,18}};
        int [][]bb=merge(aa);
        System.out.println(bb);

    }
    public static int[][] merge(int[][] intervals) {
//        int[][] total=new int [intervals.length][2];
//        for (int i=0,j=0;i<intervals.length;i++,++j){
//            if (i==(intervals.length-1)){
//                total[j]=intervals[i];
//                continue;
//            }
//            if (intervals[i][1]>=intervals[i+1][0]){
//                total[j][0]=intervals[i][0];
//                total[j][1]=intervals[i+1][1];
//                i++;
//                continue;
//            }
//            total[j]=intervals[i];
//        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });
        int left = intervals[0][0], right = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            // 由于排过序了，则intervals[i][0] 一定不小于left，所以只需要比较intervals[i][0]和right的大小关系
            if (intervals[i][0] <= right) {
                right = Math.max(right, intervals[i][1]);
            } else {
                // 无重叠部分，先把上一段区间加到list中
                list.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        list.add(new int[]{left, right});
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
