import java.util.Scanner;

public class Main extends luqu {

	public static void main(String[] args) {
		luqu [] a=new  luqu [100] ;
		luqu c=new luqu();
		Scanner in=new Scanner(System.in);
		System.out.println("������ѧ������");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = new luqu();
			System.out.println("����������ѧ�������������ţ��ɼ�");
			a[i].setName();
			a[i].setNumber();
			a[i].setCehngji();
		}
		for(int i=0;i<n;i++) {
			if(c.shifou(a[i])==0){
				System.out.println("�ÿ���δ��¼ȡ");
		}else 
			System.out.print("�ÿ����ѱ�¼ȡ������ϢΪ��\n");
			System.out.println("���� "+a[i].getName()+"\n���� "+a[i].getNumber()+"\n�ۺϳɼ� "+a[i].getCehngji());
	}
	}
}


