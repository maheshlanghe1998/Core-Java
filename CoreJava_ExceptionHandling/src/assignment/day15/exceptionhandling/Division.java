package assignment.day15.exceptionhandling;

import java.util.Scanner;

public class Division {

	public String divideTwoNumbers(int number1,int number2)
	{
		try
		{
			int number3= number1/number2;
			System.out.println("The answer is "+number3+". ");
			
			
		}catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible. ");
		}
		
		
		finally
		{
			System.out.println("Thanks for using the application.");
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter the Numbers: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			
			Division d = new Division();
			d.divideTwoNumbers(a, b);
	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
