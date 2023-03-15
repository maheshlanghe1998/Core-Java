package com.string.assignment;

import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the salary ");
		int salary = sc.nextInt();
		
		System.out.println("Enter the Performance appraisal rating ");
		float rating =sc.nextFloat();
		
		if(salary>0 && (rating>1 && rating<5))
		{
			if(rating>=1 && rating<=3)
			{
				salary = (int) (salary+(salary*0.10));
				System.out.println(salary);
				
			}
			else if(rating>=3.1 && rating<=4)
			{
				salary = (int) (salary+(salary*0.25));
				System.out.println(salary);
				
			}
			else if(rating>=4.1 && rating<=5)
			{
				salary = (int) (salary+(salary*0.30));
				System.out.println(salary);
				
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

	}

}
