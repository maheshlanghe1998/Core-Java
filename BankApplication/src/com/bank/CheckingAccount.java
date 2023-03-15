package com.bank;

public class CheckingAccount extends Account
{
	
	private double fees=2.5;
	
    public CheckingAccount(int accountNumber, double fees) {
		super(accountNumber);
		
		this.fees=fees;
	}

    
    @Override
	public void deposit(double amount) {
		if(amount>0)
		{
			balance+=amount;	
			System.out.printf("Amount %.2f deposited%n",amount);
			
			
			balance-=fees;
			System.out.printf("transation fees %.2f Applied%n",fees);
			System.out.printf("Current Balance is:  %.2f%n",balance);
		}
		else
		{
			System.out.println("Negative amount can not be deposited!");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0)
		{
			if((amount+fees)<=balance)
			{
				System.out.printf("Amount %.2f withdrawn from account%n",amount);
				balance-=amount;	

				balance-=fees;
				System.out.printf("transation fees %.2f Applied%n",fees);
				System.out.printf("Current Balance is:  %.2f%n",balance);
				
			}
		}
		else
		{
			System.out.println("Negative amount can not be Withdrawn!");
		}
		
	}
    
	
}
