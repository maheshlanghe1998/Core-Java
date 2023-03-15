package com.string.assignment.customerexistence;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String name = sc.next();
		
		System.out.println("Enter the panno: ");
		String pan = sc.next();
		
		System.out.println("Enter the emailid: ");
		String mail = sc.next();
		
		System.out.println("Enter the salary: ");
		int sal =sc.nextInt();
		
		System.out.println("Enter the name: ");
		String name2 = sc.next();
		
		System.out.println("Enter the panno: ");
		String pan2 = sc.next();
		
		System.out.println("Enter the emailid: ");
		String mail2 = sc.next();
		
		System.out.println("Enter the salary: ");
		int sal2 =sc.nextInt();
		
		Customer obj1 = new Customer(name,pan,mail,sal);
		
		Customer obj2 = new Customer(name2,pan2,mail2,sal2);
		
		if((obj1.getPanno().equals(obj2.getPanno())) && (obj1.getEmailid().equals(obj2.getEmailid())))
		{
			System.out.println("Both objects are equal");
		}
		else
		{
			System.out.println("Both objects are not equal");
		}
		
	}

}
