package com.string.classprograms;

import java.util.Scanner;

public class VowelsWithSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		System.out.print("The vowels are: ");
		for( char c: ch)
		{
			switch(c)
			{
			case'a':
			case'i':
			case'o':
			case'u':
			case'e':
			count++;
			System.out.print(c+" ");	
			}
		}
		
		System.out.println("\nThe no. of Vowels: "+count);
		}

}
