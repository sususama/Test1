package ����;

public class NewStudent extends Stdent{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void study() {
		super.study();
		System.out.println("ѧϰ������");
		System.out.println("ѧϰ��Ӣ��");
		System.out.println("ѧϰ���");
	}
}
