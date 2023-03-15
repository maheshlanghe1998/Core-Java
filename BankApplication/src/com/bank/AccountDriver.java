package com.bank;

import java.util.Scanner;

public class AccountDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Account accounts[]=new Account[10];
		
		int numAccounts=0;
		
		int choice;
		
		do {
			choice=menu(sc);
			System.out.println();
			
			if(choice==1)
			{
				accounts[numAccounts++]=createAccount(sc);
			}
			else if(choice==2)
			{
				doDeposit(accounts,numAccounts,sc);
				
			}
			else if(choice==3)
			{
				doWithdraw(accounts,numAccounts,sc);
				
			}
			else if(choice==4)
			{
				applyInterest(accounts,numAccounts,sc);
				
			}
			else
			{
				System.out.println("Please Provide Valid Choice.");
			}
		}while(choice!=5);
		
	}
	
	public static int accountMenu(Scanner sc)
	{
		
		System.out.println("Select Account Type: ");
		System.out.println("1.Checking Account");
		System.out.println("2.Saving Account");
		int choice;
		do {
			System.out.println("Enter the choice: ");
			choice=sc.nextInt();
			
		}while(choice<1 || choice>2);
		
		return choice;
		
		
	}
	
	public static int searchAccount(Account accounts[],int count,int accountNumber)
	{
		for(int i=0;i<count;i++)
		{
			if(accounts[i].getAccountNumber()==accountNumber) {
				return i;
			}
		}
		return -1;
		
	}
	public static void doDeposit(Account accounts[],int count,Scanner sc)
	{   
		System.out.println("\nPlease enter Account number");
		int accountNumber=sc.nextInt();
		
		int index =searchAccount(accounts,count,accountNumber);
		
		if(index>=0)
		{
		System.out.println("Enter the Deposit amount");
		double amount=sc.nextDouble();
		
		accounts[index].deposit(amount);
		}
		else
		{
			System.out.println("No account exist with Account Number"+accountNumber);
		}
	}
	
	public static void doWithdraw(Account accounts[],int count,Scanner sc)
	{   
		System.out.println("\nPlease enter Account number");
		int accountNumber=sc.nextInt();
		
		int index =searchAccount(accounts,count,accountNumber);
		
		if(index>=0)
		{
		System.out.println("Enter the Withdraw amount");
		double amount=sc.nextDouble();
		
		accounts[index].withdraw(amount);
		}
		else
		{
			System.out.println("No account exist with Account Number"+accountNumber);
		}
	}
	
	public static void applyInterest(Account accounts[],int count,Scanner sc)
	{   
		System.out.println("\nPlease enter Account number");
		int accountNumber=sc.nextInt();
		
		int index =searchAccount(accounts,count,accountNumber);
		
		if(index>=0)
		{
			if(accounts[index] instanceof SavingsAccount)
			{
				((SavingsAccount)accounts[index]).applyInterest();
			}
		
		}
		else
		{
			System.out.println("No account exist with Account Number"+accountNumber);
		}
	}
	
	public static Account createAccount(Scanner sc)
	{
		Account account =null;
		int choice=accountMenu(sc);
		
		System.out.println("Enter Account Number: ");
		int accountNumber=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter the transaction fee: ");
			double fee=sc.nextDouble();
			
			account =new CheckingAccount(accountNumber, fee);
			
		}
		else
		{
			System.out.println("Enter the interest rate : ");
			double ir=sc.nextDouble();
			
			account =new SavingsAccount(accountNumber, ir);
		}
		
		return account;
		
	}
	public static int menu(Scanner sc)
	{
		System.out.println("Bank Account Menu");
		System.out.println("1. Create New Account");
		System.out.println("2. Deposit Funds");
		System.out.println("3. Withdraw Funds");
		System.out.println("4. Apply Interest");
		System.out.println("5. Exit");
		
		int choice;
		do {
			System.out.println("Enter the choice: ");
			choice=sc.nextInt();
			
		}while(choice<1 || choice>4);
		
		return choice;
		
	}

}
