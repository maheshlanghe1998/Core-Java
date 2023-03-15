package com.basics;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("May i know your Name: ");
		String s=sc.nextLine();
		
		System.out.println("Welcome "+s);
	}

}
