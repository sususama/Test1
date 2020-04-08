
import java.util.Scanner;
public class HELLOWORLD{
	StringBuffer sb1=new StringBuffer("Hello world!");
	StringBuffer sb2;
	StringBuffer sb3=new StringBuffer(10);
	public HELLOWORLD() {
		sb2=new StringBuffer("This is Java code.");
		sb3=new StringBuffer("Hello Java code.");
		String output="sb1:"+sb1.toString()+"\nlength="+sb1.length()+"\ncapacity="+sb1.capacity();
		sb1.replace(4,6,",");
		sb1.setLength(30);//
		System.out.println("After add sb1's length,");
		System.out.println("sb1's capacity is:"+sb1.capacity());
		sb1.ensureCapacity(60);
		System.out.println("Set sb1's capacity,");
		System.out.println("Now sb1's capacity is:"+sb1.capacity());
		System.out.println();
		System.out.println("sb2:"+sb2.toString());
		System.out.println("Char at 0 in sb2 is:"+sb2.charAt(0));
		System.out.println("Char at 9 in sb2 is:"+sb2.charAt(9));
		char ch[]=new char[sb2.length()];
		sb2.getChars(8,12,ch,0);
		System.out.println("The char form 8to 12 is:");
		for(int i=0;i<4;++i) {
			System.out.print("\""+ch[i]+"\",");
		}
		System.out.println("\n");
		System.out.println("sb3"+sb3.toString());
		System.out.println("After append string to sb3,");
		System.out.println("world.StringBufferDeom!");
		System.out.println("New sb3:\n"+sb3.toString());
		System.out.println("After set the 5th char,");
		sb3.setCharAt(10,'!');
		System.out.println("the new sb3:\n"+sb3.toString());
	}
		
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("a="+a+"\naµÄÆ½·½="+a*a);
		//HELLOWORLD na=new HELLOWORLD();
	}

}