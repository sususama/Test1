package edu;

public class replace {
    public static String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                str.replace(i,i+1,"%20");
            }
        }
        String s=str.toString();
        return s;
    }
    public static void main(String[] args) {

    }
}
