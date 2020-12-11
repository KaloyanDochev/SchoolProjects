package OOP;

import Zad.Account;
import java.util.Scanner;

public class Z16_1 {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Account acc[] = new Account[10];
		for(int i=0; i<10; i++) {
			 Account account = new Account((i+1), 100);
			 acc[i] = account;
			}
		
		int choice = 4;//in main menu
		System.out.println("Enter an id: ");
		int uid= sc.nextInt();
		
		int suma = 0; //withdraw/deposit
		
		while(true) {
//			if(choice ==4) {
//				System.out.println("Enter an id: ");
//			}
//			else {System.out.println("Enter a choice");}
			
		   System.out.println("Main menu "
		   		+ "\n1: check balance "
		   		+ "\n2: withdraw "
		   		+ "\n3: deposit "
		   		+ "\n4: exit"
            );
		   
		   System.out.println("Enter a choice: ");
		   choice = sc.nextInt();
		   
		   switch(choice){
		   case 1: System.out.println("The balance is "+ acc[uid].getBalance());break;
		   case 2: System.out.println("Enter an amount to withdraw: ");
		   suma = sc.nextInt();
		   acc[uid].withdraw(suma);break;
		   case 3: System.out.println("Enter an amount to deposit: ");
		   suma = sc.nextInt();
		   acc[uid].deposit(suma);break;
		   case 4: System.out.println("Enter an id: ");
		   uid= sc.nextInt();break;
		   default: System.out.println("Invalid choice!");
		   }
		 }
	}

}
