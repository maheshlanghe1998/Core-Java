package assignment.day6;

import java.util.Scanner;

public class TwinPrimeNmber {

	public static void main(String[] args) {
		
		int num1,num2,count1=0,count2=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		num1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		num2=sc.nextInt();
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				count1++;
			}
		}
		
		for(int j=1;j<=num2;j++)
		{
			if(num2%j==0)
			{
				count2++;
			}
		}
		
		int x= Math.abs(num1-num2);
		
		if(count1==2 && count2==2 && x==2)
		{
			System.out.println("Its Twins prime number");
		}
		else
		{
			System.out.println("Its not Twins prime number");
		}
	}

}
