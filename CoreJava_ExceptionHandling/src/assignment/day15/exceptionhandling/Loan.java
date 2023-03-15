package assignment.day15.exceptionhandling;

import java.util.Scanner;

class LoanEligibilty extends Exception
{
	private static final long serialVersionUID = 1L;

	LoanEligibilty(String s)
	{
		super(s);
	}
}

public class Loan {

	int id;
	boolean isEligible;
	
	public void checkEligibility(int salary) throws LoanEligibilty
	{
	    if(salary<=0)
	    {
	    	throw new LoanEligibilty("You are not Eligible to loan");
	    	
	    }
	    else if(salary<20000)
		{
		  System.out.println("Not Eligible to loan");
		}	
		else if(salary>=20000)
		{
			System.out.println("Eligible to get loan");
		}
		
		
	}
	
	public static void main(String[] args) throws LoanEligibilty {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the salary : ");
		int sal = sc.nextInt();
		
         Loan l=new Loan();
         l.checkEligibility(sal);
	}

}
