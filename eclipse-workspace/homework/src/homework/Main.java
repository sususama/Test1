package homework;
import java.util.Scanner;
class Student {
	String name;
	String code;
	int result;
}
public class Main {	
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int size=0;
	Student[] stds=new Student[n];
	for(int i=0;i<n;i++) {
		Student t=new Student();
		t.name=in.next();
		t.code=in.next();
		t.result=in.nextInt();
		stds[size++]=t;
	}
	Student max=stds[0];
	Student min=stds[0];
	for(int i=0;i<size;i++)
		if(stds[i].result>max.result)
			max=stds[i];
	for(int i=0;i<size;i++)
		if(stds[i].result<min.result)
			min=stds[i];
	System.out.println(max.name+" "+max.code);
	System.out.println(min.name+" "+min.code);
	      }
	}
