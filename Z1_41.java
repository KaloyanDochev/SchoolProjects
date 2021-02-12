package Recursion;
import java.util.Scanner;
public class Z1_41 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("N =");
		 int n = sc.nextInt();
		 System.out.print("X =");
		 double x = sc.nextDouble();
		 int rez = 1;
		 for(int j=1; j<=n;j++) {
			 rez *= x;
		 }
		 System.out.println(rez);
	}
}

