package ����;

public class Shuju {
	private Shuju a;
	public Shuju getA() {
		return a;
	}
	public void setA(Shuju a) {
		this.a = a;
	}
	private String name;
	private int blood;
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public Shuju(String name,int blood,int power)
	{
		this.name=name;
		this.blood =blood;
		this.power=power;
	}
	public void attach() {
		System.out.println(this.getName()+"��"+this.a.getName());
		System.out.println(this.a.getName()+"�ܵ�"+this.getPower()+"���˺�");
		System.out.println(this.a.getName()+"Ѫ��Ϊ"+(this.a.getBlood()-this.getPower()));
	}
}
