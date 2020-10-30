package Zad;
import java.util.Scanner;
public class Z11_1 {
	public class Uchenik{
		String name;
		double uspeh;
		Uchenik(){}
		Uchenik(String ime1, double uspeh1){
			name= ime1;
			uspeh = uspeh1;
		}
		boolean stipendiq() {
			if(uspeh>=5.50) {return true;}
			else {return false;}
		}
	}
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
	
		Uchenik[] uchenici = new Uchenik[5];
		for(int i=0; i<5; i++) {
		 System.out.println("Ime?");
	     uchenici[i].name = sc.nextLine();
		 System.out.println("Uspeh?");
		 uchenici[i].uspeh = sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
		if	(uchenici[i].stipendiq()) {System.out.println(uchenici[i].name);};
		}
	}
}
