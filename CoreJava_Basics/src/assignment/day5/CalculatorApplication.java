package assignment.day5;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// Calculator application using switch cases and do-while loop.


	       char ch;
	   	do {
	   		Scanner sc = new Scanner(System.in);
			int a, b;
			System.out.println("Enter The 1st Value");
			a = sc.nextInt();
			System.out.println("Enter The 2nd Value");
			b = sc.nextInt();

			System.out.println("Please Enter Your Choice: ");
			char choice = sc.next().charAt(0);
	       
	        
    switch (choice) 
    {
   
		
		case '+': 
		{
			int A = a + b;
			System.out.println("Addition is: " + A);
		}
			break;
		case '-': 
		{
			int S = a - b;
			System.out.println("Substraction is: " + S);

		}
			break;

		case '*': 
		{
			int S = a * b;
			System.out.println("Multiplication is: " + S);

		}
			break;

		case '/': 
		{
			int S = a / b;
			System.out.println("Division is: " + S);

		}
			break;

			
		case '%': 
		{
			int S = a % b;
			System.out.println("Modulus is: " + S);

		}
			break;
			
		default: 
		{
			System.out.println("Invalid Choice");
		}
		 
		}
    System.out.println("Do you want to continue? y or n : ");
    ch = sc.next().charAt(0);
    }
    while(ch=='y'||ch=='Y');
	
	   	System.out.println("End of program");
	}

}
