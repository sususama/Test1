package zifuchuan���ύ;

import java.util.Scanner;

public class tongji {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String temp;
		int sum=0;
		StringBuffer sb =new StringBuffer();
		while(!(temp=in.nextLine()).equals("quit")) {
			sb.append(temp).append("\n");
		}
		String str=sb.toString();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='��' && str.charAt(i+1)=='��') {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
