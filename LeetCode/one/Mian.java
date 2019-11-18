package LeetCode.one;

public class Mian {
    public static void main(String[] args) {
        String a=countAndSay(4);
        System.out.println(a);
    }
    public static String countAndSay(int n){
        String result="1";
        for (int i=1;i<n;i++){
            result=countAndSayList(result);
        }
        return result;
    }
    public static String countAndSayList(String result){
        StringBuilder list=new StringBuilder();
        int i=0;
        int num=0;
        for (;i<result.length();i++){
            if (i==0 || result.charAt(i)==result.charAt(i-1)){
                num++;
            }else {
                list.append(num).append(result.charAt(i-1));
                num=1;
            }
            if (i==result.length()-1){
                list.append(num).append(result.charAt(i));
            }
        }
        return list.toString();
    }
}
