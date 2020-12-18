package chast4;

import Zad.Account;

public class Z19_2 {
	 public static void main(String[] args) {
Account acc = new Account(1, 2500);
CheckingAccount chacc = new CheckingAccount(2, 50, 100);
SavingsAccount sacc = new SavingsAccount(3, 2500);

acc.toString();
chacc.toString();
sacc.toString();
	 }
}
