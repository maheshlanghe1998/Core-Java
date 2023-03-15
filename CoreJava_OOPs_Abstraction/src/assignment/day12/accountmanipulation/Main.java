package assignment.day12.accountmanipulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the Customer Id: ");
		int customerId=sc.nextInt();
		System.out.println("Please Enter the Customer Name: ");
		String customerName=sc.next();
		System.out.println("Please Enter the Customer mail Id: ");
		String emailId=sc.next();
		
		Customer customerObj = new Customer(customerId, customerName, emailId);
		
		System.out.println("Please Enter Account Numner: ");
		 int accountNumber=sc.nextInt();
		 System.out.println("Please Enter Total Account bal: ");
         double balance=sc.nextDouble();
         
         System.out.println("Please Enter Minium bal: ");
         double minimumBalance=sc.nextDouble();
         
         System.out.println("Please Select Choice [Transaction or Customer Details]: ");
         String s=sc.next();
         if(s.equals("Transaction"))
         {
		SavingsAccount sa= new SavingsAccount(accountNumber, customerObj, balance,minimumBalance );
		System.out.println("Please enter the amount to withdraw: ");
		double amount=sc.nextDouble();
		
		if(sa.withdraw(amount))
		{
			System.out.println("Trasaction Successful! Thanks, For Visiting SBI Bank. ");
		}
		else 
		{
			System.out.println("Transaction Failed");
		}
      }
         else if(s.equals("CustomerDetails"))
         {
        	 customerObj.customerDetails();
         }
         
		
	}

}
