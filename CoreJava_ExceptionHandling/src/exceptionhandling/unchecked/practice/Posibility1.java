package exceptionhandling.unchecked.practice;


import java.util.Scanner;

public class Posibility1 {

	public static void divide()
	{
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter 1st Number: ");
			int a=sc.nextInt();
			System.out.println("Enter 1st Number: ");
			int b=sc.nextInt();
			
			System.out.println("Division is: "+a/b);
			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			
			System.out.println(ae.getMessage());
		}
		
		
		System.out.println("remaining code...");

	}
	
	public static void main(String[] args) {
		
		divide();
		
	}

}
