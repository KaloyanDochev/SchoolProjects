package Recursion;

public class Z2_2 {
	static String rezultat = "";
	public static void main(String[] args) {
		System.out.println(dec2Bin(266));
		}
	public static String dec2Bin (int value) {
		if(value == 1) {return "1" + rezultat;}
		else {
			rezultat = value%2 + rezultat;
			return dec2Bin(value/2);
		}
	}
}
