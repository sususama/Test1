package ²¹¿Î;

public class Test2 {

	public static void main(String[] args) {
		NewStudent a = new NewStudent();
		NewStudent b = new NewStudent();
		a.setId(23442);
		a.setName("zhangsan");
		a.setSex('M');
		b.setId(234565);
		b.setName("lisi");
		b.setSex('W');
		a.study();
	}

}
