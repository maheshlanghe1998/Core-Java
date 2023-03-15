package com.string.assignment;

import java.util.Scanner;

public class CelciusToFarenheit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input:");
		double c=sc.nextDouble();
		 double f = ((9 * c)/5)+32;
		 System.out.println(f);
	}

}
