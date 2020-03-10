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
	public int getBalance() {//查询
		return balance;
	}
	public void setBalance(int balance) {//设定最初余额
		this.balance = balance;
	}
	public void deposit(int temp) {//存款
		this.balance+=temp;
		this.curday+=temp;
		System.out.println("今日存款数："+curday+"余额为："+this.balance);
	}
	public int take() {//取款
		System.out.println("请输入取款数");
		int temp=in.nextInt();
		if(temp<=this.balance) {
			this.balance-=temp;
			System.out.println("成功取款");
		}else {
			System.out.println("取款失败，余额不足，余额仅有"+this.balance);
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
		//设置地址
		a.setJiedao("A街道");
		a.setMenpaihao(66);
		a.setSheng("陕西省");
		a.setShi("西安市");
		a.setBalance(5000);//设置账户初始为5000元
		a.setName("张三");
		System.out.println("账户余额为"+a.getBalance());//查询账户余额
		a.take();//取款大于5000
		a.take();//取款小于5000
		System.out.println("账户余额为"+a.getBalance());
		a.deposit(2000);//存款
		a.deposit(1000);//存款
	}

}
