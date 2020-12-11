package Zad;
import java.util.Date;
public class Z14 {
	public static void main(String[] args) {
Account ac = new Account();
ac.setId(1122);
ac.setBalance(20000);
Account.setYearInterestRate(0.045);
ac.withdraw(2500);
ac.deposit(3000);
System.out.println("Balance: " + ac.getBalance() + " \nLihva: "  + ac.getMonthlyInterest()
+"\nDate: "+ ac.getDateCreated());
	}
}
