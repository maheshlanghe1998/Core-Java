package assignment.day5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		char ch;
		do {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num= sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
			if(num%i==0)
			{
		     count++;
			}
			}
			
			if(count==2)
			{
				System.out.println("The number is prime number");
			}
			else 
			{
				System.out.println("The number is not prime number");
			}
		}
		else
		{
			System.out.println("Entered Number is not prime number");
		}
		System.out.println("Do you want to continue? yes or no");
		 ch=sc.next().charAt(0);
		
	}while(ch=='Y'||ch=='y');
	}

}
