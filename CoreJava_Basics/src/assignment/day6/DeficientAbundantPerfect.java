package assignment.day6;

import java.util.Scanner;

public class DeficientAbundantPerfect {

	public static void main(String[] args) {
		
		//************************Notes for Revision**********************************//
		
		//Deficient Number : the sum of the factors of number is less than that number
		//then it is called as deficient number
		
		//Abundant Number : the sum of the factors of number is greater than that number
		//then it is called as Abundant Number
		
		//Perfect Number : the sum of the factors of number is equal than that number
		//then it is called as perfect number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
				
			}
		}
		
		if(sum<n)
		{
			System.out.println("Deficient Number");
		}
		else if(sum>n)
		{
			System.out.println("Abundant Number");
		}
		else if(sum==n)
		{
			System.out.println("Perfect number");
		}

	}

}
