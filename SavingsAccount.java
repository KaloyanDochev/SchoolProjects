package projects;

public class SavingsAccount {
  public String name;
  public double balance;
  public double interestRate = 0.1;
  
  public void deposit(double sumToDeposit){
	  balance += sumToDeposit;
  }
  
  public void withdraw(double sumToWithdraw){
	  if(sumToWithdraw<0 || sumToWithdraw>balance){
		  System.out.println("Error.");
		  return;
	  }
	  balance -= sumToWithdraw;
	  System.out.println("Successful withdraw of "+ sumToWithdraw);
  }
  
}
