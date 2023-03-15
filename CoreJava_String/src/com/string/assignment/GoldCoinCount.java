package com.string.assignment;

import java.util.Scanner;

public class GoldCoinCount {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age =sc.nextInt();
		
		int coin=0;
		if(age>0)
		{    
			for(int i=1;i<=age;i++)
			{
				coin =(int) Math.pow(age, 3);

			}
			
			System.out.println("Meenu gets "+coin+" coins");
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}


}
