package com.string.assignment;

import java.util.Scanner;

public class TriangleValidation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the value for side1: ");
		int side1 = sc.nextInt();
		System.out.println("Enter the value for side2: ");
		int side2 = sc.nextInt();
		System.out.println("Enter the value for side3: ");
		int side3 = sc.nextInt();
		
		if(side1>0 && side2>0 && side3>0)
		{
			if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1)
			{
				System.out.println("Sides form a Triangle");
			}
			else
			{
				System.out.println("Sides does not form a Triangle");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
