package exceptionhandling.unchecked.practice;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String str)
	{
		super(str);
	}
}
public class Vote 
{  
	public static void voteElibility(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not Eligible for vote");
		}
		else 
		{
			System.out.println("You are eligible for Vote");
		}
	}

	public static void main(String[] args) throws InvalidAgeException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		
		voteElibility(age);
		
		

	}

}
