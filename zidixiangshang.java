package zuoye;

public class zidixiangshang {
	public static int  lcs(char[] x,char[] y,int i,int j,int [][] bak) {
		for(int ii=0;ii<=i;ii++) {
			for(int jj=0;jj<=j;jj++) {
				if(ii==0||jj==0) bak[ii][jj]=0;
					else if(x[ii]==y[jj]) bak[ii][jj]= bak[ii-1][jj-1]+1;
					else
						bak[ii][jj]=Math.max(bak[ii-1][jj],bak[ii][jj-1]);
			}
		}
		return bak[i][j];
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
		System.out.println(lcs(c1,c2, c1.length-1, c2.length-1,bak));
	}
}
