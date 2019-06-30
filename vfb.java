package zhengguize;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str="google";
		for(int i=0;i<str.length();i++) {
			String s=String.valueOf(str.charAt(i));
			Pattern p=Pattern.compile(s);
			Matcher m=p.matcher(str);
			int count=0;
			while(m.find()) {
				count++;
				if(count>1)
					break;
			}
			if(count==1) {
				System.out.println(s);
				break;
			
			}
		
		}
		}
		}

	


