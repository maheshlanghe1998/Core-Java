package com.bank;

public abstract class Account 
{
	private int accountNumber;
	protected double balance;
	
	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
		balance = 0;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
}
