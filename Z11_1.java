package Zad;
import java.util.Scanner;
public class Z11_1 {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
	
		Uchenik[] uchenici = new Uchenik[5];
		
		for(int i=0; i<5; i++) {
	    System.out.println("Ime?");
	   String name1 = sc.nextLine();
		 System.out.println("Uspeh?");
		 double uspeh1 = sc.nextDouble();
		 sc.nextLine();
		 Uchenik uchenik = new Uchenik(name1,uspeh1);
		 uchenici[i] = uchenik;
		}
		printEligible(uchenici);
	}


public static boolean stipendiq(Uchenik u) {
 return u.getUspeh()>5.50;
}
 public static void printEligible(Uchenik[] uchenici) {
	 for(int i=0; i<5; i++) {
		 if(stipendiq(uchenici[i])) {
			 System.out.println(uchenici[i].getName());
		 }   
	 }
 }
}