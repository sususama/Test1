package 补课;

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
		System.out.println("学习高数！");
		System.out.println("学习大英！");
		System.out.println("学习大物！");
	}
}
