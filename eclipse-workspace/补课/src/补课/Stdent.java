package ²¹¿Î;

public class Stdent {
	private int id;
	private String name;
	private char sex;
	public String toString() {
		return "["+id+","+name+","+sex+"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void study() {
		System.out.println("Ñ§Ï°£¡");
	}
}