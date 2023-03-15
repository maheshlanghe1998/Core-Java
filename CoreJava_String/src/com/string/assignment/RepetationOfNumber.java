package com.string.assignment;

import java.util.Scanner;

public class RepetationOfNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		System.out.println("Enter the key digit ");
		int digit=sc.nextInt();
		
		int count=0;
		while(num>0)
		{
			int x=num%10;
			if(x==digit)
			{
				count++;
			}
			
			num=num/10;
			
		}
		System.out.println(digit+" appears "+count+" times.");

	}

}
