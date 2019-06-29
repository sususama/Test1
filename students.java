import java.util.Scanner;

public class students extends school {
	private String name;
	private String number;
	private int chengji;
//	private Scanner in=new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName() {
		Scanner in=new Scanner(System.in);
		this.name =in.nextLine();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber() {
		Scanner in=new Scanner(System.in);
		this.number =in.nextLine();
	}
	public int getCehngji() {
		return chengji;
	}
	public void setCehngji() {
		Scanner in=new Scanner(System.in);
		this.chengji = in.nextInt();//
	}
}
