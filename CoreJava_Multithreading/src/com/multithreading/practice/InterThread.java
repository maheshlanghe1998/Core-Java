package com.multithreading.practice;

class Customer
{

	 int amount=10000;

	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw ");
		if(this.amount<amount)
		{
		   System.out.println("less balance waiting for deposit");	
		
		try
		{
			wait();
			
		}
		catch(Exception e)
		{
			
		}
		}
		
		this.amount-=amount;
		System.out.println("Withdraw completed");
		
		
		
	}

	synchronized void deposit(int amount) {
		
		System.out.println("going to deposit");
		this.amount +=amount;
		System.out.println("deposit completed");
		notify();
		
	}
	
}

public class InterThread {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
				
			}
			
		}.start();
		
		new Thread()
		{
			public void run()
			{
				c.deposit(15000);
				
			}
			
		}.start();


	}

}
