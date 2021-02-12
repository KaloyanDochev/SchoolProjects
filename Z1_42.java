package Recursion;

import java.util.Scanner;

public class Z1_42 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("N =");
		 int n = sc.nextInt();
		 System.out.print("X =");
		 double x = sc.nextDouble();
		 System.out.println(Stepen(n,x));
	}
	
	public static double Stepen(int a , double x) {
		if(a==0) {return 1;}
		else {return x*Stepen(a-1,x);}
	}
}
