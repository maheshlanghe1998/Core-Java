package assignment.day6;

import java.util.Scanner;

public class AmicableNumbers {
	
	//Amicable number: sum1==num2 & sum2==num1.
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int num1,num2,sum1=0,sum2=0;
		System.out.println("Please enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Please enter the second number: ");
		num2=sc.nextInt();
		
		for(int i=1;i<num1;i++)
		{
			if(num1%i==0)
			{
			   sum1+=i;
			}
			
		}
		
		for(int j=1;j<num2;j++)
		{
			if(num2%j==0)
			{
			   sum2+=j;
			}
			
		}
		if((sum1==num2) && (sum2==num1))
			
		{
		   	System.out.println("Its is amicable number");
		}
		else
		{
			System.out.println("Its not amicable number");
		}
	}

}
