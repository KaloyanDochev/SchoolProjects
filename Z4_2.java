package Recursion;

public class Z4_2 {
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(7));
	}

	public static int xMethod(int n) {
	return xMethod(n,0);
	}
	public static int xMethod(int n, int rez) {
	   	 if (n == 1)
	   		 return rez + 1;
	   	 else
	   		 return xMethod(n - 1, n + rez);
	}

}
