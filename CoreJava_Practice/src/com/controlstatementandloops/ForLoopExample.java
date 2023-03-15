package com.controlstatementandloops;

public class ForLoopExample {

	public static void main(String[] args) 
	{
		
		//Example 1: print the numbers from 1-100.
		int n = 100;
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
		

		//Example 2: print the sum of natural number from 0-100.
		
		System.out.println("*****************");
		int sum=0;
		int num=100;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println(sum);

	}

}
