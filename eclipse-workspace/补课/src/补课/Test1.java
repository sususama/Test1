package ����;

public class Test1 {

	public static void main(String[] args) {
	Shuju a=new Shuju("����",100,10);
	Shuju b=new Shuju("����",110,9);
	a.setA(b);
	b.setA(a);
	a.attach();
	b.attach();
//	System.out.println(a.getName()+"��"+b.getName());
//	System.out.println(b.getName()+"�ܵ�"+a.getPower()+"���˺�");
//	System.out.println(b.getName()+"Ѫ��Ϊ"+(b.getBlood()-a.getPower()));
//	System.out.println(b.getName()+"��"+a.getName());
//	System.out.println(a.getName()+"�ܵ�"+b.getPower()+"���˺�");
//	System.out.println(a.getName()+"Ѫ��Ϊ"+(a.getBlood()-b.getPower()));
	}

}