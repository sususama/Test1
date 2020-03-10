package buke;

public class Test {

	public static void main(String[] args) {
		Student s=new Student();
		s.study();
		College c=new College();
		c.study();
		s=c;
		s.study();
	}

}
