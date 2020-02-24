package buke;

public abstract class Person {
	private String name;
	public Person(String a) {
		this.name=a;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eat(Food c) {
		System.out.println(name+"³Ô"+c.getName());
	}
	public abstract void speak() ;
}
