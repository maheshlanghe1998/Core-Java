package assignment.day12.accountmanipulation;

public class SavingsAccount extends Account
{
	private double minimumBalance;
	
	public SavingsAccount(int accountNumber, Customer customerObj, double balance,double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance=minimumBalance;
		
	}

	@Override
	public boolean withdraw(double amount) {
		if((balance-amount)>minimumBalance)
		{   System.out.println("Total Balance: "+balance);
			balance =balance-amount;
			System.out.println("Withdraw Amount: "+amount);
			System.out.println("Available Balance: "+balance);
			return true;
			
		}
		return false;
	}


	
}
