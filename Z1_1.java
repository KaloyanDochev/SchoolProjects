package Recursion;

//public static void main(String[] args) {
//  	 System.out.println("Sum is " + xMethod(5));
//}
//
//public static int xMethod(int n) {
//  	 if (n == 1)
//  		 return 1;
//  	 else
//  		 return n + xMethod(n - 1);
//}


public class Z1_1 {
	public static void main(String[] args) {
	   int n=5;
	   int sum=0;
	   for(int j=1; j<=n; j++) {
		   sum += j;
	   }
	   System.out.println("Sum is " + sum );
	}
}
