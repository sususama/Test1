import java.util.Scanner;

public class Main extends luqu {

	public static void main(String[] args) {
		luqu [] a=new  luqu [100] ;
		luqu c=new luqu();
		Scanner in=new Scanner(System.in);
		System.out.println("请输入学生数量");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = new luqu();
			System.out.println("请依次输入学生的姓名，考号，成绩");
			a[i].setName();
			a[i].setNumber();
			a[i].setCehngji();
		}
		for(int i=0;i<n;i++) {
			if(c.shifou(a[i])==0){
				System.out.println("该考生未被录取");
		}else 
			System.out.print("该考生已被录取，其信息为：\n");
			System.out.println("姓名 "+a[i].getName()+"\n考号 "+a[i].getNumber()+"\n综合成绩 "+a[i].getCehngji());
	}
	}
}


