package Recursion;

import java.util.Scanner;

public class Z1_32 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("N =");
		 int n = sc.nextInt();
		 System.out.println(Stepen(n));
	}
	
	public static int Stepen(int a) {
		if(a==0) {return 1;}
		else {return 2*Stepen(a-1);}
	}
}
