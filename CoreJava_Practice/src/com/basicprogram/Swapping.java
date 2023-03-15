package com.basicprogram;

import java.util.*;

public class Swapping {
	public static void main(String args[]) {

		int a, b, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value: ");
		a = sc.nextInt();
		System.out.println("Enter 2nd value: ");
		b = sc.nextInt();

		// Swapping using 3rd variable:
		System.out.println("Values before Swapping: " + "First Value " + a + " Second Value " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Values After Swapping: " + " First Value " + a + " Second Value " + b);

		// Swapping without using 3rd variable:
		System.out.println("Values before Swapping: " + "First Value " + a + " Second Value " + b);
		a = a + b; // 10+20=30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20
		System.out.println("Values After Swapping: " + " First Value " + a + " Second Value " + b);

	}
}
