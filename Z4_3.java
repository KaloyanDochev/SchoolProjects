package Recursion;

public class Z4_3 {
	public static void main(String[] args) {
		System.out.println(powRecursive(3,4));
	}
	 public static int powRecursive( int x, int n ) {
      return powRecursive(x,n,1);
       }
    public static int powRecursive( int x, int n , int rez) {
      	 if (n == 0) {
      		 return rez;
      	 }
      	 
      	 return powRecursive(x, n - 1, rez*x );
       }

}
