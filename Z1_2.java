package Recursion;

//public static void main(String[] args) {
//  	 xMethod(1234567);
//}
//
//public static void xMethod(int n) {
//  	 if (n > 0) {
//  		 System.out.print(n % 10);
//  		 xMethod(n / 10);
//  	 }
//}


public class Z1_2 {
	public static void main(String[] args) {
	   	long n = 1234567;
	   	while(n>0) {
	   		System.out.print(n%10);
	   		n = n/10;
	   	}
	}

}
