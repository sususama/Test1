package 补课;

public class Test1 {

	public static void main(String[] args) {
	Shuju a=new Shuju("张三",100,10);
	Shuju b=new Shuju("李四",110,9);
	a.setA(b);
	b.setA(a);
	a.attach();
	b.attach();
//	System.out.println(a.getName()+"打"+b.getName());
//	System.out.println(b.getName()+"受到"+a.getPower()+"点伤害");
//	System.out.println(b.getName()+"血量为"+(b.getBlood()-a.getPower()));
//	System.out.println(b.getName()+"打"+a.getName());
//	System.out.println(a.getName()+"受到"+b.getPower()+"点伤害");
//	System.out.println(a.getName()+"血量为"+(a.getBlood()-b.getPower()));
	}

}