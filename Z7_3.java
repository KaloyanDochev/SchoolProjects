package Zad;
import java.util.Scanner;
public class Z7_3 {
	public static void main (String[] args) {
		System.out.println("Write number between 1 and 15: ");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=0; i<num; i++){
			for(int y=num-i; y>0; y--) {
				System.out.print(y + " ");
			}
			for(int x=2; x<num+1-i; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
	}
}


