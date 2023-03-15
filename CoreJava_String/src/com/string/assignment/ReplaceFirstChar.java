package com.string.assignment;

import java.util.Scanner;

public class ReplaceFirstChar {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character to be searched:");
		String search =sc.nextLine();
		System.out.println("Enter the character to replace:");
		String replace =sc.nextLine();
        
		if(str.contains(search))
		{
			System.out.println(str.replaceFirst(search, replace));
		}
		else
		{
			System.out.println("character not found");
		}
	}

}
