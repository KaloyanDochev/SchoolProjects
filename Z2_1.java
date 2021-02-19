package Recursion;

public class Z2_1 {
	public static void main(String[] args) {
		System.out.println(odd(23));
		System.out.println(even(23));
		}
	public static boolean odd (int n) {
		if(n==0) {return false;}
		else if(n==1) {return true;}
		else {return odd(n-2);}
	}
	public static boolean even (int n) {
		if(n==0) {return true;}
		else if(n==1) {return false;}
		else {return even(n-2);}
	}
}
