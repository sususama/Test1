import java.util.Scanner;

class gongneng extends dizi{
	private String number;
	private String name;
	private int balance;
	private int curday=0;
	Scanner in=new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {//��ѯ
		return balance;
	}
	public void setBalance(int balance) {//�趨������
		this.balance = balance;
	}
	public void deposit(int temp) {//���
		this.balance+=temp;
		this.curday+=temp;
		System.out.println("���մ������"+curday+"���Ϊ��"+this.balance);
	}
	public int take() {//ȡ��
		System.out.println("������ȡ����");
		int temp=in.nextInt();
		if(temp<=this.balance) {
			this.balance-=temp;
			System.out.println("�ɹ�ȡ��");
		}else {
			System.out.println("ȡ��ʧ�ܣ����㣬������"+this.balance);
		}
		return 0;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
public class yinhang {

	public static void main(String[] args) {
		gongneng a=new gongneng();
		//���õ�ַ
		a.setJiedao("A�ֵ�");
		a.setMenpaihao(66);
		a.setSheng("����ʡ");
		a.setShi("������");
		a.setBalance(5000);//�����˻���ʼΪ5000Ԫ
		a.setName("����");
		System.out.println("�˻����Ϊ"+a.getBalance());//��ѯ�˻����
		a.take();//ȡ�����5000
		a.take();//ȡ��С��5000
		System.out.println("�˻����Ϊ"+a.getBalance());
		a.deposit(2000);//���
		a.deposit(1000);//���
	}

}
