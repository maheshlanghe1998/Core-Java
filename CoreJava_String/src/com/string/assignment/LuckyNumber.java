package com.string.assignment;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the car no:");
		int carno=sc.nextInt();
		
		int sum=0;
		
		if(carno>=1000 && carno<10000)
		{
			while(carno > 0) 
			{
			int digit = carno%10;
			
			sum=sum+digit;
			
			carno=carno/10;
			}
			if(sum%3==0 || sum%5==0 || sum%7==0)
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry its not my lucky number");
		    }
		}
	    else
		{
			System.out.println(carno+" is not a valid car number");
		}
		
	}

}
