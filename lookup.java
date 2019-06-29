package zuoye;

import java.util.Scanner;

public class lookup {
	public static int  lcs(char[] x,char[] y,int i,int j,int [][] bak) {
		if(bak[i][j]!=-1)return bak[i][j];
		if(i==0||j==0)
		return bak[i][j]=0;
		else if(x[i]==y[j]) {
			return lcs(x,y,i-1,j-1,bak)+1;
		}
		else
			return Math.max(lcs(x,y,i-1,j,bak), lcs(x,y,i,j-1,bak));
		
	}

	public static void main(String[] args) {
		String x="ABCBDAB";
		String y="BDCABA";
//		Scanner in=new Scanner(System.in);
//		System.out.println("请输入父集合");
//		x=in.nextLine();
//		System.out.println("请输入子集合");
//		y=in.nextLine();
		char [] c1=new char[x.length()+1];
		char [] c2=new char[y.length()+1];
		char[] t1=x.toCharArray();
		char [] t2=y.toCharArray();
		c1[0]=(char)0;
		c2[0]=(char)0;
		for(int i=0;i<t1.length;i++) {
			c1[i+1]=t1[i];
		}
		for(int i=0;i<t2.length;i++) {
			c2[i+1]=t2[i];
		}
		int [] [] bak=new int [c1.length][c2.length];
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				bak[i][j]=-1;
			}
		}
		System.out.println(lcs(c1,c2, c1.length-1, c2.length-1,bak));
	}
}
