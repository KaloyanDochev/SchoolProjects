package Recursion;
//iteraciq
import java.util.Scanner;
public class Z1_31 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("N =");
		 int n = sc.nextInt();
		 int rez = 1;
		 for(int j=1; j<=n;j++) {
			 rez *= 2;
		 }
		 System.out.println(rez);
	}
}
