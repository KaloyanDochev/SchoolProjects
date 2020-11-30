package Zad;
import java.util.Date;
public class Account {

	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	private static Date dateCreated = new Date();
	Account(){}
	Account(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getYearInterestRate() {
		return yearInterestRate;
	}
	public static void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
	void withdraw(int suma) {
		balance -= suma;
	}
	void deposit(int suma) {
		balance += suma;
	}
	double getMonthlyInterestRate () {
		return  (balance*yearInterestRate) / 12;
	}
	double getMonthlyInterest () {
		return  (double)yearInterestRate / 12;
	}
}
