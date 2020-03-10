package buke;

public class TT {
	public int f(int n) {
		if(n==1) return 1;
		return n*f(n-1);
	}
	public static void main(String[] args) {
		System.out.println(new TT().f(5));
	}
}
