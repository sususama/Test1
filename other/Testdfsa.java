package zifuchuanÒÑÌá½»;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str =in.nextLine();
		if(str.length()>20) {
			System.out.println(str.substring(0, 17).toUpperCase()+"...");
		}else
			System.out.println(str);
		String t="       askdjhakjshdk     ";
		System.out.println(t.trim());
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		byte[] aa=t.getBytes();
		System.out.println(new String(aa));
		}
	
}
