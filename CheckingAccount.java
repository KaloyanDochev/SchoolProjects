package chast4;

import Zad.Account;

public class CheckingAccount extends Account{
 int balanceLimit;
 public CheckingAccount(int id, double balance, int balanceLimit){
		super(id,balance);
		this.balanceLimit = balanceLimit;
	}
 public String toString() {
		return super.toString() + "\nBalance limit: " + balanceLimit; 	
		}
}
